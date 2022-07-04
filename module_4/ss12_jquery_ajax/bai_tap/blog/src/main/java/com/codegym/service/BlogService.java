package com.codegym.service;



import com.codegym.model.Blog;
import com.codegym.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public List<Blog> displayAll() {
        return null;
    }

    @Override
    public Page<Blog> displayAllBlog(Pageable pageable) {
        return this.iBlogRepository.displayAllBlog(pageable);
    }

    @Override
    public Page<Blog> searchAllByContentBlog(String nameSearch, Pageable pageable) {
        return this.iBlogRepository.searchAllByContentBlog(nameSearch, pageable);
    }

    @Override
    public Page<Blog> findAllByContentBlogContaining(String nameSearch, Pageable pageable) {
        return iBlogRepository.findAllByContentBlogContaining(java.util.Optional.ofNullable(nameSearch),pageable);
    }


}
