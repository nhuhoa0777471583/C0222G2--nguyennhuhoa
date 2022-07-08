package com.codegym.controller;

import com.codegym.model.contract.Contract;
import com.codegym.model.contract.ContractDetail;
import com.codegym.service.contract.IAttachFacilityService;
import com.codegym.service.contract.IContractDetailService;
import com.codegym.service.contract.IContractService;
import com.codegym.service.customer.ICustomerService;
import com.codegym.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractDetailService iContractDetailService;
    @Autowired
    private IContractService iContractService;
    @Autowired
    private IAttachFacilityService iAttachFacilityServicel;
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private IFacilityService iFacilityService;

    @GetMapping("/home")
    public String view(Model model,
                       @PageableDefault(value = 4) Pageable pageable) {
        model.addAttribute("contractPage",
                this.iContractService.findAll(pageable));
        model.addAttribute("contractDetail", this.iContractDetailService.displayAll());
        model.addAttribute("attachFacility", this.iAttachFacilityServicel.displayAll());
        model.addAttribute("contract", new Contract());

        return "/contract/list";
    }


    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("facility", this.iFacilityService.findAll());
        model.addAttribute("customer", this.iCustomerService.findAll());
        model.addAttribute("contractDetail", new ContractDetail());
        model.addAttribute("attachFacility", this.iAttachFacilityServicel.displayAll());

        return "/contract/create";
    }


    @PostMapping("/save")
    public String save(Contract contract, RedirectAttributes redirectAttributes) {
        this.iContractService.save(contract);
        redirectAttributes.addFlashAttribute("msg", "Add new contract successfully!!");
        return "redirect:/contract/home";
    }


    @PostMapping("delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        this.iContractService.delete(id);
        redirectAttributes.addFlashAttribute("msg", "Delete contract successfully!!");
        return "/contract/create";

    }

}
