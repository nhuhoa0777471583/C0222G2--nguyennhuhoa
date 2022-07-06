package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contract")
public class ContractController {

    @GetMapping("/home")
    public String view(){
        return "/contract/list";
    }


    @GetMapping("/create")
    public String create(){
        return "/contract/create";
    }
}
