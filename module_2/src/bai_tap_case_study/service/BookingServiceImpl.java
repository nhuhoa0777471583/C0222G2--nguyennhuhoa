package bai_tap_case_study.service;

import bai_tap_case_study.service.facility_impl.FacilityServiceImpl;
import bai_tap_case_study.service.interf.IBookingService;
import bai_tap_case_study.service.person_impl.CustomerServiceImpl;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static Set<CustomerServiceImpl> customerSet = new TreeSet<>();

    //mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.
    static {

    }

    @Override
    public void add() throws Exception {

    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }


}
