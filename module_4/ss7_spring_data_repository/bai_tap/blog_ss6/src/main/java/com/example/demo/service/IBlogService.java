package com.example.demo.service;



import com.example.demo.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> displayAll();

    void save(Blog blog);

    void update(Blog blog);

    Blog displayAllById(Integer id);

    void delete(Integer id);
}
