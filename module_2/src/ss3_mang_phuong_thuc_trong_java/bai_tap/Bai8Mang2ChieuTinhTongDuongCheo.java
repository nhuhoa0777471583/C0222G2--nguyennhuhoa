package ss3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Bai8Mang2ChieuTinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("nhap hang: ");
        int hang=scanner.nextInt();
        System.out.print("nhap cot: ");
        int cot= scanner.nextInt();

        double[][] arr=new double[hang][cot];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("nhap phan tu"+"["+i+"]"+"["+j+"]"+": ");
                arr[i][j]=scanner.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


//        System.out.print("nhap hang: ");
//        hang=scanner.nextInt();
        double sumHangCheo=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==arr[i][i]){
                    sumHangCheo+=arr[i][j];
                }
            }
        }
        System.out.print("tong các phan tu ở hang cheo: "+sumHangCheo);
//
//
//        System.out.print("nhap cot: ");
//        cot=scanner.nextInt();
//        double sumCot=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j]==arr[i][cot]){
//                    sumCot+=arr[i][j];
//                }
//            }
//        }
//        System.out.println("tong các phan tu ở cot: "+sumCot);
    }
}
