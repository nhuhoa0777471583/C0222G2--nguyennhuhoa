package ss3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        int x;
        int index = 0;
        System.out.print("enter element: ");
        x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
                System.out.println("phan tu can xoa o vi tri: " + index);
            }
        }
        for (int j = index; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
