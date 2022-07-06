package com.codegym.controller;

import com.codegym.model.employee.Employee;
import com.codegym.service.employee.IEmployeeService;
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
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/home")
    public String view(Model model, @PageableDefault(value = 4) Pageable pageable) {
        model.addAttribute("employee", this.iEmployeeService.findAll(pageable));
        return "/employee/list";
    }


    @PostMapping("/save")
    public String save(Employee employee, RedirectAttributes redirectAttributes) {
        this.iEmployeeService.save(employee);
        redirectAttributes.addFlashAttribute("msg", "create employee successfully!!");
        return "redirect:/employee/home";
    }

    @GetMapping("/update")
    public String update() {
        return "redirect:/employee/home";
    }
    @GetMapping("/delete")
    public String delete(){
        return "redirect:/employee/home";
    }

}
