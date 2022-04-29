package bai_tap_case_study.model.person;

public class Customer extends Preson {
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(int id,String hoVaTen, String ngaySinh, String gioiTinh,
                    int soCMND, int soDT, String email, String loaiKhach, String diaChi) {
        super(id,hoVaTen, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }


    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Khách hàng: "+ super.toString()  +
                "loaiKhach= " + loaiKhach  +
                ", diaChi= " + diaChi ;
    }
    public String getInfoCustomer(){
        return getId()+","+getHoVaTen()+","+getNgaySinh()+","+getGioiTinh()+","
                +getSoCMND()+","+getSoDT()+","+getEmail()+","+ getLoaiKhach()+","+getDiaChi();
    }
}

