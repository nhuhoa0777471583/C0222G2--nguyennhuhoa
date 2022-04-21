package bai_tap_case_study.model;

public class HopDong  {
    private int soHopDong;
    private int maBooking;
    private int soTienCoc;
    private int tongTien;

    public HopDong() {
    }

    public HopDong(int soHopDong, int maBooking, int soTienCoc, int tongTien, int maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCoc = soTienCoc;
        this.tongTien = tongTien;
        this.maKhachHang = maKhachHang;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public int getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(int soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    private int maKhachHang;
}
