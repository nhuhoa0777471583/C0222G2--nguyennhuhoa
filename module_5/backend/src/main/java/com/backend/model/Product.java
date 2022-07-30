package com.backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String madeIn;
    private Double price;
    private String unit;
    @OneToMany(mappedBy = "product")
    private List<Consignment> consignmentList;

    public Product() {
    }

    public Product(Integer id, String name, String madeIn, Double price, String unit, List<Consignment> consignmentList) {
        this.id = id;
        this.name = name;
        this.madeIn = madeIn;
        this.price = price;
        this.unit = unit;
        this.consignmentList = consignmentList;
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

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<Consignment> getConsignmentList() {
        return consignmentList;
    }

    public void setConsignmentList(List<Consignment> consignmentList) {
        this.consignmentList = consignmentList;
    }
}
