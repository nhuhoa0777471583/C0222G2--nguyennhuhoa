package com.codegym.service.impl;

import com.codegym.model.BorrowBook;
import com.codegym.repository.IBorrowBookRepository;
import com.codegym.service.IBorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BorrowBookService implements IBorrowBookService {

    @Autowired
    private IBorrowBookRepository iBorrowBookRepository;

    @Override
    public List<BorrowBook> displayAllBorrowBook() {
        return this.iBorrowBookRepository.displayAllBorrowBook();
    }

    @Override
    public void updateBorrow(String status) {
        this.iBorrowBookRepository.updateBorrow(status);
    }

    @Override
    public List<BorrowBook> displayById(Integer id) {
        return this.iBorrowBookRepository.displayById(id);
    }

    @Override
    public List<BorrowBook> displayByIdBook(Integer id) {
        return this.iBorrowBookRepository.displayByIdBook(id);
    }
}
