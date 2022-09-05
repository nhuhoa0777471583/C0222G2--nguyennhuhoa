package com.example.demo.model.employee;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codeEmployee;
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_position", referencedColumnName = "id")
    private Position position;
}
