package com.codegym.controller;

import com.codegym.repository.ILibaryBookRepository;
import com.codegym.repository.IBorrowBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class BookController {
@Autowired
private ILibaryBookRepository iLibaryBookRepository;
@Autowired
private IBorrowBookRepository iBorrowBookRepository;

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("book",iLibaryBookRepository.displayAllBook());

        return "home";
    }

    @GetMapping("/detail")
    public String detail(Model model){
        model.addAttribute("borrow",iBorrowBookRepository.displayAllBorrowBook());
        return "detail";
    }
}
