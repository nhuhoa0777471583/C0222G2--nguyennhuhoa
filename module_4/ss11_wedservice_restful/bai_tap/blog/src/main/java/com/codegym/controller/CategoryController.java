package com.codegym.controller;



import com.codegym.model.CategoryBlog;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("category", iCategoryService.displayCategoryBlog());
        return "category/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("category", new CategoryBlog());
        return "blog/create";
    }

    @PostMapping("/save")
    public String create(CategoryBlog categoryBlog, RedirectAttributes redirectAttributes) {
        iCategoryService.save(categoryBlog);
        redirectAttributes.addFlashAttribute("message", "Create category successfuly");
        return "redirect:/blog";
    }


    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {
        model.addAttribute("category", iCategoryService.displayCategoryBlogFindById(id));
        return "blog/edit";
    }

    @PostMapping("/update")
    public String update(CategoryBlog categoryBlog, RedirectAttributes redirectAttributes) {
        iCategoryService.update(categoryBlog);
        redirectAttributes.addFlashAttribute("message", "Update category successfuly");
        return "redirect:/category";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable Integer id, Model model) {
        model.addAttribute("category", iCategoryService.displayCategoryBlogFindById(id));
        return "blog/delete";
    }

    @PostMapping("/delete")
    public String delete(CategoryBlog categoryBlog, RedirectAttributes redirectAttributes) {
        iCategoryService.delete(categoryBlog.getId());
        redirectAttributes.addFlashAttribute("message", "Remove category successfuly");
        return "redirect:/category";
    }

}
