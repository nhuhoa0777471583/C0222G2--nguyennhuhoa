package com.example.demo.model.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String maSanPham;
    private Double donGia;
    private String tinhTrang;
    private Date ngayNhapHang;
    @ManyToOne
}
