package bai_tap_case_study.model.facility;

public class Villa extends FacilityFurama {
    private String tieuChuanPhong;
    private String dienTichHoBoi;
    private String soTang;

    public Villa() {
    }

    public Villa(String maDichVu,String tenDichVu,String chiPhiThue, String dienTichSuDung, String soLuongNguoi,
                 String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang) {
        super(maDichVu,tenDichVu,chiPhiThue, dienTichSuDung, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }



    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                ", tieuChuanPhong= " + tieuChuanPhong +
                ", dienTichHoBoi= " + dienTichHoBoi +
                ", soTang= " + soTang;
    }

  //String maDichVu,String tenDichVu,String chiPhiThue, String dienTichSuDung, String soLuongNguoi,
  //                 String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang)
    public String getInfoVilla(){
        return getMaDichVu()+","+getTenDichVu()+","+getChiPhiThue()+","+
                getDienTichSuDung()+","+getSoLuongNguoi()+","+getKieuThue()+","+getTieuChuanPhong()+","+
                getDienTichHoBoi()+","+getSoTang();
    }
}
