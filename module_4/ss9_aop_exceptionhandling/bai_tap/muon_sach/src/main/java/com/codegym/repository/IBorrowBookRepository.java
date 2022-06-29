package com.codegym.repository;

import com.codegym.model.BorrowBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBorrowBookRepository extends JpaRepository<BorrowBook, Integer> {

    @Query(value = " select * from borrow_book ", nativeQuery = true)
    List<BorrowBook> displayAllBorrowBook();
//
//    @Query(value =" update borrow_book set status = :status", nativeQuery = true)
//    void updateBorrow(@Param("status") String status);




    @Query(value = " select * from borrow_book where id_book = :idBook", nativeQuery = true)
    List<BorrowBook> displayByIdBook(@Param("idBook") Integer id);

    @Query(value = " select * from borrow_book where id = :id", nativeQuery = true)
    List<BorrowBook> displayById(@Param("id") Integer id);



}
