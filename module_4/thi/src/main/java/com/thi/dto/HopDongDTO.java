package com.thi.dto;

import com.thi.model.PhongTro;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.GroupSequence;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@GroupSequence(value = {HopDongDTO.class, First.class, Before.class})
public class HopDongDTO {
    @NotEmpty(groups = First.class, message = "không được để trống")
    @Pattern(regexp = "^(HD-)[0-9]{3}(?!\\s*$).$", groups = Before.class, message = "mã hợp đồng phải đúng định dạng HD-XXXX ")
    private String maHopDong;

    private PhongTro phongTro;
    @NotEmpty(groups = First.class, message = "không được để trống")
    private String tenNguoiThue;
    @NotEmpty(groups = First.class, message = "không được để trống")
    private String soCMNDNguoiThue;
    @NotEmpty(groups = First.class, message = "không được để trống")
    private String ngayLamHopDong;
//    @NotEmpty(groups = First.class, message = "không được để trống")
    private Double thoiGianThue;


    public HopDongDTO() {
    }


    public HopDongDTO(@NotEmpty(groups = First.class, message = "không được để trống") @Pattern(regexp = "^(HD-)[0-9]{3}(?!\\s*$).$", groups = Before.class, message = "mã hợp đồng phải đúng định dạng HD-XXXX ") String maHopDong, PhongTro phongTro, @NotEmpty(groups = First.class, message = "không được để trống") String tenNguoiThue, @NotEmpty(groups = First.class, message = "không được để trống") String soCMNDNguoiThue, @NotEmpty(groups = First.class, message = "không được để trống") String ngayLamHopDong, Double thoiGianThue) {
        this.maHopDong = maHopDong;
        this.phongTro = phongTro;
        this.tenNguoiThue = tenNguoiThue;
        this.soCMNDNguoiThue = soCMNDNguoiThue;
        this.ngayLamHopDong = ngayLamHopDong;
        this.thoiGianThue = thoiGianThue;
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
