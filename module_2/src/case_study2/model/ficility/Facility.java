package case_study2.model.ficility;

public abstract class Facility {
    //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê,
    // Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
    private String maDichVu;
    private String tenDichVu;
    private String dienTichSuDung;
    private String chiPhiThue;
    private String soNguoi;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String maDichVu,String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi, String kieuThue) {
        this.maDichVu=maDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soNguoi = soNguoi;
        this.kieuThue = kieuThue;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(String soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {

        return " madichvu= " + maDichVu +
                " tenDichVu= " + tenDichVu +
                ", dienTichSuDung= " + dienTichSuDung +
                ", chiPhiThue= " + chiPhiThue +
                ", soNguoi= " + soNguoi +
                ", kieuThue= " + kieuThue;
    }
}
