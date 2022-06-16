package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/spice")
public class SpiceController {

 @GetMapping("")
 public String displayListSpice(){
     return "index";
 }

    @GetMapping("/list")
    public String spiceSandwich(@RequestParam("spice") String[] spice,
                                Model model){
     model.addAttribute("spice",spice);
        return "index";
    }
}
