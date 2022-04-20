package bai_tap_case_study.model;

import java.util.Date;

public class House extends Furama{
    private String tieuChuanPhong;
    private String soTang;
    public House(){}

    public House(String tenDichVu, String dienTichSuDung, String soLuongNguoi, Date kieuThue,String tieuChuanPhong, String soTang) {
        super(tenDichVu, dienTichSuDung, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House: " +
                "tieuChuanPhong= " + tieuChuanPhong + '\'' +
                ", soTang= " + soTang + '\'' +super.toString();
    }
}
