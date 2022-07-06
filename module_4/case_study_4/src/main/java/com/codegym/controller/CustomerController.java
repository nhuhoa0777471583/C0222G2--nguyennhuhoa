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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping("/home")
    public String view(Model model,
                       @PageableDefault(value = 4) Pageable pageable) {

        model.addAttribute("customer", iCustomerService.findAll(pageable));
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


    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("customer", iCustomerService.displayAllById(id));
        model.addAttribute("customerType", iCustomerTypeService.displayAllCustomerType());
        return "/customer/edit";
    }



}
