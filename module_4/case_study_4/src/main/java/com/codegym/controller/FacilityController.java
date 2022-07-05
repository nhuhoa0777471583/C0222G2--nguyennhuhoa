package com.codegym.controller;


import com.codegym.model.facility.Facility;
import com.codegym.service.facility.IFacilityService;
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
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private IFacilityService iFacilityService;

    @GetMapping("/home")
    public String view(Model model,
                       @PageableDefault(value = 5) Pageable pageable,
                       @RequestParam Optional<String> nameSearch) {
        String nameSearchVal = nameSearch.orElse("");
        model.addAttribute("facility", iFacilityService.displayAll("%" + nameSearchVal + "+", pageable));
        model.addAttribute("nameSearchVal", nameSearchVal);
        return "/facility/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("facility", new Facility());
        model.addAttribute("facilityType", iFacilityService.displayAllFacilityType());
        model.addAttribute("rentType",iFacilityService.displayAllRentType());
        return "/facility/create";
    }
    @PostMapping("/save")
    public String save(Facility facility, RedirectAttributes redirectAttributes){
        this.iFacilityService.save(facility);
        redirectAttributes.addFlashAttribute("msg","create facility successfully!!");
        return "redirect:/facility/home";
    }

    @GetMapping("/edit")
    public String edit(Model model){
        model.addAttribute("facility", new Facility());
        model.addAttribute("facilityType", iFacilityService.displayAllFacilityType());
        model.addAttribute("rentType",iFacilityService.displayAllRentType());
        return "/facility/edit";
    }

}
