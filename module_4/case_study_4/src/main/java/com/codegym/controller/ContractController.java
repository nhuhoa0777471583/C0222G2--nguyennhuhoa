package com.codegym.controller;

import com.codegym.model.contract.Contract;
import com.codegym.model.contract.ContractDetail;
import com.codegym.model.employee.Employee;
import com.codegym.service.contract.IAttachFacilityService;
import com.codegym.service.contract.IContractDetailService;
import com.codegym.service.contract.IContractService;
import com.codegym.service.customer.ICustomerService;
import com.codegym.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@CrossOrigin
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
                       @PageableDefault(value = 4) Pageable pageable,
                       @RequestParam Optional<String> nameSearch) {
        String nameSearchVal = nameSearch.orElse("");
        model.addAttribute("contractPage",
                this.iContractService.findAllByDepositContaining("%" + nameSearchVal + "%", pageable));
        model.addAttribute("nameSearchVal", nameSearchVal);

        model.addAttribute("contractDetaiAllList", this.iContractDetailService.displayAll());
        model.addAttribute("attachFacility", this.iAttachFacilityServicel.displayAll());
        model.addAttribute("contract", new Contract());
        model.addAttribute("contractDetail", new ContractDetail());

        return "/contract/list";
    }

    @PostMapping("/saveContractDetail")
    public String saveContractDetail(@ModelAttribute ContractDetail contractDetail, RedirectAttributes redirectAttributes) {
        List<ContractDetail> contractDetailList = this.iContractDetailService.displayAll();
        for (ContractDetail c : contractDetailList) {
            if (c.getAttachFacility().getId().equals(contractDetail.getAttachFacility().getId())) {
                c.setQuantity(c.getQuantity() + contractDetail.getQuantity());
                this.iContractDetailService.save(c);
                redirectAttributes.addFlashAttribute("msg", "số lượng dịch vụ đi kèm được tăng thêm");
                return "redirect:/contract/home";
            }
        }
        this.iContractDetailService.save(contractDetail);
        redirectAttributes.addFlashAttribute("msg", "Add new contract successfully!!");
        return "redirect:/contract/home";
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
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        this.iContractService.deleteById(id);
        redirectAttributes.addFlashAttribute("msg", "Delete contract successfully!!");
        return "redirect:/contract/home";

    }

}
