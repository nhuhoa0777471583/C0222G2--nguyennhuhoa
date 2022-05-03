package bai_tap_case_study.model;

public class Booking {
    private int maBooking;
    private int ngayBatDau;
    private int ngayKetThuc;
    private int maKhachHang;
    private String tenDichVu;
    private String loạiDichVu;
    public Booking(){}

    public int getMaBooking() {
        return maBooking;
    }
    public Booking(int maBooking, int ngayBatDau, int ngayKetThuc, int maKhachHang, String tenDichVu, String loạiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loạiDichVu = loạiDichVu;
    }
    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public int getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(int ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public int getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(int ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoạiDichVu() {
        return loạiDichVu;
    }

    public void setLoạiDichVu(String loạiDichVu) {
        this.loạiDichVu = loạiDichVu;
    }

    @Override
    public String toString() {
        return "maBooking= " + maBooking +
                ", ngayBatDau= " + ngayBatDau +
                ", ngayKetThuc= " + ngayKetThuc +
                ", maKhachHang= " + maKhachHang +
                ", tenDichVu= " + tenDichVu +
                ", loạiDichVu= " + loạiDichVu ;
    }
}
