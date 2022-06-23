package com.example.demo.repository;



import com.example.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {

    @Query(value = " select * from blog " ,nativeQuery=true)
    List<Blog> displayAll();

    @Query(value = " select * from blog where id = :keywork", nativeQuery = true)
    Blog displayAllById(@Param("keywork") Integer id);

}
