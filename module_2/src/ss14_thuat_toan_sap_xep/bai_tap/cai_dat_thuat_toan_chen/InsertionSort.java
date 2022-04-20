package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_chen;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap size");
        int size= Integer.parseInt(scanner.nextLine());
        double[] list = new double[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("nhap ptu");
            list[i]=Double.parseDouble(scanner.nextLine());
        }
    }
}
