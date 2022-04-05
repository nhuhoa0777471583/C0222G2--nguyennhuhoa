package ss3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;

public class Bai5ElementMinInArray {
    public static void main(String[] args) {
        double[] arr = {5, 8, 9, 7.5, 7, 9.1, 4.9};

        System.out.println(Arrays.toString(arr));

        double min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("gia tri nho nhat: "+min);
    }
}
