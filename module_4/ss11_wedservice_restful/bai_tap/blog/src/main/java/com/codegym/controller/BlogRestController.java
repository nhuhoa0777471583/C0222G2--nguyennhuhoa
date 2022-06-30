package com.codegym.controller;


import com.codegym.model.Blog;
import com.codegym.model.CategoryBlog;
import com.codegym.service.IBlogService;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RequestMapping(value = "/home")
@RestController
public class BlogRestController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping(value = "/list-blog")
    public ResponseEntity<List<Blog>> getListBlog() {
        List<Blog> blogList = this.iBlogService.displayAll();

        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }


    @GetMapping(value = "/list-category")
    public ResponseEntity<List<CategoryBlog>> getListCategory() {
        List<CategoryBlog> categoryBlogList = this.iCategoryService.displayCategoryBlog();
        if (categoryBlogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categoryBlogList, HttpStatus.OK);
    }

    @GetMapping(value = "/blog/{id}")
    public ResponseEntity<Blog> findBlogById(@PathVariable Integer id) {
        Blog b = this.iBlogService.displayAllById(id);
        if (b.getId() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(b,HttpStatus.OK);
    }

    @GetMapping(value = "/category/{id}")
    public ResponseEntity<CategoryBlog> findCategoryBlogById(@PathVariable Integer id) {
        CategoryBlog categoryBlog = this.iCategoryService.displayCategoryBlogFindById(id);
        if (categoryBlog.getId() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categoryBlog,HttpStatus.OK);
    }


    






}
