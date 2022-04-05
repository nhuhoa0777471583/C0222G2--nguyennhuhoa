package ss3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Bai2AddElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,0,0,0};
        int x;
        System.out.println("Enter element:  ");
        x =Integer.parseInt(sc.nextLine());
        int index;
        System.out.println("enter index : ");
        index =Integer.parseInt(sc.nextLine());
        if (index <= -1 || index >= arr.length - 1) {
            System.out.print("no!!! ");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            System.out.print("new array: ");
            for (int a : arr) {
                System.out.print(a + " ");
            }
        }
    }
}
