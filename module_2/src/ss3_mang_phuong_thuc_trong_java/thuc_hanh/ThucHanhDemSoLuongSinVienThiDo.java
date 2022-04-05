package ss3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class ThucHanhDemSoLuongSinVienThiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap size: ");
        int size =Integer.parseInt(sc.nextLine());
        double[] arr = new double[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap diem: ");
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                System.out.println("do roi!!" + arr[i]);
            } else {
                System.out.println("rot roi!!! " + arr[i]);
            }
        }
    }
}
