package bai_tap_case_study.model;

import java.util.Date;

public class Furama {
    private String tenDichVu;
    private String dienTichSuDung;
    private String soLuongNguoi;
    private Date kieuThue;
    public Furama(){}

    public Furama(String tenDichVu, String dienTichSuDung, String soLuongNguoi, Date kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(String soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public Date getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(Date kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Furama: " +
                "tenDichVu= " + tenDichVu + '\'' +
                ", dienTichSuDung= " + dienTichSuDung +
                ", soLuongNguoi= " + soLuongNguoi +
                ", kieuThue= " + kieuThue ;
    }
}
