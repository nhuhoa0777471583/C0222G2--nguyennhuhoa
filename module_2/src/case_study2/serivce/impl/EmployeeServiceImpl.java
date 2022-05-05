package case_study2.serivce.impl;

import case_study2.common.read_and_write.Read;
import case_study2.common.read_and_write.Write;
import case_study2.model.person.Employee;
import case_study2.serivce.inter.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

//    static {
//        //Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
//        employeeList.add(new Employee(1, "nhuhoa1", "23/3", "nam", 1234, 4444,
//                "hoa23@", "nhuhoa23@", "caodang", "le tan", "5000"));
//        employeeList.add(new Employee(2, "nhuhoa2", "24/3", "nam", 1234, 4444,
//                "hoa23@", "nhuhoa23@", "dai hoc", "quan li", "10000"));
//        employeeList.add(new Employee(3, "nhuhoa3", "25/3", "nam", 1234, 4444,
//                "hoa23@", "nhuhoa23@", "trung cap", "nhan vien", "3000"));
//        Write.writeEmployee(employeeList,true);
//    }

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
        System.out.print("them ma nhan vien: ");
        String maNhanVien = sc.nextLine();
        System.out.print("them trinh do: ");
        String trinhDo = sc.nextLine();
        System.out.print("them vi tri: ");
        String viTri = sc.nextLine();
        System.out.print("them luong: ");
        String luong = sc.nextLine();
        employeeList.add(new Employee(id, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong));
        System.out.println(employeeList);
        Write.writeEmployee(employeeList, false);
    }

    @Override
    public void display() {
        employeeList = Read.readEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        employeeList = Read.readEmployee();
        System.out.print("nhap id can sửa: ");
        Integer id = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (id == employeeList.get(i).getId()) {
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
                System.out.print("sửa ma nhan vien: ");
                String maNhanVien = sc.nextLine();
                System.out.print("sửa trinh do: ");
                String trinhDo = sc.nextLine();
                System.out.print("sửa vi tri: ");
                String viTri = sc.nextLine();
                System.out.print("sửa luong: ");
                String luong = sc.nextLine();
                Employee employee = new Employee(id, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);
                System.out.println(employee);
                employeeList.set(i, employee);
                Write.writeEmployee(employeeList, false);
            }
        }
        if (flag == false) {
            System.out.println("ko co trong danh sách cần sửa!!");
        }
    }
}
