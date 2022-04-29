package bai_tap_case_study.model.person;

public abstract class Preson {
    private int id;
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private int soCMND;
    private int soDT;
    private String email;

    public Preson() {
    }

    public Preson(int id, String hoVaTen, String ngaySinh, String gioiTinh, int soCMND, int soDT, String email) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", hoVaTen= " + hoVaTen  +
                ", ngaySinh= " + ngaySinh  +
                ", gioiTinh= " + gioiTinh  +
                ", soCMND= " + soCMND +
                ", soDT= " + soDT +
                ", email= " + email;
    }
}
