package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("nhap a: ");
        a = sc.nextDouble();
        System.out.println("nhap b :");
        b = sc.nextDouble();
        System.out.println("nhap c : ");
        c = sc.nextDouble();
        if (a != 0) {
            double ans = (c - b) / a;
            System.out.printf("Phuong Trinh voi x=%f!\n", ans);
        } else {
            if (b == 0) {
                System.out.println("ket qua x! ");
            } else {
                System.out.println("khong co gia tri");
            }
        }
    }
}
