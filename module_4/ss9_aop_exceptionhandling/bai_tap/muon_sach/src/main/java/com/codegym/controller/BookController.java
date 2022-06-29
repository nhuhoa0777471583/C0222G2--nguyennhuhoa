package com.codegym.controller;

import com.codegym.repository.ILibaryBookRepository;
import com.codegym.repository.IBorrowBookRepository;
import com.codegym.service.IBorrowBookService;
import com.codegym.service.ILibaryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class BookController {
    @Autowired
    private ILibaryBookService iLibaryBookService;
    @Autowired
    private IBorrowBookService iBorrowBookService;

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("book", iLibaryBookService.displayAllBook());
        return "home";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("borrow", iBorrowBookService.displayByIdBook(id));
        return "detail";
    }

    @GetMapping("/borrow/{id}")
    public String borrow(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("borrow", iBorrowBookService.displayById(id));
        return "borrow";
    }

    @GetMapping("/return/{id}")
    public String returnBook(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("borrow", iBorrowBookService.displayById(id));
        return "return";
    }

}
