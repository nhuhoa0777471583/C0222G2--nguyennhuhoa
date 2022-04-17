package bai_tap_lam_them_oop.model;

import bai_tap_lam_them_oop.model.PhuongTien;

public class XeTai extends PhuongTien {
    private int trongTai;
    public XeTai(){}
    public XeTai(int bienKiemSoat, String tenHang,int namSanXuat, String chuSoHuu,int trongTai){
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.trongTai=trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    @Override
    public String toString() {
        return "XeTai: " +
                "trongTai=" + trongTai +'\''+ super.toString();
    }
}
