package com.codegym.controller;

import com.codegym.dto.UserDto;
import com.codegym.model.User;
import com.codegym.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/user")
    public String showCreate(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "form";
    }

    @PostMapping("/save")
    public String createForm(@ModelAttribute @Valid UserDto userDto,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        User user1 = new User();
        BeanUtils.copyProperties(userDto, user1);
        iUserService.save(user1);
        return "result";

    }

}
