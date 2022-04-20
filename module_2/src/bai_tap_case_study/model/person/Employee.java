package bai_tap_case_study.model.person;

import bai_tap_case_study.model.person.Preson;

public class Employee extends Preson {
    private String tinhDo;
    private String viTri;
    private String luong;

    public Employee() {
    }

    public Employee(String tinhDo, String viTri, String luong) {
        this.tinhDo = tinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(int id,String hoVaTen, String ngaySinh, String gioiTinh, int soCMND, int soDT, String email, String tinhDo, String viTri, String luong) {
        super(id,hoVaTen, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.tinhDo = tinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTinhDo() {
        return tinhDo;
    }

    public void setTinhDo(String tinhDo) {
        this.tinhDo = tinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Nhân viên: "+super.toString()+'\''+
                "tinhDo='" + tinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong='" + luong ;
    }
}
