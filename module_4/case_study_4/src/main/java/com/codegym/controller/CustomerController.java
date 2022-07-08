package com.codegym.controller;


import com.codegym.model.customers.Customer;
import com.codegym.service.customer.ICustomerService;
import com.codegym.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping("/home")
    public String view(Model model,
                       @RequestParam Optional<String> nameSearch,
                       @PageableDefault(value = 4) Pageable pageable) {
        String nameSearchVal = nameSearch.orElse("");
        model.addAttribute("customer",
                iCustomerService.displayAllAndDisplayByNameSearch("%" + nameSearchVal + "%", pageable));
        model.addAttribute("nameSearchVal", nameSearchVal);
        return "/customer/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerType", iCustomerTypeService.displayAllCustomerType());
        return "/customer/create";
    }

    @PostMapping("/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes) {
        iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("msg", "Add new customer successfully!!");
        return "redirect:/customer/home";
    }


    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("customer", iCustomerService.displayAllById(id));
        model.addAttribute("customerType", iCustomerTypeService.displayAllCustomerType());
        return "/customer/edit";
    }

    @PostMapping("/update")
    public String update(Customer customer, RedirectAttributes redirectAttributes) {
        this.iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("msg", "Update customer successfully!!");
        return "redirect:/customer/home";


    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        this.iCustomerService.delete(id);
        redirectAttributes.addFlashAttribute("msg", "Delete customer successfully!!");
        return "redirect:/customer/home";
    }


}
