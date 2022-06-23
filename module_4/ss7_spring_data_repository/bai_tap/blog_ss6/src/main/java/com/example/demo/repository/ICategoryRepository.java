package com.example.demo.repository;


import com.example.demo.model.CategoryBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryBlog, Integer> {

    @Query(value = " select * from category_blog ", nativeQuery = true)
    List<CategoryBlog> displayCategoryBlog();

    @Query(value = " select * from category_blog where id = :id", nativeQuery = true)
    CategoryBlog displayCategoryBlogFindById(@Param("id") Integer id);
}
