package bai_tap_lam_them_oop.model;

import java.util.Scanner;

public class Oto extends PhuongTien {
    private int soChoNgoi;
    private String kieuXe;


    public Oto(){}

    public Oto(String bienKiemSoat, String tenHang,int namSanXuat, String chuSoHuu,int soChoNgoi,String kieuXe){
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.soChoNgoi=soChoNgoi;
        this.kieuXe=kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto: " + super.toString()+ '\''  +
                "soChoNgoi= " + soChoNgoi +
                ", kieuXe= " + kieuXe ;
    }


}
