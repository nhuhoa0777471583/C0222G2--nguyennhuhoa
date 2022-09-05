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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codeProduct;
    private Double price;
    private String statusProduct;
    @Column(columnDefinition = "Date")
    private Date creationDate;
    private Boolean isDeleted;

    @JsonBackReference
    @OneToMany(mappedBy = "product")

    private List<OrderProduct> orderProductList;
    @ManyToOne
    @JoinColumn(name = "id_product_type", referencedColumnName = "id")
    private ProductType productType;

}
