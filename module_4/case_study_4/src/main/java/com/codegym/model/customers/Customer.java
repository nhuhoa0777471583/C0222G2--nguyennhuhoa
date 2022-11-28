package com.codegym.model.customers;


import com.codegym.model.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameCustomer;
    private String birdthday;
    private Integer gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_customer_type", referencedColumnName = "id")
    private CustomerType customerType;
    @JsonBackReference
    @OneToMany(mappedBy = "customer")
    private List<Contract> contractList;


    public Customer() {
    }

    public Customer(Integer id, String nameCustomer, String birdthday, Integer gender, String idCard, String phone, String email, String address, CustomerType customerType, List<Contract> contractList) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.birdthday = birdthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.contractList = contractList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer idCustomer) {
        this.id = idCustomer;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return nameCustomer;
    }

    public void setName(String name) {
        this.nameCustomer = name;
    }

    public String getbirdthday() {
        return birdthday;
    }

    public void setbirdthday(String birdthday) {
        this.birdthday = birdthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
