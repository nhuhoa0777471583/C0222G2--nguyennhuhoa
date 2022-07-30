package com.backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Consignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codeConsignment;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private Product product;
    private Integer amount;
    private String dateAdd;
    private String dateOfManuFacture;
    private String dateEnd;

    public Consignment() {
    }

    public Consignment(Integer id, String codeConsignment, Product product, Integer amount, String dateAdd, String dateOfManuFacture, String dateEnd) {
        this.id = id;
        this.codeConsignment = codeConsignment;
        this.product = product;
        this.amount = amount;
        this.dateAdd = dateAdd;
        this.dateOfManuFacture = dateOfManuFacture;
        this.dateEnd = dateEnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeConsignment() {
        return codeConsignment;
    }

    public void setCodeConsignment(String codeConsignment) {
        this.codeConsignment = codeConsignment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getDateOfManuFacture() {
        return dateOfManuFacture;
    }

    public void setDateOfManuFacture(String dateOfManuFacture) {
        this.dateOfManuFacture = dateOfManuFacture;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
}
