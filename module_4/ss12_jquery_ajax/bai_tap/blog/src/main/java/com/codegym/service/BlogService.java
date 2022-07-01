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
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public Blog displayAllById(Integer id) {
        return null;
    }


    @Override
    public void delete(Integer id) {
        this.iBlogRepository.deleteById(id);
    }




    @Override
    public Page<Blog> displayAllBlog(Pageable pageable) {
        return this.iBlogRepository.displayAllBlog(pageable);
    }

    @Override
    public Page<Blog> searchAllByContentBlog(String name, Pageable pageable) {
        return this.iBlogRepository.searchAllByContentBlog(name, pageable);
    }
//
//
//
//
//
//    @Override
//    public Page<Blog> findAllByContentBlogContaining(String name, Pageable pageable) {
//        return this.iBlogRepository.findAllByContentBlogContaining(name,pageable);
//    }


}
