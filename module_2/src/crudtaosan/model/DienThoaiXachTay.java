package crudtaosan.model;

public class DienThoaiXachTay extends DienThoai{
    private String quocGiaXachTay;
    private String trangThai;

    public DienThoaiXachTay() {

    }

    public DienThoaiXachTay(Integer id, String tenDienThoai, Integer giaBan, Integer soLuong,
                            String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay= " + super.toString()+
                ", quocGiaXachTay= " + quocGiaXachTay +
                ", trangThai= " + trangThai ;
    }
    public String getInfoDienThoaiXachTay(){
        return getId()+","+getTenDienThoai()+","+getGiaBan()+","+getSoLuong()+","+getNhaSanXuat()+","+
                getQuocGiaXachTay()+","+getTrangThai();
    }
}
