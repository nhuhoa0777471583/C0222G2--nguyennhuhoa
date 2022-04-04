package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Bai1CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("nhap so : ");
        num = sc.nextInt();

        if (num < 2) {
            System.out.println(num + "khong phai la so nguyen to!!!");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " la so nguyen to!!");
            } else {
                System.out.println(num + " khong phai la so nguyen to");
            }
        }
    }
}

