package com.codegym.controller;



import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("category", iCategoryService.displayCategoryBlog());
        return "blog/create";
    }
//
//    @PostMapping("/save")
//    public String create(Blog blog, RedirectAttributes redirectAttributes) {
//        iBlogService.save(blog);
//        redirectAttributes.addFlashAttribute("message", "Create successfuly");
//        return "redirect:/blog";
//    }
//
//
//    @GetMapping("/edit/{id}")
//    public String showEdit(@PathVariable Integer id, Model model) {
//        model.addAttribute("blog", iBlogService.displayAllById(id));
//        return "blog/edit";
//    }
//
//    @PostMapping("/update")
//    public String update(Blog blog, RedirectAttributes re) {
//        iBlogService.update(blog);
//        re.addFlashAttribute("message", "Update successfuly");
//        return "redirect:/blog";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String showDelete(@PathVariable Integer id, Model model) {
//        model.addAttribute("blog", iBlogService.displayAllById(id));
//        return "blog/delete";
//    }
//
//    @PostMapping("/delete")
//    public String delete(Blog blog, RedirectAttributes re) {
//        iBlogService.delete(blog.getId());
//        re.addFlashAttribute("message", "Remove successfuly");
//        return "redirect:/blog";
//    }
//
//    @GetMapping("/view/{id}")
//    public String displayById(@PathVariable Integer id, Model model) {
//        model.addAttribute("blog", iBlogService.displayAllById(id));
//        return "blog/detail";
//    }
}
