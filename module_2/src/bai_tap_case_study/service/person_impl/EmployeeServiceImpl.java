package bai_tap_case_study.service.person_impl;

import bai_tap_case_study.common.read_write.ReadAll;
import bai_tap_case_study.common.read_write.WriteAll;
import bai_tap_case_study.common.validate.ValidateAll;
import bai_tap_case_study.model.person.Employee;
import bai_tap_case_study.service.interf.i_preson.IEmployyeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployyeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeArrayList = new ArrayList<>();

    static {
//        id, name, birth, gender, soCMND, soDienThoai, email, level,ma nhan vien, viTri, luong
//         employeeArrayList.add(new Employee(1,"hoa1","23/3","nam",123,
//                 0122,"hoa123","Hoa111","cao đẳng","nhan vien","100"));
//
//         employeeArrayList.add(new Employee(2,"hoa1","23/3","nam",123,
//                 0122,"hoa123","Hoa222","đại học","quản lí","200"));
//
//         employeeArrayList.add(new Employee(3,"hoa1","23/3","nam",123,
//                 0122,"hoa123","Hoa444","sau đại học","giám đốc","500"));
        WriteAll.writeEmployee(employeeArrayList, true);
    }


    @Override
    public void add() {
        methodAdd();
    }

    private void methodAdd() {
//        employeeArrayList = ReadAll.readEmployee();
        System.out.print("them id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("them ho ten: ");
        String name = scanner.nextLine();

        System.out.print("them ngay sinh: ");
        String birth = scanner.nextLine();
        ValidateAll.isMatchesBirth(birth);

        System.out.print("them gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.print("them so CMND: ");
        int soCMND = Integer.parseInt(scanner.nextLine());
        System.out.print("them so dien thoai: ");
        int soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.print("them email: ");
        String email = scanner.nextLine();
        System.out.print("nhap ma nhan vien: ");
        String maNhanVien = scanner.nextLine();


        String trinhDo = addTrinhDo();
        String viTri = addViTri();

        System.out.print("them lương: ");
        String luong = scanner.nextLine();
        Employee employee1 = new Employee(id, name, birth, gender, soCMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);
        System.out.print(employee1);
        employeeArrayList.add(employee1);
        WriteAll.writeEmployee(employeeArrayList, false);
    }

    private String addViTri() {
        System.out.print("them vị trí:\n" +
                "1.Lễ tân\n" +
                "2.phục vụ\n" +
                "3.chuyên viên\n" +
                "4.giám sát\n" +
                "5.quản lý\n" +
                "6.giám đốc\n" +
                "chọn vị trí: ");
        int choose2 = scanner.nextInt();
        String viTri = scanner.nextLine();
        switch (choose2) {
            case 1:
                viTri = "Lễ tân";
                break;
            case 2:
                viTri = "phục vụ";
                break;
            case 3:
                viTri = "chuyên viên";
                break;
            case 4:
                viTri = "giám sát";
                break;
            case 5:
                viTri = "quản lý";
                break;
            case 6:
                viTri = "giám đốc";
                break;

        }
        return viTri;
    }

    private String addTrinhDo() {
        System.out.println("các trinh do:\n" +
                "1.Trung cấp\n" +
                "2.Cao đẳng\n" +
                "3.Đại học\n" +
                "4.sau đại học\n" +
                "chon trình độ: ");
        int choose = scanner.nextInt();
        String trinhDo = scanner.nextLine();
        switch (choose) {
            case 1:
                trinhDo = "trung cap";
                break;
            case 2:
                trinhDo = "Cao đẳng";
                break;
            case 3:
                trinhDo = "Đại học";
                break;
            case 4:
                trinhDo = "sau đại học";
                break;

        }
        return trinhDo;
    }


    @Override
    public void display() {
        employeeArrayList = ReadAll.readEmployee();
        for (Employee employee : employeeArrayList) {
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        editEmployee();
    }

    private void editEmployee() {
        employeeArrayList = ReadAll.readEmployee();
        System.out.print("nhap id cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (id == (employeeArrayList.get(i).getId())) {
                flag = true;
                System.out.print("sua id moi: ");
                id = Integer.parseInt(scanner.nextLine());
                System.out.print("sua ho ten moi: ");
                String name = scanner.nextLine();
                System.out.print("sua ngay sinh moi: ");
                String birth = scanner.nextLine();
                System.out.print("sua gioi tinh moi: ");
                String gender = scanner.nextLine();
                System.out.print("sua so CMND moi: ");
                int soCMND = Integer.parseInt(scanner.nextLine());
                System.out.print("sua so dien thoai moi: ");
                int soDienThoai = Integer.parseInt(scanner.nextLine());
                System.out.print("sua email moi: ");
                String email = scanner.nextLine();
                System.out.print("sua ma nhan vien moi: ");
                String maNhanVien = scanner.nextLine();
                System.out.print("sua trinh do moi: ");
                String level = scanner.nextLine();
                System.out.print("sua vi tri moi: ");
                String viTri = scanner.nextLine();
                System.out.print("sua luong moi: ");
                String luong = scanner.nextLine();
                System.out.println();
                Employee employee = new Employee(id, name, birth, gender, soCMND, soDienThoai, email, maNhanVien, level, viTri, luong);
                System.out.print(employee);
                employeeArrayList.set(i, employee);
                WriteAll.writeEmployee(employeeArrayList, false);
                break;
            }
        }
        if (flag == false) {
            System.out.println("ko có id trong đây, nhập lại id ");
        }
    }
}



