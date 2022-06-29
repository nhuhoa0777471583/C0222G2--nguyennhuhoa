package com.codegym.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "libary_book")
public class LibaryBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="name_book")
    private String nameBook;
    private Integer amount;
    @OneToMany(mappedBy = "libaryBook")
    private List<BorrowBook> borrowBooks;

    public LibaryBook() {
    }

    public LibaryBook(Integer id, String nameBook, Integer amount, List<BorrowBook> borrowBooks) {
        this.id = id;
        this.nameBook = nameBook;
        this.amount = amount;
        this.borrowBooks = borrowBooks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<BorrowBook> getBorrowBooks() {
        return borrowBooks;
    }

    public void setBorrowBooks(List<BorrowBook> borrowBooks) {
        this.borrowBooks = borrowBooks;
    }


    public void borrowBook(){
        if(this.amount > 0){
            this.setAmount(this.amount - 1); ;
        }
        else{
            System.out.println("Error");
        }
    }

    public void payBook(){
        this.setAmount(this.amount + 1);
    }
}
