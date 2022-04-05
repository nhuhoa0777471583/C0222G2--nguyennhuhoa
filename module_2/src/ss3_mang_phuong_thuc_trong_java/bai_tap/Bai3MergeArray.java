package ss3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Bai3MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size 1: ");
        int size1 =Integer.parseInt(sc.nextLine());

        System.out.print("enter size 2: ");
        int size2 =Integer.parseInt(sc.nextLine());

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("enter element 1: ");
            arr1[i] =Integer.parseInt(sc.nextLine()) ;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("enter element 2: ");
            arr2[i] =Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[j];
            j++;
        }
        for (int i = 0; i < arr3.length ; i++) {
            System.out.print(arr3[i]);
        }

    }
}
