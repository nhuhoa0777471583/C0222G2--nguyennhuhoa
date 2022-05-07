package case_study2.model.person;

public class Customer extends Person {
    // Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ
    private String maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public  Customer(Integer id, String hoTen, String ngaySinh, String gioiTinh, Integer soCMND,
                    Integer soDienThoai, String email, String maKhachHang, String loaiKhach, String diaChi) {
        super(id, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
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
        return "Customer: " + super.toString() +
                ", maKhachHang= " + maKhachHang +
                ", loaiKhach= " + loaiKhach +
                ", diaChi= " + diaChi;
    }

    public String getInfoCustomer() {
        //Integer id,
        // Mã khách hàng, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Loại khách, Địa chỉ
        return getId() + "," + getHoTen() + "," + getNgaySinh() + "," + getGioiTinh() + "," + getSoCMND() + "," + getSoDienThoai() + "," +
                getEmail() + "," + getLoaiKhach() + "," + getLoaiKhach() + "," + getDiaChi();
    }
}
