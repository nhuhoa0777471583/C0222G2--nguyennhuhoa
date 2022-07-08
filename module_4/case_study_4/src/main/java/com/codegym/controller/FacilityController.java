package com.codegym.controller;


import com.codegym.model.facility.Facility;
import com.codegym.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private IFacilityService iFacilityService;

    @GetMapping("/home")
    public String view(Model model, @RequestParam Optional<String> nameSearch,
                       @PageableDefault(value = 4) Pageable pageable) {
        String nameSearchVal = nameSearch.orElse("");
        model.addAttribute("facility",
                this.iFacilityService.displayAllAndDisplayByName("%" + nameSearchVal + "%", pageable));
        model.addAttribute("nameSearchVal", nameSearchVal);
        return "facility/list";
    }


    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("facility", new Facility());
        model.addAttribute("facilityType", iFacilityService.displayAllFacilityType());
        model.addAttribute("rentType", iFacilityService.displayAllRentType());
        return "/facility/create";
    }

    @PostMapping("/save")
    public String save(Facility facility, RedirectAttributes redirectAttributes) {
        this.iFacilityService.save(facility);
        redirectAttributes.addFlashAttribute("msg", "Add new facility successfully!!");
        return "redirect:/facility/home";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("facility", iFacilityService.displayById(id));
        model.addAttribute("facilityType", iFacilityService.displayAllFacilityType());
        model.addAttribute("rentType", iFacilityService.displayAllRentType());
        return "/facility/edit";
    }

    @PostMapping("/update")
    public String update(Facility facility, RedirectAttributes redirectAttributes) {
        this.iFacilityService.save(facility);
        redirectAttributes.addFlashAttribute("msg", "Update facility successfully!!");
        return "redirect:/facility/home";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        this.iFacilityService.deleteById(id);
        redirectAttributes.addFlashAttribute("msg", "Delete facility successfully");
        return "redirect:/facility/home";
    }
}
