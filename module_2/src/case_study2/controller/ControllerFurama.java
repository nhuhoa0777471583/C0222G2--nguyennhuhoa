package case_study2.controller;

import case_study2.serivce.impl.CustomerServiceImpl;
import case_study2.serivce.impl.EmployeeServiceImpl;
import case_study2.serivce.impl.facility.FacilityServiceImpl;
import case_study2.serivce.impl.facility.HouseService;
import case_study2.serivce.impl.facility.RoomService;
import case_study2.serivce.impl.facility.VillaService;

import java.util.Scanner;

public class ControllerFurama {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    private static RoomService roomService = new RoomService();
    private static HouseService houseService = new HouseService();
    private static VillaService villaService = new VillaService();

    public void displayMenu() {
        while (true) {
            try {

                System.out.println("Welcome furama");
                System.out.println("1.Employee Management\n" +
                        "2.Customer Management\n" +
                        "3.Facility Management \n" +
                        "4.Booking Management\n" +
                        "5.Promotion Management\n" +
                        "6.Exit\n" +
                        "Chosse : ");
                int chosse = Integer.parseInt(scanner.nextLine());
                switch (chosse) {
                    case 1:
                        System.out.println("You chosse employee management: ");
                        employee();
                        break;
                    case 2:
                        System.out.println("You chosse Customer Management: ");
                        customer();
                        break;
                    case 3:
                        System.out.println("You chosse Facility Management: ");
                        facility();
                        break;
                    case 4:
                        System.out.println("You chosse Booking Management: ");
                        booking();
                        break;
                    case 5:
                        System.out.println("You chosse Promotion Management: ");
                        promotion();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                    case 0:
                        System.out.println("nhập lại: ");
                }
            }catch (Exception e){
                System.out.println("ko đc bỏ trống, nhập lại: ");
            }
        }

    }

    //5
    private void promotion() {
        while (true) {
            System.out.println("1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu\n" +
                    "Chosse : ");
            int chosse5 = Integer.parseInt(scanner.nextLine());
            switch (chosse5) {
                case 1:
                    System.out.println("You chosse display list customers use service");
                    break;
                case 2:
                    System.out.println("You chosse display list customers get voucher");
                    break;

                case 3:
                    System.out.println("Return main menu");
                    return;
                default:
                case 0:
                    System.out.println("nhập lại");
                    break;
            }
        }
    }

    //4
    private void booking() {
        while (true) {
            System.out.println("1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new constracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "6.Return main menu\n" +
                    "Chosse: ");
            int chosse4 = Integer.parseInt(scanner.nextLine());
            switch (chosse4) {
                case 1:
                    System.out.println("You chosse add new booking");
                    break;
                case 2:
                    System.out.println("You chosse display list booking");
                    break;
                case 3:
                    System.out.println("You chosse create new constracts");
                    break;
                case 4:
                    System.out.println("You chosse display list contracts");
                    break;
                case 5:
                    System.out.println("You chosse edit contracts");
                    break;

                case 6:
                    System.out.println("Return main menu");
                    return;
                default:
                case 0:
                    System.out.println("nhập lại");
                    break;
            }
        }
    }


    //3
    private void facility() {
        while (true) {
            System.out.println("1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n " +
                    "Chosse : ");
            int chosse3 = Integer.parseInt(scanner.nextLine());
            switch (chosse3) {
                case 1:
                    System.out.println("You chosse display new facility");
                    facilityService.displayAll();
                    break;
                case 2:
                    System.out.println("You chosse add new list facility");
                    System.out.println("1.Add New Villa\n" +
                            "2.Add New House\n" +
                            "3.Add New Room\n" +
                            "4.Back to menu\n" +
                            "Chosse: ");
                    int chosse4 = Integer.parseInt(scanner.nextLine());
                    switch (chosse4) {
                        case 1:
                            System.out.println("You chosse new villa");
                            villaService.addVilla();
                            break;
                        case 2:
                            System.out.println("You chosse new house");
                            houseService.addHouse();
                            break;
                        case 3:
                            System.out.println("You chosse new room");
                            roomService.addRoom();
                            break;
                    }
                    break;

                case 3:
                    System.out.println("You chosse display list facility maintenance");
                    facilityService.displayBaoTri();
                    break;

                case 4:
                    System.out.println("Return main menu");
                    return;
                default:
                case 0:
                    System.out.println("nhập lại");
                    break;
            }
        }
    }

    //2
    private void customer() {
        while (true) {
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu\n" +
                    "Chosse : ");
            int chosse2 = Integer.parseInt(scanner.nextLine());
            switch (chosse2) {
                case 1:
                    System.out.println("You chosse display list customers");
                    customerService.display();
                    break;
                case 2:
                    System.out.println("You chosse Add new customers");
                    customerService.add();
                    break;
                case 3:
                    System.out.println("You chosse Edit customers");
                    customerService.edit();
                    break;
                case 4:
                    System.out.println("Return main menu");
                    return;
                default:
                case 0:
                    System.out.println("nhập lại");
                    break;
            }
        }
    }

    //1
    private void employee() {
        while (true) {
            System.out.println("1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu\n" +
                    "chosse: ");
            int chosse1 = Integer.parseInt(scanner.nextLine());
            switch (chosse1) {
                case 1:
                    System.out.println("You chosse display list employees");
                    employeeService.display();
                    break;
                case 2:
                    System.out.println("You chosse Add new employees");
                    employeeService.add();
                    break;
                case 3:
                    System.out.println("You chosse Edit employees");
                    employeeService.edit();
                    break;
                case 4:
                    System.out.println("Return main menu");
                    return;
                default:
                case 0:
                    System.out.println("nhập lại");
                    break;
            }
        }
    }
}
