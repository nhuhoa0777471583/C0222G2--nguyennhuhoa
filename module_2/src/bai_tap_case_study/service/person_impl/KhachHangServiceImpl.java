package bai_tap_case_study.service.person_impl;

import bai_tap_case_study.model.person.Customer;
import bai_tap_case_study.service.interf.IKhachHangService;

import java.util.LinkedList;
import java.util.Scanner;

public class KhachHangServiceImpl implements IKhachHangService {
    protected static Scanner scanner =new Scanner(System.in);
    protected static LinkedList<Customer>customerLinkedList=new LinkedList<>();
    static {
    customerLinkedList.add(new Customer(1, "hoa1", "1/03", "nam", 123, 321, "hoa23@", "Gold","sg"));
    customerLinkedList.add(new Customer(2, "hoa2", "2/03", "nam", 123, 321, "hoa23@", "Platinium","dn"));
    customerLinkedList.add(new Customer(3, "hoa3", "3/03", "nam", 123, 321, "hoa23@", "Diamond","hue"));
    customerLinkedList.add(new Customer(4, "hoa4", "4/03", "nam", 123, 321, "hoa23@", "Silver","hn"));
    customerLinkedList.add(new Customer(5, "hoa5", "5/03", "nam", 123, 321, "hoa23@", "Member","qtri"));
    }
    @Override
    public void add() {
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
        System.out.print("loai kach: ");
        String loaiKhach = scanner.nextLine();
        System.out.print("them di chi: ");
        String diaChi = scanner.nextLine();
        Customer customer = new Customer(id, name, birth, gender, soCMND, soDienThoai, email,loaiKhach,diaChi);
        System.out.print(customer);
        customerLinkedList.add(customer);
    }

    @Override
    public void display() {
        for (Customer customre:customerLinkedList) {
            System.out.println(customre);
        }
    }

    @Override
    public void edit() {
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag =false;
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if(id==customerLinkedList.get(i).getId()){
                flag=true;
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
                System.out.print("loai kach: ");
                String loaiKhach = scanner.nextLine();
                System.out.print("them di chi: ");
                String diaChi = scanner.nextLine();
                Customer customer = new Customer(id, name, birth, gender, soCMND, soDienThoai, email,loaiKhach,diaChi);
                System.out.print(customer);
                customerLinkedList.set(id,customer);
                break;
            }
        }
        if(flag==false){
            System.out.println("ko ton tại ");
        }
    }
}
