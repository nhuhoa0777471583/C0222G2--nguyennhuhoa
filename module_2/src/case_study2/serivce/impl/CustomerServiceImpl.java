package case_study2.serivce.impl;

import case_study2.common.read_and_write.Read;
import case_study2.common.read_and_write.Write;
import case_study2.model.person.Customer;
import case_study2.serivce.inter.ICustomerService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    static {
        // id, Họ tên , Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email,Mã khách hàng, Loại khách, Địa chỉ
        customerList.add(new Customer(1, "hoa1", "23/3", "nam", 123, 333,
                "hoa23@", "hoa23", "gold", "dn"));

        customerList.add(new Customer(2, "hoa2", "23/3", "nam", 123, 333,
                "hoa23@", "hoa123", "gold", "dn"));

        customerList.add(new Customer(3, "hoa3", "23/3", "nam", 123, 333,
                "hoa23@", "hoa222", "gold", "dn"));

        customerList.add(new Customer(4, "hoa4", "23/3", "nam", 123, 333,
                "hoa23@", "hoa555", "gold", "dn"));
        Write.writeCustomer(customerList,true);
    }

    @Override
    public void add() {
        System.out.print("them id: ");
        Integer id = Integer.parseInt(sc.nextLine());
        System.out.print("them ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("them ngay sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("them gioi tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("them so CMND: ");
        Integer soCMND = Integer.parseInt(sc.nextLine());
        System.out.print("them so dien thoai: ");
        Integer soDienThoai = Integer.parseInt(sc.nextLine());
        System.out.print("them email: ");
        String email = sc.nextLine();

        System.out.print("them ma khach hang: ");
        String maKhachHang = sc.nextLine();
        System.out.print("them loai khach hang: ");
        String loaiKhachHang = sc.nextLine();
        System.out.print("them dia chi: ");
        String diaChi = sc.nextLine();
        Customer c = new Customer(id, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maKhachHang, loaiKhachHang, diaChi);
        System.out.println(c);
        customerList.add(c);
        Write.writeCustomer(customerList, false);
    }

    @Override
    public void display() {
        customerList = Read.readCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        customerList = Read.readCustomer();

        System.out.print("nhap id can sửa: ");
        Integer id = Integer.parseInt(sc.nextLine());
        boolean flag = false;

        for (int i = 0; i < customerList.size(); i++) {
            if (id.equals(customerList.get(i).getId())) {
                flag = true;
                System.out.print("sửa ho ten: ");
                String hoTen = sc.nextLine();
                System.out.print("sửa ngay sinh: ");
                String ngaySinh = sc.nextLine();
                System.out.print("sửa gioi tính: ");
                String gioiTinh = sc.nextLine();
                System.out.print("sửa so CMND: ");
                Integer soCMND = Integer.parseInt(sc.nextLine());
                System.out.print("sửa so dien thoai: ");
                Integer soDienThoai = Integer.parseInt(sc.nextLine());
                System.out.print("sửa email: ");
                String email = sc.nextLine();
                System.out.print("sửa ma khach hang: ");
                String maKhachHang = sc.nextLine();
                System.out.print("sửa loai khach hang: ");
                String loaiKhachHang = sc.nextLine();
                System.out.print("sửa dia chi: ");
                String diaChi = sc.nextLine();
                Customer c = new Customer(id, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maKhachHang, loaiKhachHang, diaChi);
                System.out.println(c);
                customerList.set(i, c);
                Write.writeCustomer(customerList, false);
            }
        }
        if (flag == false) {
            System.out.println("ko co trong danh sách cần sửa!!");
        }
    }

    public static void displayIdCustomer() {
        for (Customer c : customerList) {
            System.out.println(c.toString());
        }
    }

    public static String getIdCustomer(){
        while (true){
            System.out.println("nhap ma khach hang theo ds khach hang: ");
            String id= sc.nextLine();
            for (Customer c : customerList) {
                if(id.equals(c.getMaKhachHang())){
                    return id;
                }
            }
        }
    }

}
