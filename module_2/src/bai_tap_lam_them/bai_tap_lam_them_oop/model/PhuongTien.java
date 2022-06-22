package bai_tap_lam_them.bai_tap_lam_them_oop.model;

public class PhuongTien {
    private String bienKiemSoat;
    private String tenHang;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien(){}
    public PhuongTien(String bienKiemSoat, String tenHang,int namSanXuat, String chuSoHuu){
        this.bienKiemSoat=bienKiemSoat;
        this.tenHang=tenHang;
        this.namSanXuat=namSanXuat;
        this.chuSoHuu=chuSoHuu;
    }



    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "bienKiemSoat=" + bienKiemSoat +
                ", tenHang= " + tenHang + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu=" + chuSoHuu ;
    }
}
