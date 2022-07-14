package com.thi.model;

import javax.persistence.*;

@Entity
public class PhongTro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JoinColumn(name = "ma_phong")
    private String maPhong;
    @JoinColumn(name = "dien_ich")
    private Integer dienTich;
    private Double gia;
    @JoinColumn(name = "tinh_trang_thue")
    private String tinhTrangThue;
    @OneToOne(mappedBy = "phongTro")
    private HopDong hopDong;

    public PhongTro() {
    }

    public PhongTro(Integer id, String maPhong, Integer dienTich, Double gia, String tinhTrangThue, HopDong hopDong) {
        this.id = id;
        this.maPhong = maPhong;
        this.dienTich = dienTich;
        this.gia = gia;
        this.tinhTrangThue = tinhTrangThue;
        this.hopDong = hopDong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public Integer getDienTich() {
        return dienTich;
    }

    public void setDienTich(Integer dienTich) {
        this.dienTich = dienTich;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getTinhTrangThue() {
        return tinhTrangThue;
    }

    public void setTinhTrangThue(String tinhTrangThue) {
        this.tinhTrangThue = tinhTrangThue;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }
}
