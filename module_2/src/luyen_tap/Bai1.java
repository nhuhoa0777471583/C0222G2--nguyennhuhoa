package luyen_tap;

import java.util.Objects;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap MSSV: ");
        String MSSV = scanner.nextLine();
        if(MSSV.matches("B\\d{7}")){
            System.out.println("dung roi!!");
        }else{
            System.out.println("khong dung");
        }
    }
}
