package luyen_tap;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//    In ra tất cả số nguyên tố trong khoảng từ 0 - n.
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so nguyen: ");
        int num = scanner.nextInt();
        boolean flag = true;
        if(num<2){
            flag=false;
        }else {
            for (int i = 2; i < num; i++) {
                flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("SNT: " + i);
                }
            }
        }
    }
}
