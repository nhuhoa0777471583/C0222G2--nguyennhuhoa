package model;

public class MatBang {
    private String maMatBang;
    private Double dienTich;
    private Integer maTrangThai;
    private Integer maTang;
    private Integer maLoaiVanPhong;
    private String moTaChiTiet;
    private Double gia;
    private String ngayBatDau;
    private String ngayKetThuc;

    public MatBang() {
    }

    public MatBang(String maMatBang, Double dienTich, Integer maTrangThai, Integer soTang, Integer maLoaiVanPhong,
                   String moTaChiTiet, Double gia, String ngayBatDau, String ngayKetThuc) {
        this.maMatBang = maMatBang;
        this.dienTich = dienTich;
        this.maTrangThai = maTrangThai;
        this.maTang = soTang;
        this.maLoaiVanPhong = maLoaiVanPhong;
        this.moTaChiTiet = moTaChiTiet;
        this.gia = gia;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaMatBang() {
        return maMatBang;
    }

    public void setMaMatBang(String maMatBang) {
        this.maMatBang = maMatBang;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public Integer getMaTrangThai() {
        return maTrangThai;
    }

    public void setMaTrangThai(Integer maTrangThai) {
        this.maTrangThai = maTrangThai;
    }

    public Integer getMaTang() {
        return maTang;
    }

    public void setMaTang(Integer maTang) {
        this.maTang = maTang;
    }

    public Integer getMaLoaiVanPhong() {
        return maLoaiVanPhong;
    }

    public void setMaLoaiVanPhong(Integer maLoaiVanPhong) {
        this.maLoaiVanPhong = maLoaiVanPhong;
    }

    public String getMoTaChiTiet() {
        return moTaChiTiet;
    }

    public void setMoTaChiTiet(String moTaChiTiet) {
        this.moTaChiTiet = moTaChiTiet;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
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
        return "model.MatBang{" +
                "maMatBang='" + maMatBang + '\'' +
                ", dienTich=" + dienTich +
                ", maTrangThai=" + maTrangThai +
                ", soTang=" + maTang +
                ", maLoaiVanPhong=" + maLoaiVanPhong +
                ", moTaChiTiet='" + moTaChiTiet + '\'' +
                ", gia=" + gia +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                '}';
    }
}
