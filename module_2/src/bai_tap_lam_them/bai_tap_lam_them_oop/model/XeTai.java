package bai_tap_lam_them_oop.model;

import java.util.Scanner;

public class XeTai extends PhuongTien {
    private String trongTai;
    public XeTai(){}
    public XeTai(String bienKiemSoat, String tenHang,int namSanXuat, String chuSoHuu,String trongTai){
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.trongTai=trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    @Override
    public String toString() {
        return "XeTai: " + super.toString()+
                "trongTai=" + trongTai +'\'';
    }

}
