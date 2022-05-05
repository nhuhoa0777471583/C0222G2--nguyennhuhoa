package bai_tap_case_study.common.read_write;

import bai_tap_case_study.model.facility.House;
import bai_tap_case_study.model.facility.Room;
import bai_tap_case_study.model.facility.Villa;
import bai_tap_case_study.model.person.Customer;
import bai_tap_case_study.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAll {

    public static List<String> readAll(String pathFile, boolean flag) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Employee> readEmployee() {
        List<String> stringList = readAll("src/bai_tap_case_study/common/data/nhan_vien.csv",true);
        List<Employee> listEmployee = new ArrayList<>();
        String[] arr = null;
//int id,String hoVaTen, String ngaySinh, String gioiTinh, int soCMND
//            , int soDT, String email, ma nhanvien,String tinhDo, String viTri, String luong
        for (String str : stringList) {
            arr = str.split(",");
            listEmployee.add(new Employee(Integer.parseInt(arr[0]), arr[1],
                    arr[2], arr[3], Integer.parseInt(arr[4]),
                    Integer.parseInt(arr[5]), arr[6], arr[7],arr[8],
                    arr[9], arr[10]));
        }
        return listEmployee;
    }

    public static List<Customer> readCustomer() {
        List<String> stringList = readAll("src/bai_tap_case_study/common/data/khach_hang.csv",true);
        List<Customer> listCustomer = new ArrayList<>();
        String[] arr1 = null;

        //int id,String hoVaTen, String ngaySinh, String gioiTinh,
        //  int soCMND, int soDT, String email, String loaiKhach, String diaChi
        for (String str1 : stringList) {
            arr1 = str1.split(",");
            listCustomer.add(new Customer(Integer.parseInt(arr1[0]), arr1[1],
                    arr1[2], arr1[3], Integer.parseInt(arr1[4]),
                    Integer.parseInt(arr1[5]), arr1[6],arr1[7], arr1[8], arr1[9]));
        }
        return listCustomer;
    }


    public static List<Villa> readVilla() {
        List<String> stringList = readAll("src/bai_tap_case_study/common/data/villa.csv",true);
        List<Villa> villaList= new ArrayList<>();
        String[] arr = null;

        //String maDichVu,String tenDichVu,String chiPhiThue, String dienTichSuDung, String soLuongNguoi,
        //  String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang)
        for (String str : stringList) {
            arr = str.split(",");
            villaList.add( new Villa(arr[0], arr[1], arr[2], arr[3],
                    arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return villaList;
    }

    public static List<Room> readRoom() {
        List<String> stringList = readAll("src/bai_tap_case_study/common/data/room.csv",true);
        List<Room> roomList= new ArrayList<>();
        String[] arr = null;

        //String maDichVu,String tenDichVu, String chiPhi, String dienTichSuDung,
        //                String soLuongNguoi, String kieuThue,String dichVuFree
        for (String str : stringList) {
            arr = str.split(",");
            roomList.add( new Room(arr[0], arr[1], arr[2], arr[3],
                    arr[4], arr[5], arr[6]));
        }
        return roomList;
    }


    public static List<House> readHouse() {
        List<String> stringList = readAll("src/bai_tap_case_study/common/data/house.csv",true);
        List<House> houseList= new ArrayList<>();
        String[] arr = null;

        //String maDichVu, String tenDichVu, String chiPhiThue, String dienTichSuDung,
       //         String soLuongNguoi, String kieuThue, String tieuChuanPhong, String soTang
        for (String str : stringList) {
            arr = str.split(",");
            houseList.add( new House(arr[0], arr[1], arr[2], arr[3],
                    arr[4], arr[5], arr[6],arr[7]));
        }
        return houseList;
    }
}
