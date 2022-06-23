package com.example.demo.controller;


import com.example.demo.model.Blog;
import com.example.demo.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class BlogController {

  @Autowired
  private IBlogService iBlogService;


    @GetMapping("")
    public String view(Model model) {
        model.addAttribute("blog", iBlogService.displayAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String create(Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Create successfuly");
        return "redirect:/blog";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", iBlogService.displayAllById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Blog blog, RedirectAttributes re) {
        iBlogService.update(blog);
        re.addFlashAttribute("message", "Update successfuly");
        return "redirect:/blog";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", iBlogService.displayAllById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog, RedirectAttributes re) {
        iBlogService.delete(blog.getId());
        re.addFlashAttribute("message", "Remove successfuly");
        return "redirect:/blog";
    }
    @GetMapping("/view/{id}")
    public String displayById(@PathVariable Integer id, Model model){
        model.addAttribute("blog", iBlogService.displayAllById(id));
        return "detail";
    }


}
