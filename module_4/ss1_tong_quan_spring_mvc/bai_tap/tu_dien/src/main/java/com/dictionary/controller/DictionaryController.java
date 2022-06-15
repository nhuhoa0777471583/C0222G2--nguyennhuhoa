package com.dictionary.controller;


import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @Autowired
    private IDictionaryService iDictionaryService;

    @GetMapping(value = "/dictionary")
    public String dictionaryView() {
        return "dictionary";
    }


    @GetMapping(value = "/result")
    public String dictionary(@RequestParam String e, Model model) {

        String vn = this.iDictionaryService.dictionary(e);
        model.addAttribute("vn",vn);
        model.addAttribute("e",e);
        return "dictionary";
    }


}
