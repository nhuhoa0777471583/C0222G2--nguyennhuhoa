package com.codegym.controller;

import com.codegym.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("shop")
public class ProductController {
    @Autowired
    private IShopService iShopService;

    @GetMapping("")
    public String viewShop(Model model) {
        model.addAttribute("shop", iShopService.displayAll());
        return "shop";
    }
//    @GetMapping("/cart/{id}")
//    public String cart(Model model){
//        model.addAttribute()
//    }
}
