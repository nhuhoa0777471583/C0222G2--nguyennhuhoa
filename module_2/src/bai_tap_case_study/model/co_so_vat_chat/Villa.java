package bai_tap_case_study.model.co_so_vat_chat;

import java.util.Date;

public class Villa extends FacilityFurama {
    private String tieuChuanPhong;
    private String dienTichHoBoi;
    private String soTang;

    public Villa() {
    }

    public Villa(String tenDichVu,String chiPhiThue, String dienTichSuDung, String soLuongNguoi, String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang) {
        super(tenDichVu,chiPhiThue, dienTichSuDung, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                "tieuChuanPhong= " + tieuChuanPhong +
                ", dienTichHoBoi= " + dienTichHoBoi +
                ", soTang= " + soTang;
    }
}
