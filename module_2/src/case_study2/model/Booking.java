package case_study2.model;

public class Booking {
    //mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.
    private String maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;

    public Booking() {
    }

    public Booking(String maBooking, String ngayBatDau, String ngayKetThuc) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "Booking: " +
                ",maBooking= " + maBooking +
                ", ngayBatDau= " + ngayBatDau +
                ", ngayKetThuc= " + ngayKetThuc;
    }
}
