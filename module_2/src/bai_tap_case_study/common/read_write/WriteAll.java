package bai_tap_case_study.common.read_write;

import bai_tap_case_study.model.facility.House;
import bai_tap_case_study.model.facility.Room;
import bai_tap_case_study.model.facility.Villa;
import bai_tap_case_study.model.person.Customer;
import bai_tap_case_study.model.person.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

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

    public static void writeEmployee(List<Employee> employeeList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Employee emp : employeeList) {
            stringList.add(emp.getInfoEmployee());
        }
        writeAll(stringList, "src/bai_tap_case_study/common/data/nhan_vien.csv", flag);
    }

    public static void writeCustomer(List<Customer> customerList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Customer cus : customerList) {
            stringList.add(cus.getInfoCustomer());
        }
        writeAll(stringList, "src/bai_tap_case_study/common/data/khach_hang.csv", flag);
    }


    public static void writeVilla(List<Villa> villaList, boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Villa v: villaList){
            stringList.add(v.getInfoVilla());
        }
        writeAll(stringList,"src/bai_tap_case_study/common/data/villa.csv",flag);
    }

    public static void writeHouse(List<House> houseList, boolean flag){
        List<String> stringList = new ArrayList<>();
        for (House h: houseList){
            stringList.add(h.getInfoHouse());
        }
        writeAll(stringList,"src/bai_tap_case_study/common/data/house.csv",flag);
    }

    public static void writeRoom(List<Room> roomList, boolean flag){
        List<String> stringList = new ArrayList<>();
        for (Room r: roomList){
            stringList.add(r.getInfoRoom());
        }
        writeAll(stringList,"src/bai_tap_case_study/common/data/room.csv",flag);
    }


}
