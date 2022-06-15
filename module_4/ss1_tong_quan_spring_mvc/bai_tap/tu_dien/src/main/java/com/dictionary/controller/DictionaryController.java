package com.dictionary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DictionaryController {

    @GetMapping(value = "/dictionary")
    public String dictionaryView(){
        return "dictionary";
    }



}
