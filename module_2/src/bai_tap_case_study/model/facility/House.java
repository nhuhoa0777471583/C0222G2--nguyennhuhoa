package bai_tap_case_study.model.facility;

public class House extends FacilityFurama {
    private String tieuChuanPhong;
    private String soTang;

    public House() {
    }

    public House(String maDichVu, String tenDichVu, String chiPhiThue, String dienTichSuDung,
                 String soLuongNguoi, String kieuThue, String tieuChuanPhong, String soTang) {
        super(maDichVu, tenDichVu, chiPhiThue, dienTichSuDung, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                ", tieuChuanPhong= " + tieuChuanPhong + ", soTang= " + soTang;
    }

    public String getInfoHouse() {
        return getMaDichVu() + "," + getTenDichVu() + "," + getChiPhiThue() + "," +
                getDienTichSuDung() + "," + getSoLuongNguoi() + "," +
                getKieuThue() + "," + getTieuChuanPhong() + "," + getSoTang();
    }


}
