package com.codegym.controller;

import com.codegym.model.UploadSong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/home")
public class UploadSongController {

    @GetMapping("/")
    public String show(Model model) {
        model.addAttribute("upload", new UploadSong());
        return "list_upload";
    }

    @PostMapping("update")
    public String listUploadSong(@ModelAttribute UploadSong upload,
                                 Model model,
                                 RedirectAttributes redirectAttributes) {
        model.addAttribute("upload", upload);
        redirectAttributes.addFlashAttribute("message","upload thành công");
//        return "redirect:/home/";
        return "list_upload";
    }

}
