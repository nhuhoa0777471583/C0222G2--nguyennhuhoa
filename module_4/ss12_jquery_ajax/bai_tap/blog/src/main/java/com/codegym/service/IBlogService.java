package com.codegym.service;



import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> displayAll();


//    Blog searchByContentBlog(String name);


    Page<Blog> displayAllBlog(Pageable pageable);

    Page<Blog> searchAllByContentBlog(String nameSearch,Pageable pageable);

    Page<Blog>findAllByContentBlogContaining(String nameSearch, Pageable pageable);

}
