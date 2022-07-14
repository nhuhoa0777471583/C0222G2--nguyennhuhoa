package com.thi.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class HopDong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ma_hop_dong")
    private String maHopDong;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ma_phong", referencedColumnName = "id")
    private PhongTro phongTro;
    @Column(name = "ten_nguoi_thue")
    private String tenNguoiThue;
    @Column(name = "so_cmnd_nguoi_thue")
    private String soCMNDNguoiThue;
    @Column(name = "ngay_lam_hop_dong")
    private String ngayLamHopDong;


    private Double thoiGianThue;


    public HopDong() {
    }

    public HopDong(Integer id, String maHopDong, PhongTro phongTro, String tenNguoiThue, String soCMNDNguoiThue, String ngayLamHopDong, Double thoiGianThue) {
        this.id = id;
        this.maHopDong = maHopDong;
        this.phongTro = phongTro;
        this.tenNguoiThue = tenNguoiThue;
        this.soCMNDNguoiThue = soCMNDNguoiThue;
        this.ngayLamHopDong = ngayLamHopDong;
        this.thoiGianThue = thoiGianThue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public PhongTro getPhongTro() {
        return phongTro;
    }

    public void setPhongTro(PhongTro phongTro) {
        this.phongTro = phongTro;
    }

    public String getTenNguoiThue() {
        return tenNguoiThue;
    }

    public void setTenNguoiThue(String tenNguoiThue) {
        this.tenNguoiThue = tenNguoiThue;
    }

    public String getSoCMNDNguoiThue() {
        return soCMNDNguoiThue;
    }

    public void setSoCMNDNguoiThue(String soCMNDNguoiThue) {
        this.soCMNDNguoiThue = soCMNDNguoiThue;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public Double getThoiGianThue() {
        return thoiGianThue;
    }

    public void setThoiGianThue(Double thoiGianThue) {
        this.thoiGianThue = thoiGianThue;
    }
}
