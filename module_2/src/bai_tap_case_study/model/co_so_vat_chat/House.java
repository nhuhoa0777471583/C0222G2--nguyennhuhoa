package bai_tap_case_study.model.co_so_vat_chat;

import java.util.Date;

public class House extends FacilityFurama {
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
        return "House: " + super.toString()+ '\'' +
                "tieuChuanPhong= " + tieuChuanPhong + '\'' +
                ", soTang= " + soTang  ;
    }
}
