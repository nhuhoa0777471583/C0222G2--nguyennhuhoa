package case_study2.model;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Booking{
    //mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.
    private Integer maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String maKhachHang;
    private String tenDichVu;
    private String loaiDichVu;

    public Booking() {
    }

    public Booking(Integer maBooking, String ngayBatDau, String ngayKetThuc, String maKhachHang, String tenDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public Integer getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(Integer maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "Booking{ " +
                "maBooking= " + maBooking +
                ", ngayBatDau= " + ngayBatDau +
                ", ngayKetThuc= " + ngayKetThuc +
                ", maKhachHang= " + maKhachHang +
                ", tenDichVu= " + tenDichVu +
                ", loaiDichVu= " + loaiDichVu  ;
    }
    public String getInfoBooking(){
        return getMaBooking()+","+getNgayBatDau()+","+getNgayKetThuc()+","+
                getMaKhachHang()+","+getTenDichVu()+","+getLoaiDichVu();
    }
//
//    @Override
//    public int compareTo(Booking o) {
//       return this.getMaBooking().compareTo(o.getMaBooking());
//    }

}
