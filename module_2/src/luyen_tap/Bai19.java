package luyen_tap;

import java.util.Scanner;

//bai 19
// Viết chương trình cho phép nhập vào một chuỗi
//Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
// In ra số lần đó.
public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String str=scanner.nextLine();
        char[]chuoi=str.toCharArray();
        int count=0;
        char kiTu='a';
        boolean flag=false;
        for (int i = 0; i < chuoi.length; i++) {
            if(kiTu==chuoi[i]){
                count++;
                flag=true;
            }else {
               flag=false;
            }
        }
        if(flag==true){
            System.out.println("xuat hien :"+count+ "lan");
        }else{
            System.out.println("khong co");
        }
    }
}
