package case_study2.model.ficility;

public class House extends Facility {
    //Tiêu chuẩn phòng, Số tầng.
    private String tieuChuanPhong;
    private String soTang;

    public House() {
    }

    public House(String maDichVu,String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi,
                 String kieuThue, String tieuChuanPhong, String soTang) {
        super(maDichVu,tenDichVu, dienTichSuDung, chiPhiThue, soNguoi, kieuThue);
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
        return "House{ " + super.toString() +
                ", tieuChuanPhong= " + tieuChuanPhong +
                ", soTang= " + soTang + "}";
    }
    public String getInfoHouse(){
        //String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi, String kieuThue,
        // String tieuChuanPhong, String soTang)

        return getMaDichVu()+","+getTenDichVu()+","+getDienTichSuDung()+","+getChiPhiThue()+","+getSoNguoi()+","+
                getKieuThue()+","+getTieuChuanPhong()+","+getSoTang();
    }
}
