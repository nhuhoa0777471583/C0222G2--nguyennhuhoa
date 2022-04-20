package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_chen;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] list= {9,5.4,4.8,7.3,1,2};
//        System.out.print("nhap size: ");
//        int size = Integer.parseInt(scanner.nextLine());
//        double[] list = new double[size];
//        for (int i = 0; i < list.length; i++) {
//            System.out.print("nhap ptu: ");
//            list[i] = Double.parseDouble(scanner.nextLine());
//        }
        for (double d : list) {
            System.out.print(d + " ");
        }

        System.out.println();
        insertionSort(list);
        System.out.println("sau khi chen:");
        for (double i : list) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(double[] list) {
        int pos;
        double x;
        for (int i = 0; i < list.length; i++) {
            pos = i - 1;
            x = list[i];

            while (pos >=0 && list[pos] > x) {
                list[pos + 1] = list[pos];
                pos--;
            }
            list[pos + 1] = x;
        }
    }
}
