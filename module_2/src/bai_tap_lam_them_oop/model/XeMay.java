package bai_tap_lam_them_oop.model;

import bai_tap_lam_them_oop.model.PhuongTien;

public class XeMay extends PhuongTien {
    private String congSuat;
    public XeMay(){}
    public XeMay(int bienKiemSoat, String tenHang,int namSanXuat, String chuSoHuu,String congSuat){
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.congSuat=congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    @Override
    public String toString() {
        return "XeMay: " +
                "congSuat=" + congSuat +'\''+ super.toString();
    }

}
