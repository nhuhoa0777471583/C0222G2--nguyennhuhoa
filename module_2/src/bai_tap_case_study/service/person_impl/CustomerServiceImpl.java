package bai_tap_case_study.service.person_impl;

import bai_tap_case_study.common.read_write.ReadAll;
import bai_tap_case_study.common.read_write.WriteAll;
import bai_tap_case_study.model.person.Customer;
import bai_tap_case_study.service.interf.i_preson.ICustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    protected static Scanner scanner = new Scanner(System.in);
    protected static List<Customer> customerList = new LinkedList<>();
            static {
            customerList.add(new Customer(1, "hoa1", "1/03", "nam", 123, 321,
                    "hoa23@", "hoa444", "Gold","sg"));
            customerList.add(new Customer(2, "hoa2", "2/03", "nam", 123, 321,
                    "hoa23@","hoa555", "Platinium","dn"));
        WriteAll.writeCustomer(customerList, false);
    }
    @Override
    public void add() {
        addCustomer();
    }

    private void addCustomer() {
        System.out.print("them id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("them ho ten: ");
        String name = scanner.nextLine();
        System.out.print("them ngay sinh: ");
        String birth = scanner.nextLine();
        System.out.print("them gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.print("them so CMND: ");
        int soCMND = Integer.parseInt(scanner.nextLine());
        System.out.print("them so dien thoai: ");
        int soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.print("them email: ");
        String email = scanner.nextLine();
        System.out.print("them ma khach hang: ");
        String maKhachHang = scanner.nextLine();

        String loaiKhach = addCustomers();

        System.out.print("them dia chi: ");
        String diaChi = scanner.nextLine();
        Customer customer = new Customer(id, name, birth, gender, soCMND, soDienThoai, email,maKhachHang, loaiKhach, diaChi);
        System.out.print(customer);
        customerList.add(customer);
        WriteAll.writeCustomer(customerList, false);

    }

    private String addCustomers() {
        System.out.print("thêm khách hàng:\n" +
                "1.Diamond\n" +
                "2.Platinium\n" +
                "3.Gold\n" +
                "4.Silver\n" +
                "5.Member\n"+
                "chọn khách hàng thêm vào: ");
        int chosse = Integer.parseInt(scanner.nextLine());
        String loaiKhach = scanner.nextLine();
        switch (chosse){
            case 1 :
                loaiKhach = "Diamond";
                break;
            case 2:
                loaiKhach ="Platinium";
                break;
            case 3:
                loaiKhach ="Gold";
                break;
            case 4:
                loaiKhach="Silver";
                break;
            case 5:
                loaiKhach= "Member";
                break;
        }
        return loaiKhach;
    }

    @Override
    public void display() {
        customerList = ReadAll.readCustomer();
        for (Customer customre : customerList) {
            System.out.println(customre);
        }
    }

    @Override
    public void edit() {
        editCustomer();
    }

    private void editCustomer() {
        customerList = ReadAll.readCustomer();
        System.out.print("nhap id cần sửa : ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (id == customerList.get(i).getId()) {
                flag = true;
                System.out.print("sửa ho ten: ");
                String name = scanner.nextLine();
                System.out.print("sửa ngay sinh: ");
                String birth = scanner.nextLine();
                System.out.print("sửa gioi tinh: ");
                String gender = scanner.nextLine();
                System.out.print("sửa so CMND: ");
                int soCMND = Integer.parseInt(scanner.nextLine());
                System.out.print("sửa so dien thoai: ");
                int soDienThoai = Integer.parseInt(scanner.nextLine());
                System.out.print("sửa email: ");
                String email = scanner.nextLine();
                System.out.print("sửa ma khach hang: ");
                String maKhachHang = scanner.nextLine();
                System.out.print("sửa loai khach: ");
                String loaiKhach = scanner.nextLine();
                System.out.print("sửa dia chi: ");
                String diaChi = scanner.nextLine();
                Customer customer = new Customer(id, name, birth, gender, soCMND, soDienThoai, email,maKhachHang, loaiKhach, diaChi);
                System.out.print(customer);
                customerList.set(i, customer);
                WriteAll.writeCustomer(customerList, false);
                break;
            }
        }
        if (flag == false) {
            System.out.println("ko ton tại ");
        }
    }
}
