package bai_tap_case_study.model.co_so_vat_chat;

import java.util.Date;

public class House extends FacilityFurama {
    private String tieuChuanPhong;
    private String soTang;
    public House(){}

    public House(String maDichVu,String tenDichVu,  String chiPhiThue,String dienTichSuDung, String soLuongNguoi, String kieuThue,String tieuChuanPhong, String soTang) {
        super(maDichVu,tenDichVu,chiPhiThue, dienTichSuDung, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                ", tieuChuanPhong= " + tieuChuanPhong+ ", soTang= " + soTang  ;
    }
}
