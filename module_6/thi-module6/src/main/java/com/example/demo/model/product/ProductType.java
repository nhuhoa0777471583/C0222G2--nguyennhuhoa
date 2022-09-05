package com.example.demo.model.product;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    private String author;
    @Column(columnDefinition = "Date")
    private Date creationDate;
    private String category;
    private String careSugarOrSalty;
    private String madeIn;
    private String yesNoGas;

    @ManyToOne
    @JoinColumn(name = "id_rent_type", referencedColumnName = "id")
    private RentType rentType;

    @JsonBackReference
    @OneToMany(mappedBy = "productType")
    private List<Product> productList;
}
