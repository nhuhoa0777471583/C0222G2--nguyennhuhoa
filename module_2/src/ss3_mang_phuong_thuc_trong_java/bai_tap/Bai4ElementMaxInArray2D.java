package ss3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Bai4ElementMaxInArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size row: ");
        int row =Integer.parseInt(sc.nextLine());

        System.out.print("enter size col: ");
        int col = Integer.parseInt(sc.nextLine());

        double[][] arr = new double[row][col];

        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("enter element:  ");
                arr[i][j] =Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }
        }
        System.out.print("gia tri lon nhat : " + max);
    }
}
