package com.codegym.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "borrow_book")
public class BorrowBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_book", referencedColumnName = "id")
    private LibaryBook libaryBook;

    public BorrowBook() {
    }


    public BorrowBook(Integer id, String name, Double price, String status, LibaryBook libaryBook) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.libaryBook = libaryBook;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LibaryBook getLibaryBook() {
        return libaryBook;
    }

    public void setLibaryBook(LibaryBook libaryBook) {
        this.libaryBook = libaryBook;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
