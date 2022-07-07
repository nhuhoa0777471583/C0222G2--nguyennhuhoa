package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.service.IMusicService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private IMusicService iMusicService;

    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("music", this.iMusicService.findAll());
        return "view";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/save")
    private String update(Music music, RedirectAttributes redirectAttributes) {
        iMusicService.save(music);
        redirectAttributes.addFlashAttribute("message", "Create product successfully!");
        return "redirect:/music";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {
        model.addAttribute("music", iMusicService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String updateMusic(Music music, RedirectAttributes redirectAttributes) {
        iMusicService.update(music);
        redirectAttributes.addFlashAttribute("message", "Update product successfully!");
        return "redirect:/music";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable Integer id, Model model) {
        model.addAttribute("music", iMusicService.findById(id));
        return "delete";
    }


    @PostMapping("/delete")
    public String delete(Music music, RedirectAttributes redirectAttributes) {
        iMusicService.delete(music.getId());
        redirectAttributes.addFlashAttribute("message", "Remove product successfully!");
        return "redirect:/music";
    }



}
