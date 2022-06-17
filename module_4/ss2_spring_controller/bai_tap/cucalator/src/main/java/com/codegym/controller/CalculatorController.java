package com.codegym.controller;

import com.codegym.service.CalculationService;
import com.codegym.service.ICalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class CalculatorController {

    @Autowired
    private ICalculationService iCalculationService;

    @GetMapping("")
    public String showCucaltor() {
        return "index";
    }


    @PostMapping("/calculator")
    public String returnResult(@RequestParam Double number1,
                               @RequestParam Double number2,
                               @RequestParam String calculation,
                               Model model) {
        Double result = this.iCalculationService.calculation(number1,number2,calculation);

        model.addAttribute("result", result);
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        return "index";
    }


}
