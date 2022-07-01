package com.codegym.controller;

import com.codegym.model.BorrowBook;
import com.codegym.model.LibaryBook;
import com.codegym.repository.ICountRepository;
import com.codegym.service.IBorrowBookService;
import com.codegym.service.ILibaryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/home")
public class BookController {
    @Autowired
    private ILibaryBookService iLibaryBookService;
    @Autowired
    private IBorrowBookService iBorrowBookService;
@Autowired
private ICountRepository iCountRepository;
    @GetMapping("")
    public String home(Model model) {

        model.addAttribute("book", iLibaryBookService.displayAllBook());
        model.addAttribute("count", iCountRepository.displayCount());
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

    @GetMapping("/borrow-book/{id}")
    public String borrowBook(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) throws Exception {
        List<BorrowBook> borrowBook = this.iBorrowBookService.displayById(id);
        for (BorrowBook borr : borrowBook) {
            if (borr.getStatus() == 1) {
                borr.setStatus(0);
                this.iBorrowBookService.save(borr);
                LibaryBook libaryBook = this.iLibaryBookService.displaybyId(borr.getLibaryBook().getId());
                libaryBook.setAmount(libaryBook.getAmount() - 1);
                this.iLibaryBookService.save(libaryBook);
                redirectAttributes.addFlashAttribute("mess", "mượn thành công");
                return "redirect:/home";
            }
        }
      throw new Exception();
    }


    @GetMapping("/return/{id}")
    public String returnBook(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("borrow", iBorrowBookService.displayById(id));
        return "return";
    }

    @GetMapping("/return-book/{id}")
    public String returnBook1(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes) throws Exception {
        List<BorrowBook> borrowBook = this.iBorrowBookService.displayById(id);
        for (BorrowBook borr : borrowBook) {
            if (borr.getStatus() == 0) {
                borr.setStatus(borr.getStatus() + 1);
                this.iBorrowBookService.save(borr);
                LibaryBook libaryBook = this.iLibaryBookService.displaybyId(borr.getLibaryBook().getId());
                libaryBook.setAmount(libaryBook.getAmount() + 1);
                this.iLibaryBookService.save(libaryBook);
                redirectAttributes.addFlashAttribute("mess", "trả thành công");
                return "redirect:/home";
            }
        }
       throw new Exception();
    }

    @ExceptionHandler(Exception.class)
    public String borrowBookError(){
        return "error_borrow";
    }
}
