package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Bai3GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("nhập số a:");
        a=sc.nextInt();

        System.out.print("nhập số b:");
        b=sc.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if(a==0||b==0)
            System.out.println("ko co UCLN");
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
            System.out.println("UCLN: " +a);
        }
    }
}
