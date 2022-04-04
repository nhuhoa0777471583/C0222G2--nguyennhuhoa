package ss3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class Bai3MaxValueInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhap size : ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.print("Size does not exceed 20");
            }
        }
            while (size > 20) ;
            array = new int[size];
            int i = 0;
            while (i < array.length) {
                System.out.print("Enter element" + (i + 1) + " : ");
                array[i] = sc.nextInt();
                i++;
            }
            System.out.print("Property list: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            int max = array[0];
            int index = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j + 1;
                }
            }
            System.out.print("The largest property value in the list is " + max + " ," +
                    "at position " + index);
        }
    }
