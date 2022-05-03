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
    protected static List<Customer> customerLinkedList = new LinkedList<>();

    //    static {
//    customerLinkedList.add(new Customer(1, "hoa1", "1/03", "nam", 123, 321, "hoa23@", "Gold","sg"));
//    customerLinkedList.add(new Customer(20, "hoa2", "2/03", "nam", 123, 321, "hoa23@", "Platinium","dn"));
//        WriteAll.writeKhachHang(customerLinkedList, false);
//    }
    @Override
    public void add() throws Exception {
        addCustomer();
    }

    private void addCustomer() {
        while (true) {
            try {
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
                System.out.print("thêm khách hàng: ");
                String loaiKhach = scanner.nextLine();
                System.out.print("them dia chi: ");
                String diaChi = scanner.nextLine();
                Customer customer = new Customer(id, name, birth, gender, soCMND, soDienThoai, email, loaiKhach, diaChi);
                System.out.print(customer);
                customerLinkedList.add(customer);
                WriteAll.writeCustomer(customerLinkedList, false);
            } catch (Exception e) {
                System.out.println("nhập ko đúng hoặc bỏ trống, nhập lại: ");
            }
        }
    }

    @Override
    public void display() {
        customerLinkedList = ReadAll.readKhachHang();
        for (Customer customre : customerLinkedList) {
            System.out.println(customre);
        }
    }

    @Override
    public void edit() {
        editCustomer();
    }

    private void editCustomer() {
        customerLinkedList = ReadAll.readKhachHang();
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if (id == customerLinkedList.get(i).getId()) {
                flag = true;
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
                System.out.print("loai khach: ");
                String loaiKhach = scanner.nextLine();
                System.out.print("them dia chi: ");
                String diaChi = scanner.nextLine();
                Customer customer = new Customer(id, name, birth, gender, soCMND, soDienThoai, email, loaiKhach, diaChi);
                System.out.print(customer);
                customerLinkedList.set(i, customer);
                WriteAll.writeCustomer(customerLinkedList, false);
                break;
            }
        }
        if (flag == false) {
            System.out.println("ko ton tại ");
        }
    }
}
