package com.codegym.controller;


import com.codegym.model.Product;
import com.codegym.repository.impl.ProductRepository;
import com.codegym.service.IProductService;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private  IProductService iProductService ;

    @GetMapping("")
    public String index(Model model) {
        List<Product> products = iProductService.findAll();
        model.addAttribute("products", products);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("products", new Product());
        return "create";
    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        iProductService.save(product);
            redirectAttributes.addFlashAttribute("message", "Create product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable Integer id, Model model) {
        model.addAttribute("products", iProductService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String editProduct(Product product, RedirectAttributes redirectAttributes) {
        iProductService.update(product);
        redirectAttributes.addFlashAttribute("message", "Update product successfully");
        return "redirect:/product";
    }


    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        iProductService.delete(product.getId());
        redirect.addFlashAttribute("message", "Removed customer successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String displayListProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "view";
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam String nameSearch, Model model) {
        model.addAttribute("nameSearch",nameSearch);
        model.addAttribute("products", iProductService.searchByName(nameSearch));
        return "index";
    }
}
