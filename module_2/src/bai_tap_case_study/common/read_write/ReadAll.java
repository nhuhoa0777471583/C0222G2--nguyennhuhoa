package bai_tap_case_study.common.read_write;

import bai_tap_case_study.model.person.Customer;
import bai_tap_case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAll {

    public static List<String> readAll(String pathFile) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null){
                stringList.add(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Employee> readNhanVien() {
        List<String> stringList= readAll("src/bai_tap_case_study/data/furama/nhan_vien.csv");
        List<Employee> listEmployee = new ArrayList<>();
        String[] arr=null;
//int id,String hoVaTen, String ngaySinh, String gioiTinh, int soCMND
//            , int soDT, String email, String tinhDo, String viTri, String luong
        for (String str: stringList){
            arr=str.split(",");
            listEmployee.add(new Employee(Integer.parseInt(arr[0]),arr[1],
                    arr[2],arr[3],Integer.parseInt(arr[4]),
                    Integer.parseInt(arr[5]),arr[6],arr[7],
                    arr[8],arr[9]));
        }
        return listEmployee;
    }

    public static List<Customer> readKhachHang(){
        List<String> stringList= readAll("src/bai_tap_case_study/data/furama/khach_hang.csv");
        List<Customer> listCustomer = new ArrayList<>();
        String[] arr1=null;
        //int id,String hoVaTen, String ngaySinh, String gioiTinh,
        //  int soCMND, int soDT, String email, String loaiKhach, String diaChi
        for(String str1: stringList){
            arr1=str1.split(",");
            listCustomer.add(new Customer(Integer.parseInt(arr1[0]),arr1[1],
                    arr1[2],arr1[3],Integer.parseInt(arr1[4]),
                    Integer.parseInt(arr1[5]),arr1[6],arr1[7],arr1[8]));
        }
        return listCustomer;
    }

}
