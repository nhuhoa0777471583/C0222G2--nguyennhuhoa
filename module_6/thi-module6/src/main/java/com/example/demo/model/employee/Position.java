package com.example.demo.model.employee;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Positition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tenViTri;
    @OneToMany(mappedBy = "viTri")
    @JsonBackReference
    private List<Employee> nhanVienList;
}
