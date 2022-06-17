package com.codegym.controller;


import com.codegym.model.Declaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class DeclarationController {

    @GetMapping("")
    public String show(Model model){
        model.addAttribute("declaration", new Declaration());
        return "home";
    }
}
