package luyen_tap;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //bai 16
        //Viết chương trình cho phép người dùng nhập vào một chuỗi,
        // sau đó nhập vào một ký tự.
        //Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không?
        // Nếu có in ra “Có”, ngược lại in ra “Không”.
        String str = "hoa";

        System.out.print("nhap vao 1 ki tu: ");
        char string = scanner.nextLine().charAt(0);
        char[] kiTu = str.toCharArray();
        boolean flag= false;
        for (int i = 0; i < kiTu.length; i++) {
            if (string == kiTu[i]) {
                System.out.println("co");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("khong co");
        }
    }
}
