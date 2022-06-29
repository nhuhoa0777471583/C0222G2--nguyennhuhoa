package com.codegym.service;

import com.codegym.model.BorrowBook;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IBorrowBookService {

    List<BorrowBook> displayAllBorrowBook();

//    void updateBorrow(@Param("status") String status);
    List<BorrowBook> displayById(@Param("id") Integer id);
    List<BorrowBook> displayByIdBook(@Param("id") Integer id);
    void save(BorrowBook borrowBook);

}
