package case_study2.serivce.impl;

import case_study2.model.Booking;
import case_study2.model.person.Customer;
import case_study2.serivce.impl.CustomerServiceImpl;
import case_study2.serivce.inter.IBookingService;

import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class BookingService implements IBookingService {
    private static Customer customer = new Customer();
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static Set<CustomerServiceImpl> customerSet = new TreeSet<>();

    //    private static Queue<Booking> bookingQueue ;
//    static {
//        bookingQueue.add(new Booking("111","1/2/2022","3/2/2022"));
//        bookingQueue.add(new Booking("333","1/2/2022","5/2/2022"));
//        bookingQueue.add(new Booking("222","3/3/2022","10/3/2022"));
//    }
    @Override
    public void add() {

    }

    @Override
    public void display() {

        customerService.display();

    }

    @Override
    public void edit() {

    }
}
