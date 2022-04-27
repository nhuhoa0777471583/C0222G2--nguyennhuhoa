package bai_tap_case_study.model.person;

public class Employee extends Preson {
    private String trinhDo;
    private String viTri;
    private String luong;





    public Employee(int id,String hoVaTen, String ngaySinh, String gioiTinh, int soCMND
            , int soDT, String email, String tinhDo, String viTri, String luong) {
        super(id,hoVaTen, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.trinhDo = tinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

//    public Employee(String tinhDo, String viTri, String luong) {
//        this.trinhDo = tinhDo;
//        this.viTri = viTri;
//        this.luong = luong;
//    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
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
                ",tinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong='" + luong ;
    }
    //int id,String hoVaTen, String ngaySinh, String gioiTinh, int soCMND
    //ư, int soDT, String email, String tinhDo, String viTri, String luong
    public String getInfoEmployee(){
        return getId()+","+getHoVaTen()+","+getNgaySinh()+","+getGioiTinh()+","
                +getSoCMND()+","+getSoDT()+","+getEmail()+","+ getTrinhDo()+","+getViTri()+","+getLuong();
    }
}
