package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Bai1DisplayTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

            System.out.print("Menu\n" + "1 Print the rectangle\n" +
                    "2 Print the square triangle\n" +
                    "3 Print isosceles triangle\n" +
                    "4 Exit\n" +
                    "Enter choose :");
         while (choice != 0) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(" Print the rectangle");
                    int height = 5;
                    int width = 8;
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    choice = 0;
                    break;
                default:
                    System.out.println("het hinh roi!!!");
                    break;
            }
        }
    }
}
