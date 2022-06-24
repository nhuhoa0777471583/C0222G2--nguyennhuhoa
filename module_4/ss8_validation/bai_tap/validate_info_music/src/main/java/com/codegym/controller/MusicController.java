package com.codegym.controller;


import com.codegym.model.Music;
import com.codegym.dto.MusicDto;
import com.codegym.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("music", iMusicService.displayAllMusic());
        return "list";
    }


    @GetMapping("/create")
    public String showForm(Model model) {
        model.addAttribute("musicDto", new MusicDto());
        return "form";
    }

    @PostMapping("/save")
    public String saveMusic(@ModelAttribute @Valid MusicDto musicDto,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        Music music = new Music();
        BeanUtils.copyProperties(musicDto, music);
        iMusicService.save(music);
        redirectAttributes.addFlashAttribute("message","Add successfully!!");
        return "redirect:/music";
    }


}
