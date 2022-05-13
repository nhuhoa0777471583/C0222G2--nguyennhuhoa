package bai_tap_lam_them_oop.model;

import java.util.Scanner;

public class XeMay extends PhuongTien {
    private String congSuat;
    public XeMay(){}
    public XeMay(String bienKiemSoat, String tenHang,int namSanXuat, String chuSoHuu,String congSuat){
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
        return "Xe may: "+ super.toString()+ '\''+
                "congSuat=" + congSuat ;
    }
}
