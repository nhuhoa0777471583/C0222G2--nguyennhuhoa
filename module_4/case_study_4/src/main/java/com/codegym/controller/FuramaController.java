package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuramaController {

    @GetMapping("/home")
    public String view(){
        return "index";
    }

//    @GetMapping("/view")
//    public String layout(){
//        return "customer/list";
//    }
}
