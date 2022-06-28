package com.codegym.repository;

import com.codegym.model.BorrowBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBorrowBookRepository extends JpaRepository<BorrowBook, Integer> {

    @Query(value = " select * from borrow_book ", nativeQuery = true)
    List<BorrowBook> displayAllBorrowBook();
}
