package luyen_tap;

import java.util.Scanner;

//bai18
//Viết chương trình cho phép nhập vào một chuỗi,
// kiểm tra xem chuỗi này có xuất hiện số hay không.
//Nếu có tin ra “Có”, ngược lại, in ra “Không”.
public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");

        String str = scanner.nextLine();
        if (str.matches(".*\\d.*")) {
            System.out.println("co");
        } else {
            System.out.println("khong co");
        }
    }
}
