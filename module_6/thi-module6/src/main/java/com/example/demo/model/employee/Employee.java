package com.example.demo.model.employee;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String maNhanVien;
    @ManyToOne
    @JoinColumn(name = "idVitri", referencedColumnName = "id")
    private ViTri viTri;
}
