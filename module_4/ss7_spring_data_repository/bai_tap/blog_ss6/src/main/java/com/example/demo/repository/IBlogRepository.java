package com.example.demo.repository;


import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = " select * from blog ", nativeQuery = true)
    List<Blog> displayAll();

    @Query(value = " select * from blog where id = :keywork", nativeQuery = true)
    Blog displayAllById(@Param("keywork") Integer id);


//    @Query(value = " select * from blog " ,nativeQuery=true)
//    Page<Blog> displayAllBlog(Pageable pageable);

    @Query(value = " select * from blog  where content_blog like :keyword ", nativeQuery = true,
            countQuery = " select count(*)  from ( select * from blog  where content_blog like :keyword ) temp")
    Page<Blog> displayAllByContentBlog(@Param("keyword") String name, Pageable pageable);


//    @Query(value = " SELECT * FROM blog WHERE `name` like :nameSearch ", nativeQuery = true,
//            countQuery = " SELECT count(*) FROM ( SELECT * FROM blog WHERE `name` like :nameSearch) count_table")
//    Page<Blog> findAllBlog(@Param("nameSearch") String name, Pageable pageable);
//    Page<Blog> findAllByContentBlogContaining(String name, Pageable pageable);

}
