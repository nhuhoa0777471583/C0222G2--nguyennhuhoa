package com.example.demo.service;


import com.example.demo.model.CategoryBlog;

import java.util.List;

public interface ICategoryService {
    List<CategoryBlog> displayCategoryBlog();

    void save(CategoryBlog categoryBLog);

    void update(CategoryBlog categoryBLog);

    CategoryBlog displayCategoryBlogFindById(Integer id);

    void delete(Integer id);

}
