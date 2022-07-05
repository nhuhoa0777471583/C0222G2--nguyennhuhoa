package com.codegym.controller;


import com.codegym.model.customers.Customer;
import com.codegym.service.customer.ICustomerService;
import com.codegym.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
                       @PageableDefault(value = 5) Pageable pageable,
                       @RequestParam Optional<String> nameSearch) {
        String nameSearchVal = nameSearch.orElse("");
        model.addAttribute("customer", iCustomerService.displayCustomer("%" + nameSearchVal + "+", pageable));
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
        iCustomerService.create(customer);
        redirectAttributes.addFlashAttribute("msg", "Create customer successfully!!");
        return "redirect:/customer/home";
    }
}
