package bai_tap_case_study.controller;

import bai_tap_case_study.service.facility_impl.FacilityServiceImpl;
import bai_tap_case_study.service.facility_impl.HouseService;
import bai_tap_case_study.service.facility_impl.RoomService;
import bai_tap_case_study.service.facility_impl.VillaService;
import bai_tap_case_study.service.person_impl.CustomerServiceImpl;
import bai_tap_case_study.service.person_impl.EmployeeServiceImpl;

import java.util.Scanner;

public class ControllerFurama {
    private static FacilityServiceImpl facility = new FacilityServiceImpl();
    private static HouseService house = new HouseService();
    private static RoomService room = new RoomService();
    private static VillaService villa = new VillaService();
    private static CustomerServiceImpl customer = new CustomerServiceImpl();
    private static EmployeeServiceImpl employee = new EmployeeServiceImpl();
    private static Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        while (true) {
            try {
                System.out.println("1.Employee Management\n" +
                        "2.Customer Management\n" +
                        "3.Facility Management \n" +
                        "4.Booking Management\n" +
                        "5.Promotion Management\n" +
                        "6.Exit\n" +
                        "chon chuc nang: ");
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        managementEmployee();
                        break;
                    case 2:
                        managementCustomers();
                        break;
                    case 3:
                        managementFacility();
                        break;
                    case 4:
                        managementBooking();
                        break;
                    case 5:
                        managementPromotion();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("-----Number not in the menu, enter:  ------");
            }
        }

    }

    //5
    private void managementPromotion() {
        while (true) {
            try {
                System.out.println("-----------");
                System.out.println("5 Promotion Management ");
                System.out.println("-----------");
                System.out.println("1.Display list customers use service\n" +
                        "2.Display list customers get voucher\n" +
                        "3.Return main menu\n" +
                        "chon chuc nang: ");
                int choose5 = scanner.nextInt();
                switch (choose5) {
                    case 1:
                        System.out.println("You choosse display list customers use service");
                        break;
                    case 2:
                        System.out.println("You choosse display list customers get voucher");
                        break;
                    case 3:
                        System.out.println("Return main menu");
                        return;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Number not in the menu, enter: ");

            }
        }
    }

    //4
    private void managementBooking() {
        while (true) {
            try {
                System.out.println("---------");
                System.out.println("4-Booking Managerment ");
                System.out.println("--------");
                System.out.println("1.Add new booking\n" +
                        "2.Display list booking\n" +
                        "3.Create new constracts\n" +
                        "4.Display list contracts\n" +
                        "5.Edit contracts\n" +
                        "6.Return main menu\n" +
                        "chon chuc nang: ");
                int choose4 = scanner.nextInt();
                switch (choose4) {
                    case 1:
                        System.out.println("You choosse add new booking");
                        break;
                    case 2:
                        System.out.println("You choosse display list booking");
                        break;
                    case 3:
                        System.out.println("You choosse create new constracts ");
                        break;
                    case 4:
                        System.out.println("You choosse display list contracts ");
                        break;
                    case 5:
                        System.out.println("You choosse edit contracts");
                        break;
                    case 6:
                        System.out.println("Return main menu");
                        return;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Number not in the menu, enter:  ");
            }
        }
    }

    //3
    private void managementFacility() {
        while (true) {
            try {
                System.out.println("----------------");
                System.out.println("3Facility Management:\n ");
                System.out.println("------------");
                System.out.println("1.Display list facility\n" +
                        "2.Add new facility\n" +
                        "3.Display list facility maintenance\n" +
                        "4.Return main menu\n" +
                        "chon chuc nang: ");
                int choose3 = scanner.nextInt();
                switch (choose3) {
                    case 1:
                        System.out.println("You choosse display facility");
                        facility.displayFacility();
                        break;
                    case 2:
                        System.out.println("You choosse Add facility");
                        menuFacility();
                        break;
                    case 3:
                        System.out.println("You choosse Display facility maintenance");
                        break;
                    case 4:
                        System.out.println("Return main menu");
                        return;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Number not in the menu, enter: ");
            }
        }
    }

    private void menuFacility() {
        while (true) {
            try {
                System.out.println("---------");
                System.out.println("1.Add New Villa\n" +
                        "2.Add New House\n" +
                        "3.Add New Room\n" +
                        "4.thoát menu\n" +
                        "Moi chon chuc nang:");
                int choos = scanner.nextInt();
                switch (choos) {
                    case 1:
                        System.out.println("You Chosse Add New Villa");
                        villa.addNewVila();
                        break;
                    case 2:
                        System.out.println("You Chosse Add New House");
                        house.addNewHouse();
                        break;
                    case 3:
                        System.out.println("You Chosse Add New Room");
                        room.addNewRoom();
                        break;
                    case 4:
                        System.out.println("---------Return menu---------");
                        return;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Number not in the menu, enter: ");
            }
        }
    }

    //2
    private void managementCustomers() {
        while (true) {
            try {
                System.out.println();
                System.out.println("2Customer Management: ");
                System.out.println("-----");
                System.out.println("1.Display list customers\n" +
                        "2.Add new customer\n" +
                        "3.Edit customer\n" +
                        "4.Return main menu\n" +
                        "chon chuc nang: ");
                int choose2 = scanner.nextInt();
                switch (choose2) {
                    case 1:
                        System.out.println("You choosse display customers");
                        customer.display();
                        break;
                    case 2:
                        System.out.println("You choosse add customers");
                        customer.add();
                        break;
                    case 3:
                        System.out.println("You choosse edit customers");
                        customer.edit();
                        break;
                    default:
                        throw new Exception();
                    case 4:
                        System.out.println("Return main menu");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Number not in the menu, enter: ");
            }
        }
    }

    //1
    private void managementEmployee() {
        while (true) {
            try {
                System.out.println();
                System.out.println("---------");
                System.out.println("1 Employee Management: ");
                System.out.println("--------");
                System.out.println("1.Display list employees\n" +
                        "2.Add new employee\n" +
                        "3.Edit employee\n" +
                        "4.Return main menu\n" +
                        "chon chuc nang: ");
                int choose1 = scanner.nextInt();
                switch (choose1) {
                    case 1:
                        System.out.println("You choosse display employee");
                        employee.display();
                        break;
                    case 2:
                        System.out.println("You choosse add employee");
                        employee.add();
                        break;
                    case 3:
                        System.out.println("You choosse edit employee");
                        employee.edit();
                        break;
                    case 4:
                        System.out.println("Return main menu");
                        return;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Number not in the menu, enter: ");
            }
        }
    }
}
