package bai_tap_case_study.controller;

import bai_tap_case_study.service.ManageFurama;

import java.util.Scanner;

public class TextFurama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageFurama manageFurama = new ManageFurama();

        boolean flag = true;
        do {
            System.out.println("Cac chuc nang:\n " +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n");
            System.out.print("chon chuc nang: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1-Employee Management:\n");
                    boolean flag1 = true;
                    do {
                        System.out.println("1.Display list employees\n" +
                                "2.Add new employee\n" +
                                "3.Edit employee\n" +
                                "4.Return main menu\n");
                        System.out.print("chon chuc nang: ");
                        int choose1 = scanner.nextInt();
                        switch (choose1) {
                            case 1:
                                System.out.println("Display list employees");
                                break;
                            case 2:
                                System.out.println("Add new employee");
                                break;
                            case 3:
                                System.out.println("Edit employee");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                break;
                            default:
                                System.out.println("exit");
                                break;
                        }
                    } while (flag1);
                    break;
                case 2:
                    System.out.println("2-Customer Management:\n");
                    boolean flag2 = true;
                    do {
                        System.out.println("1.Display list customers\n" +
                                "2.Add new customer\n" +
                                "3.Edit customer\n" +
                                "4.Return main menu\n");
                        System.out.print("chon chuc nang: ");
                        int choose2 = scanner.nextInt();
                        switch (choose2) {
                            case 1:
                                System.out.println("1.Display list employees");
                                break;
                            case 2:
                                System.out.println("Add new customer");
                                break;
                            case 3:
                                System.out.println("Edit customer");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                break;
                            default:
                                System.out.println("exit");
                                break;
                        }
                    } while (flag2);
                    break;
                case 3:
                    System.out.println("3-Facility Management:\n ");
                    boolean flag3 = true;
                    do {
                        System.out.println("1.Display list facility\n" +
                                "2.Add new facility\n" +
                                "3.Display list facility maintenance\n" +
                                "4.Return main menu\n");
                        System.out.print("chon chuc nang: ");
                        int choose3 = scanner.nextInt();
                        switch (choose3) {
                            case 1:
                                System.out.println("Display list facility");
                                break;
                            case 2:
                                System.out.println("Add new facility");
                                break;
                            case 3:
                                System.out.println("Display list facility maintenance");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                break;
                            default:
                                System.out.println("exit");
                                break;
                        }
                    } while (flag3);

                    break;
                case 4:
                    System.out.println("4-Booking Management");
                    boolean flag4 = true;
                    do {
                        System.out.println("1.Add new booking\n" +
                                "2.Display list booking\n" +
                                "3.Create new constracts\n" +
                                "4.Display list contracts\n" +
                                "5.Edit contracts\n" +
                                "6.Return main menus\n");
                        System.out.print("chon chuc nang: ");
                        int choose4 = scanner.nextInt();
                        switch (choose4) {
                            case 1:
                                System.out.println("Add new booking");
                                break;
                            case 2:
                                System.out.println("Display list booking");
                                break;
                            case 3:
                                System.out.println("Create new constracts");
                                break;
                            case 4:
                                System.out.println("Display list contracts");
                                break;
                            case 5:
                                System.out.println("Edit contracts");
                                break;
                            case 6:
                                System.out.println("Return main menus");
                                break;
                            default:
                                System.out.println("exit");
                                break;
                        }
                    } while (flag4);
                    break;
                case 5:
                    System.out.println("5-Promotion Management");
                    boolean flag5 = true;
                    do {
                        System.out.println("1.Display list customers use service\n" +
                                "2.Display list customers get voucher\n" +
                                "3.Return main menus\n");
                        System.out.print("chon chuc nang: ");
                        int choose5 = scanner.nextInt();
                        switch (choose5) {
                            case 1:
                                System.out.println("Display list customers use service");
                                break;
                            case 2:
                                System.out.println("Display list customers get voucher");
                                break;
                            case 3:
                                System.out.println("Return main menus");
                                break;
                            default:
                                System.out.println("exit");
                                break;
                        }
                    } while (flag5);
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("-----");
            }
        } while (flag);

    }
}
