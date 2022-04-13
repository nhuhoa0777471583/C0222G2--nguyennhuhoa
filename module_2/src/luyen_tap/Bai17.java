package luyen_tap;

import java.util.Scanner;

//bai 17
//Viết chương trình cho phép người dùng nhập vào một chuỗi,
// sau đó nhập vào một ký tự.
//Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy
// trong chuỗi(nếu có, số đếm bắt đầu từ 0).
//Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi,
// nếu không thì in ra “Không tồn tại trong chuỗi”.
public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao 1 chuoi: ");
        String str = scanner.nextLine();

        System.out.print("nhap vao ki tu: ");
        char kiTu = scanner.nextLine().charAt(0);
        char[] mangKiTu = str.toCharArray();

        boolean flag=false;
        for (int i = 0; i < mangKiTu.length; i++) {
            if (kiTu == mangKiTu[i]) {
                System.out.println("ki tu nam o vi tri thu: "+i);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("khong co");
        }
    }
}
