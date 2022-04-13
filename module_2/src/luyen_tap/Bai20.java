package luyen_tap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

//bai20
//Viết chương trình cho phép người dùng nhập vào 1 chuỗi,
// kiểm tra chuỗi này có phù hợp với yêu cầu hay không.
//Nếu có thì in ra “Duyệt!”, ngược lại in ra “Không duyệt”.
//Yêu cầu về chuỗi là: Có độ dài không quá 20 ký tự,
// không được chứa ký tự khoảng trắng, bắt đầu bằng một ký tự chữ viết hoa (A - Z),
// kết thúc bằng một số (0 - 9).
// (Sử dụng biểu thức chính quy để ràng buộc định dạng)
public class Bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap vao 1 chuoi: ");
        String str = scanner.nextLine();
        if (str.matches("[A-Z].[\\d][0-9][^\\s]")) {
            System.out.println("duyet!");
        }else {
            System.out.println("khong duyet");
        }
    }
}
