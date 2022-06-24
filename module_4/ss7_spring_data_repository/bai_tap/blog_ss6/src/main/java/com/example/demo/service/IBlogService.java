package com.example.demo.service;



import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> displayAll();

    void save(Blog blog);

    void update(Blog blog);

    Blog displayAllById(Integer id);

    void delete(Integer id);

//    Page<Blog> displayAllBlog(Pageable pageable);
//
//
//    Page<Blog>findAllByContentBlogContaining(String name, Pageable pageable);
//
    Page<Blog>displayAllByContentBlog(String name, Pageable pageable);
}
