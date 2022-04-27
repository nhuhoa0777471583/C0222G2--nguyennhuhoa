package bai_tap_case_study.common.read_write;

import bai_tap_case_study.model.person.Customer;
import bai_tap_case_study.model.person.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteAll {
    public static void writeAll(List<String> stringList, String pathFile, Boolean flag) {
        try {
            FileWriter fw = new FileWriter(pathFile,flag);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String str : stringList) {
                bw.write(str);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeNhanVien(List<Employee> employeeList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Employee emp : employeeList) {
            stringList.add(emp.getInfoEmployee());
        }
        writeAll(stringList, "src/bai_tap_case_study/data/furama/nhan_vien.csv", flag);
    }
    public static void writeKhachHang(List<Customer> customerList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Customer cus : customerList) {
            stringList.add(cus.getInfoCustomer());
        }
        writeAll(stringList, "src/bai_tap_case_study/data/furama/nhan_vien.csv", flag);
    }
}
