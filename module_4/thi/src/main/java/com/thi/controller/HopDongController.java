package com.thi.controller;

import com.thi.dto.HopDongDTO;
import com.thi.model.HopDong;
import com.thi.service.IHopDongService;
import com.thi.service.IPhongTroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/contract")
public class HopDongController {
    @Autowired
    private IHopDongService iHopDongService;

    @Autowired
    private IPhongTroService iPhongTroService;

    @GetMapping("/home")
    public String view(Model model) {
        model.addAttribute("hopDong", this.iHopDongService.findAll());
        model.addAttribute("phongTroList", this.iPhongTroService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("hopDongDTO", new HopDong());
        model.addAttribute("phongTroList", this.iPhongTroService.findAll());

        return "create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute HopDongDTO hopDongDTO, BindingResult bindingResult,
                       RedirectAttributes redirectAttributes, Model model) {
        if (!bindingResult.hasErrors()) {
            HopDong hopDong = new HopDong();
            BeanUtils.copyProperties(hopDongDTO, hopDong);
            this.iHopDongService.save(hopDong);
            model.addAttribute("phongTroList", this.iPhongTroService.findAll());
            redirectAttributes.addFlashAttribute("msg", "thêm mới thành công!!");
            return "redirect:/contract/home";
        } else {
            return "create";
        }
    }
//
//    @PostMapping("/save")
//    public String save(HopDong hopDong,RedirectAttributes redirectAttributes){
//        this.iHopDongService.save(hopDong);
//        redirectAttributes.addFlashAttribute("msg", "thêm mới thành công!!");
//        return "redirect:/contract/home";
//    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        this.iHopDongService.delete(id);
        redirectAttributes.addFlashAttribute("msg", "xóa thành công");
        return "redirect:/contract/home";
    }
}
