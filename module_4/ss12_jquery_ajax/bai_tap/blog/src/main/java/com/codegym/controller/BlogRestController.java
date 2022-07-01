package com.codegym.controller;


import com.codegym.model.Blog;

import com.codegym.service.IBlogService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RequestMapping(value = "/home")
@RestController
@CrossOrigin
public class BlogRestController {

    @Autowired
    private IBlogService iBlogService;


    @GetMapping(value = "/list-blog")
    public ResponseEntity<Page<Blog>> getPageBlog(@PageableDefault(value = 5)Pageable pageable) {
        Page<Blog> blogPage = this.iBlogService.displayAllBlog(pageable);

        if (!blogPage.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogPage,HttpStatus.OK);
    }



    @GetMapping(value = "/search-blog/{name}")
    public ResponseEntity<Page<Blog>> searchByNameBlog(@PathVariable String name, Pageable pageable){
        Page<Blog> blog = this.iBlogService.searchAllByContentBlog(name, pageable);
        if(!blog.hasContent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }
}
