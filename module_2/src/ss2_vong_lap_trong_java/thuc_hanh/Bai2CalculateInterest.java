package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class Bai2CalculateInterest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double tien=0;
        double laiSuat;
        int thang=1;
        double tienLai=0;
        System.out.print("nhập số tiền ban đầu: ");
        tien=sc.nextDouble();
        
        System.out.print("nhập tỉ lệ lãi hằng năm: ");
        laiSuat=sc.nextDouble();
        
        System.out.print("nhập số tháng: ");
        thang= sc.nextInt();

        for (int i = 0; i < thang; i++) {
            tienLai = tien*((laiSuat/100)/12)*thang;

        } System.out.print("tien lãi  : " + tienLai);
    }
}
