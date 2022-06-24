package com.example.demo.service;


import com.example.demo.model.Blog;
import com.example.demo.repository.IBlogRepository;
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
        return iBlogRepository.displayAll();
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public Blog displayAllById(Integer id) {
        return iBlogRepository.displayAllById(id);
    }


    @Override
    public void delete(Integer id) {
        this.iBlogRepository.deleteById(id);
    }

//    @Override
//    public Page<Blog> displayAllBlog(Pageable pageable) {
//        return this.iBlogRepository.displayAllBlog(pageable);
//    }
//
//
//
//
//
//    @Override
//    public Page<Blog> findAllByContentBlogContaining(String name, Pageable pageable) {
//        return this.iBlogRepository.findAllByContentBlogContaining(name,pageable);
//    }

    @Override
    public Page<Blog> displayAllByContentBlog(String name, Pageable pageable) {
        return this.iBlogRepository.displayAllByContentBlog(name, pageable);
    }
}
