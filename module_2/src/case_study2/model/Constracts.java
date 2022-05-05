package case_study2.model;

public class Constracts {
    //Số hợp đồng, mã booking, Số tiền cọc trước, Tổng số tiền thanh toán, mã khách hàng.
    private String soHopDong;
    private String tienCocTruoc;
    private String tongTien;

    public Constracts() {

    }

    public Constracts(String soHopDong, String tienCocTruoc, String tongTien) {
        this.soHopDong = soHopDong;
        this.tienCocTruoc = tienCocTruoc;
        this.tongTien = tongTien;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getTienCocTruoc() {
        return tienCocTruoc;
    }

    public void setTienCocTruoc(String tienCocTruoc) {
        this.tienCocTruoc = tienCocTruoc;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }
}
