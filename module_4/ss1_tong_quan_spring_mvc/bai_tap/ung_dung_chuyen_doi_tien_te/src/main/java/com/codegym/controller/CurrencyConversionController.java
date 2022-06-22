package com.codegym.controller;

import com.codegym.service.ICurrecyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversionController {
    @Autowired
    private ICurrecyService iCurrecyService;

    @GetMapping(value = "/currency")
    public String currencyConversionView() {
        return "result";
    }


    @GetMapping(value = "/result")
    public String currencyConversion(@RequestParam int usd,
                                     @RequestParam int rate,
                                     Model model) {
        double vnd = this.iCurrecyService.count(usd, rate) ;
        model.addAttribute("vnd", vnd);
        model.addAttribute("rate", rate);
        model.addAttribute("usd", usd);
        return "result";
    }


}
