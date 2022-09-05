package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Setter
@Getter
@RequiredArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition = "date")
    private Date createDate;
    private Integer cost;
    private Double price;
    private String madeIn;
    private String specifications;
    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id")
    private Category category;
    @Column(columnDefinition = "text")
    private String image;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDelete;
    private String statusProduct;
}
