package case_study2.common.read_and_write;

import case_study2.model.ficility.House;
import case_study2.model.ficility.Room;
import case_study2.model.ficility.Villa;
import case_study2.model.person.Customer;
import case_study2.model.person.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Write {
    private static final String ROOM_CSV = "src/case_study2/common/data/room.csv";
    private static final String VILLA_CSV = "src/case_study2/common/data/villa.csv";
    private static final String HOUSE_CSV = "src/case_study2/common/data/house.csv";
    private static final String EMPLOYEE_CSV = "src/case_study2/common/data/employee.csv";
    private static final String CUSTOMER_CSV = "src/case_study2/common/data/customer.csv";

    public static void writeAll(List<String> stringList, String pathFile, boolean flag) {
        try {
            FileWriter fw = new FileWriter(pathFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String str : stringList) {
                bw.write(str);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeEmployee(List<Employee> employeeList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Employee emp : employeeList) {
            stringList.add(emp.getInfoEmployee());
        }
        writeAll(stringList, EMPLOYEE_CSV, flag);
    }

    public static void writeCustomer(List<Customer> customerList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Customer cus : customerList) {
            stringList.add(cus.getInfoCustomer());
        }
        writeAll(stringList, CUSTOMER_CSV, flag);
    }

    public static void writeVilla(Map<Villa, Integer> villaMap, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Villa, Integer> entryVilla : villaMap.entrySet()) {
            stringList.add(entryVilla.getKey().getInfoVilla() + "," + entryVilla.getValue());
        }
        writeAll(stringList, VILLA_CSV, flag);
    }

    public static void writeRoom(Map<Room, Integer> roomMap, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Room, Integer> entryRoom : roomMap.entrySet()) {
            stringList.add(entryRoom.getKey().getInfoRoom() + "," + entryRoom.getValue());
        }
        writeAll(stringList, ROOM_CSV, flag);
    }

    public static void writeHouse(Map<House, Integer> houseMap, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<House, Integer> entryHouse : houseMap.entrySet()) {
            stringList.add(entryHouse.getKey().getInfoHouse() + "," + entryHouse.getValue());
        }
        writeAll(stringList, HOUSE_CSV, flag);
    }
}
