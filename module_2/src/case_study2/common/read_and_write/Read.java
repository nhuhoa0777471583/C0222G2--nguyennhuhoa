package case_study2.common.read_and_write;

import case_study2.model.Booking;
import case_study2.model.ficility.House;
import case_study2.model.ficility.Room;
import case_study2.model.ficility.Villa;
import case_study2.model.person.Customer;
import case_study2.model.person.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Read {
    private static final String ROOM_CSV = "src/case_study2/common/data/room.csv";
    private static final String VILLA_CSV = "src/case_study2/common/data/villa.csv";
    private static final String HOUSE_CSV = "src/case_study2/common/data/house.csv";
    private static final String EMPLOYEE_CSV = "src/case_study2/common/data/employee.csv";
    private static final String CUSTOMER_CSV = "src/case_study2/common/data/customer.csv";
    public static final String BOOKING_CSV = "src/case_study2/common/data/booking.csv";

    public static List<String> readAll(String pathFile, boolean flag) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Employee> readEmployee() {
        List<String> stringList = readAll(EMPLOYEE_CSV, true);
        List<Employee> employeeList = new ArrayList<>();
        String[] arr = null;
        //id, hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong
        for (String str : stringList) {
            arr = str.split(",");
            employeeList.add(new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],
                    Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8], arr[9], arr[10]));
        }
        return employeeList;
    }


    public static List<Customer> readCustomer() {
        List<String> stringList = readAll(CUSTOMER_CSV, true);
        List<Customer> customerList = new LinkedList<>();
        String[] arr = null;
        //Integer id,String hoTen, String ngaySinh, String gioiTinh, Integer soCMND,
        //  Integer soDienThoai, String email, String maKhachHang, String loaiKhach, String diaChi
        for (String str : stringList) {
            arr = str.split(",");
            customerList.add(new Customer(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3],
                    Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], arr[7], arr[8],arr[9]));
        }
        return customerList;
    }

    public static Map<Villa,Integer> readVilla(){
        List<String>stringList= readAll(VILLA_CSV,true);
        Map<Villa,Integer>villaMap= new LinkedHashMap<>();
        String[]arr=null;
        for (String str: stringList){
            arr= str.split(",");
            //   //String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi,
            // String kieuThue, String tieuChuanPhong, String dienTichHoBoi, String soTang
            villaMap.put(new Villa(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]),Integer.parseInt(arr[9]));
        }
        return villaMap;
    }

    public static Map<Room,Integer> readRoom(){
        List<String>stringList= readAll(ROOM_CSV,true);
        Map<Room,Integer>roomMap= new LinkedHashMap<>();
        String[]arr=null;
        for (String str: stringList){
            arr= str.split(",");
            //String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi,
            //                String kieuThue, String freeService
            roomMap.put(new Room(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]),Integer.parseInt(arr[7]));
        }
        return roomMap;
    }

    public static Map<House,Integer> readHouse(){
        List<String>stringList= readAll(HOUSE_CSV,true);
        Map<House,Integer>houseMap= new LinkedHashMap<>();
        String[]arr=null;
        for (String str: stringList){
            arr= str.split(",");
            //String tenDichVu, String dienTichSuDung, String chiPhiThue, String soNguoi, String kieuThue,
            // String tieuChuanPhong, String soTang)
            houseMap.put(new House(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]),Integer.parseInt(arr[8]));
        }
        return houseMap;
    }
    public static List<Booking> readBooking(){
        List<String>stringList = readAll(BOOKING_CSV,true);
        List<Booking> bookingList= new ArrayList<>();
        String[]arr= null;
        for (String str: stringList){
            arr=str.split(",");
            //mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.
            bookingList.add(new Booking(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5]));
        }
        return bookingList;
    }
}
