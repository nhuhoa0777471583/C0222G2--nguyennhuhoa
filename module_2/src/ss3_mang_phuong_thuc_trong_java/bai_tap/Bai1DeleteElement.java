package ss3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1DeleteElement {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        int x;
        int temp;
        System.out.print("enter element: ");
        x=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if(x==arr[arr.length-1]){
                arr[arr.length-1]=0;
            }
            if(x==arr[i]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.print("new array: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
