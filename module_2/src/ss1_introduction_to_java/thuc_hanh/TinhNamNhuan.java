package ss1_introduction_to_java.thuc_hanh;

import jdk.nashorn.internal.ir.Symbol;

import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nam;

        System.out.println("nhap nam: ");
        nam = sc.nextInt();
        boolean namNhuan = false;

        boolean namKhongNhuan4 = nam % 4 == 0;
        if (namKhongNhuan4) {
            boolean namKhongNhuan100 = nam % 100 == 0;
            if (namKhongNhuan100) {
                boolean namKhongNhuan400 = nam % 400 == 0;
                if (namKhongNhuan400) {
                    namNhuan = true;
                }
            } else {
                namNhuan = true;
            }
        }
        if (namNhuan) {
            System.out.printf("%d la nam nhuan", nam);
        } else {
            System.out.printf("%d la nam khong nhuan", nam);
        }
    }
}
