package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class CategoryLaptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "categoryLaptop")
    private List<LaptopProduct> laptopList;

    public CategoryLaptop() {
    }

    public CategoryLaptop(Integer id, String name, List<LaptopProduct> laptopList) {
        this.id = id;
        this.name = name;
        this.laptopList = laptopList;
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

    public List<LaptopProduct> getLaptopList() {
        return laptopList;
    }

    public void setLaptopList(List<LaptopProduct> laptopList) {
        this.laptopList = laptopList;
    }
}
