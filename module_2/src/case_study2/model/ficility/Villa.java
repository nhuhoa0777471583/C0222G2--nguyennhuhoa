package case_study2.model.ficility;

public class Villa extends Facility{
    //Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.
    private String tieuChuanPhong;
    private String dienTichHoBoi;
    private String soTang;

    public Villa() {
    }


    public Villa(String maDichVu,String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi,
                 String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang) {
        super(maDichVu,tenDichVu, dienTichSuDung, chiPhiThue, soNguoi, kieuThue);
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
        return "Villa{ " +super.toString()+
                ", tieuChuanPhong= " + tieuChuanPhong  +
                ", dienTichHoBoi= " + dienTichHoBoi +
                ", soTang= " + soTang+"}";
    }
    public String getInfoVilla(){
        //String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi,
        // String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang
        return getMaDichVu()+","+getTenDichVu()+","+getDienTichSuDung()+","+getChiPhiThue()+","+getSoNguoi()+","+
                getKieuThue()+","+getTieuChuanPhong()+","+getDienTichHoBoi()+","+getSoTang();
    }
}
