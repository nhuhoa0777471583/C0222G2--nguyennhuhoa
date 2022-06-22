package crudtaosan.model;

public class DienThoaiChinhHang extends DienThoai {
    private Integer thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {

    }

    public DienThoaiChinhHang(Integer id, String tenDienThoai, Integer giaBan, Integer soLuong, String nhaSanXuat, Integer thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public Integer getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(Integer thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang= " + super.toString() +
                ", thoiGianBaoHanh= " + thoiGianBaoHanh +
                ", phamViBaoHanh= " + phamViBaoHanh;
    }

    public String getInfoDienThoaiChinhHang() {
        return getId() + "," + getTenDienThoai() + "," + getGiaBan() + "," + getSoLuong() + "," + getNhaSanXuat() + "," +
                getThoiGianBaoHanh() + "," + getPhamViBaoHanh();
    }
}
