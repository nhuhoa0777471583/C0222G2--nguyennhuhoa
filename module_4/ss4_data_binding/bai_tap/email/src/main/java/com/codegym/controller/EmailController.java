package com.codegym.controller;


import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class EmailController {

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("email",new Email());
        return "home";
    }

    @PostMapping("/update")
    public String updateEmail(@ModelAttribute Email email,
                              Model model){
        model.addAttribute("e",email);
        return "home";
    }
}
