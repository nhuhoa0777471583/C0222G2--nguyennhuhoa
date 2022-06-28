package com.codegym.repository;


import com.codegym.model.LibaryBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILibaryBookRepository extends JpaRepository<LibaryBook,Integer> {

    @Query(value = " select * from libary_book", nativeQuery= true)
    List<LibaryBook> displayAllBook();




}
