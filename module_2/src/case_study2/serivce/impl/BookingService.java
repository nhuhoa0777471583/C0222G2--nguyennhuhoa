package case_study2.serivce.impl;

import case_study2.common.read_and_write.Read;
import case_study2.common.read_and_write.Write;
import case_study2.model.Booking;
import case_study2.serivce.impl.facility.FacilityServiceImpl;
import case_study2.serivce.inter.IBookingService;

import java.util.*;

public class BookingService implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Booking> bookingList = new ArrayList<>();

//    static {
//        //mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.
//        booking.add(new Booking("BK-1234", "2/2/2022", "5/2/2022",
//                "123", "RO", "massa"));
//        booking.add(new Booking("BK-1234", "2/2/2022", "5/2/2022",
//                "22", "VL", "free eat"));
//        Write.writeBooking(booking,false);
//    }

    @Override
    public void add() {
        bookingList = Read.readBooking();
        System.out.println("them ma booking: ");

        Integer maKhachHang = Integer.parseInt(scanner.nextLine());
        System.out.println("them ngay bat dau: ");
        String ngayBatDau = scanner.nextLine();
        System.out.println("them ngay ket thuc: ");
        String ngayKetThuc = scanner.nextLine();

        CustomerServiceImpl.displayIdCustomer();
        String idCustmer = CustomerServiceImpl.getIdCustomer();

        FacilityServiceImpl.displayFacility();
        String tenDichVu = FacilityServiceImpl.displayIdFacility();

        System.out.println("them loai dich vu: ");
        String loaiDichVu = scanner.nextLine();
        Booking b = new Booking(maKhachHang, ngayBatDau, ngayKetThuc, idCustmer, tenDichVu, loaiDichVu);
        System.out.println(b);
        bookingList.add(b);
        Write.writeBooking(bookingList, false);
    }

    @Override
    public void display() {
        bookingList = Read.readBooking();
        Collections.sort(bookingList, new Comparator<Booking>() {
            @Override
            public int compare(Booking o1, Booking o2) {
                return o1.getMaBooking().compareTo(o2.getMaBooking());
            }
        });
        for (Booking b : bookingList) {
            System.out.println(b);
        }
    }

    @Override
    public void edit() {

    }

}
