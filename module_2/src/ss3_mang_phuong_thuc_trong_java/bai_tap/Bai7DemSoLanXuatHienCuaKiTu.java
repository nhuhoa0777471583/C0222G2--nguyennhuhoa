package ss3_mang_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class Bai7DemSoLanXuatHienCuaKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arr = "nguyen nhu hoa";
        String arr2 = "n";
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr2.equalsIgnoreCase(String.valueOf(arr.charAt(i)))) {
                count++;
            }
        }
        System.out.print(count);
    }
}

