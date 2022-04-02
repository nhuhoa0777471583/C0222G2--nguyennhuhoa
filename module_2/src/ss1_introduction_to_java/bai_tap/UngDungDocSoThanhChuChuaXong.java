package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so can doc: ");
        int num = Integer.parseInt(sc.nextLine());
        if (0 <= num && num > 10) {
            switch (num) {
                case 0:
                    System.out.print("khong");
                    break;
                case 1:
                    System.out.print("mot");
                    break;
                case 2:
                    System.out.print("hai");
                    break;
                case 3:
                    System.out.print("ba");
                    break;
                case 4:
                    System.out.print("bon");
                    break;
                case 5:
                    System.out.print("nam");
                    break;
                case 6:
                    System.out.print("sau");
                    break;
                case 7:
                    System.out.print("bay");
                    break;
                case 8:
                    System.out.print("tam");
                    break;
                case 9:
                    System.out.print("chin");
                    break;
            }
        } else if (num < 20 && num >= 10) {
            switch (num) {
                case 10:
                    System.out.print("muoi");
                    break;
                case 11:
                    System.out.print("muoi mot");
                    break;
                case 12:
                    System.out.print("muoi hai");
                    break;
                case 13:
                    System.out.print("muoi bai");
                    break;
                case 14:
                    System.out.print("muoi bon");
                    break;
                case 15:
                    System.out.print("muoi lam");
                    break;
                case 16:
                    System.out.print("muoi sau");
                    break;
                case 17:
                    System.out.print("muoi bay");
                    break;
                case 18:
                    System.out.print("muoi tam ");
                    break;
                case 19:
                    System.out.print("muoi chin");
                    break;
            }
        } else {
            System.out.print("Số quá lớn");
        }
    }
}



