package bai_tap_case_study.service.person_impl;

import bai_tap_case_study.model.person.Employee;
import bai_tap_case_study.service.interf.INhanVienService;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienServiceImpl implements INhanVienService {
    protected static Scanner scanner = new Scanner(System.in);
    protected static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    static {
        employeeArrayList.add(new Employee(1, "hoa1", "1/03", "nam", 123, 321, "hoa23@", "cao dang", "le tan", "50$"));
        employeeArrayList.add(new Employee(2, "hoa2", "2/03", "nam", 123, 321, "hoa23@", "cao dang", "phuc vu", "10$"));
        employeeArrayList.add(new Employee(3, "hoa3", "3/03", "nam", 123, 321, "hoa23@", "cao dang", "quan li ", "100$"));
        employeeArrayList.add(new Employee(4, "hoa4", "4/03", "nam", 123, 321, "hoa23@", "cao dang", "giam doc", "500$"));
        employeeArrayList.add(new Employee(5, "hoa4", "4/03", "nam", 123, 321, "hoa23@", "cao dang", "chuyen vien", "200$"));
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
        System.out.print("trinh do: ");
        String level = scanner.nextLine();
        System.out.print("them vi tri: ");
        String viTri = scanner.nextLine();
        System.out.print("them luong: ");
        String luong = scanner.nextLine();
        Employee employee = new Employee(id, name, birth, gender, soCMND, soDienThoai, email, level, viTri, luong);
        System.out.print(employee);
        employeeArrayList.add(employee);
    }

    @Override
    public void display() {
        for (Employee employee : employeeArrayList) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        System.out.print("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag =false;
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if(id==(employeeArrayList.get(i+1).getId())){
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
                System.out.print("trinh do: ");
                String level = scanner.nextLine();
                System.out.print("them vi tri: ");
                String viTri = scanner.nextLine();
                System.out.print("them luong: ");
                String luong = scanner.nextLine();
                Employee employee = new Employee(id, name, birth, gender, soCMND, soDienThoai, email, level, viTri, luong);
                System.out.print(employee);
                employeeArrayList.set(i,employee);
                break;
            }
        }
        if(flag==false){
            System.out.println("ko ton tại ");
        }
    }
}
