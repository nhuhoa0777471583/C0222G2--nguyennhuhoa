package com.codegym.service;


import com.codegym.model.CategoryBlog;
import com.codegym.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<CategoryBlog> displayCategoryBlog() {
        return iCategoryRepository.displayCategoryBlog();
    }

    @Override
    public void save(CategoryBlog categoryBLog) {
        this.iCategoryRepository.save(categoryBLog);
    }

    @Override
    public void update(CategoryBlog categoryBLog) {
        this.iCategoryRepository.save(categoryBLog);
    }

    @Override
    public CategoryBlog displayCategoryBlogFindById(Integer id) {
        return iCategoryRepository.displayCategoryBlogFindById(id);
    }

    @Override
    public void delete(Integer id) {
        this.iCategoryRepository.deleteById(id);
    }
}
