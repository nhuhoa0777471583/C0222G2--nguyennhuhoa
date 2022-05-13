package crudtaosan.controller;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println();

        while (true) {
            try {
                System.out.println();
                Integer chosse = Integer.parseInt(scanner.nextLine());
                switch (chosse) {
                    case 1:
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        break;
                    case 3:
                        System.out.println();
                        break;
                    case 4:
                        System.out.println();
                        break;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("-----Number not in the menu, enter:  ------");
            }
        }
    }
}
