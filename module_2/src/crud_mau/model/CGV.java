package crud_mau.model;

import java.util.Date;

public class CGV {
    private String maSuatChieu;
    private String tenPhim;
    private String ngayChieu;
    private String soLuongVe;

    public CGV() {
    }

    public CGV(String maSuatChieu, String tenPhim, String ngayChieu, String soLuongVe) {
        this.maSuatChieu = maSuatChieu;
        this.tenPhim = tenPhim;
        this.ngayChieu = ngayChieu;
        this.soLuongVe = soLuongVe;
    }

    public String getMaSuatChieu() {
        return maSuatChieu;
    }

    public void setMaSuatChieu(String maSuatChieu) {
        this.maSuatChieu = maSuatChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(String ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public String getSoLuongVe() {
        return soLuongVe;
    }

    public void setSoLuongVe(String soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    @Override
    public String toString() {
        return "Suất chiếu hom nay: "+
                " maSuatChieu= " + maSuatChieu +
                ", tenPhim= " + tenPhim +
                ", ngayChieu= " + ngayChieu +
                ", soLuongVe= " + soLuongVe ;
    }
    public String toInfoCinema(){
        return getMaSuatChieu()+","+getTenPhim()+","+getNgayChieu()+","+getSoLuongVe();
    }
}
