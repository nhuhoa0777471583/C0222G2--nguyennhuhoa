package com.codegym.model;


import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_product")
    private String nameProduct;
    private Double price;
    private String information;
    @Column(name = "made_in")
    private String madeIn;

    public Product() {
    }

    public Product(Integer id, String nameProduct, Double price, String information, String madeIn) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.information = information;
        this.madeIn = madeIn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
}
