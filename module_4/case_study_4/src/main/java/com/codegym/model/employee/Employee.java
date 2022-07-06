package com.codegym.model.employee;

import com.codegym.model.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String birdthday;
    private String idCard;
    private Double salary;
    private String phone;
    private String email;
    private String address;
    @ManyToOne
    @JoinColumn(name = "id_position", referencedColumnName = "id")
    private Position position;
    @ManyToOne
    @JoinColumn(name = "id_education", referencedColumnName = "id")
    private Education education;
    @ManyToOne
    @JoinColumn(name = "id_divison", referencedColumnName = "id")
    private Division divison;
    @OneToMany(mappedBy = "employee")
    private List<Contract> contractList;
    public Employee() {
    }

    public Employee(Integer id, String name, String birdthday, String idCard, Double salary, String phone, String email, String address, Position position, Education education, Division divison, List<Contract> contractList) {
        this.id = id;
        this.name = name;
        this.birdthday = birdthday;
        this.idCard = idCard;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.position = position;
        this.education = education;
        this.divison = divison;
        this.contractList = contractList;
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

    public String getBirdthday() {
        return birdthday;
    }

    public void setBirdthday(String birdthday) {
        this.birdthday = birdthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Division getDivison() {
        return divison;
    }

    public void setDivison(Division divison) {
        this.divison = divison;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
