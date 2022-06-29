package com.codegym.service.impl;

import com.codegym.model.LibaryBook;
import com.codegym.repository.ILibaryBookRepository;
import com.codegym.service.ILibaryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibaryBookService implements ILibaryBookService {
    @Autowired
    private ILibaryBookRepository iLibaryBookRepository;


    @Override
    public List<LibaryBook> displayAllBook() {
        return iLibaryBookRepository.displayAllBook();
    }

    @Override
    public LibaryBook displaybyId(Integer id) {
        return this.iLibaryBookRepository.displayById(id);
    }

    @Override
    public void save(LibaryBook libaryBook) {
        this.iLibaryBookRepository.save(libaryBook);
    }

}
