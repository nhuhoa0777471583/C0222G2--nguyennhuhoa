package luyen_tap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhap so nguyen: ");
        int num=scanner.nextInt();
        int sum=0;
        for (int i = 0; i < num; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("tong so chan: "+sum);

       int nhan=0;
        for (int i = 0; i < num; i++) {
            nhan*=i;
            nhan++;
        }
        System.out.println(nhan);

        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }
}
