package com.codegym.service;


import com.codegym.model.CategoryBlog;
import java.util.List;


public interface ICategoryService {
    List<CategoryBlog> displayCategoryBlog();

    void save(CategoryBlog categoryBLog);

    void update(CategoryBlog categoryBLog);

    CategoryBlog displayCategoryBlogFindById(Integer id);

    void delete(Integer id);

}
