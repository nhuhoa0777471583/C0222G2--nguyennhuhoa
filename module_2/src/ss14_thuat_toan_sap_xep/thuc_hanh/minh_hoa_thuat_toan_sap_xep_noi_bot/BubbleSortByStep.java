package ss14_thuat_toan_sap_xep.thuc_hanh.minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("nhap: "+list.length + "  gia tri:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("them vao list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+"\t");
        }
        System.out.println("bat dau sap xep: ");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean flag = true;
        for (int i = 1; i < list.length && flag; i++) {
            flag = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("doi " + list[j] + " voi " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("Array may be sorted and next pass not needed ");
                break;
            }
            System.out.print("mang sau khi: " + i + " lan sap xep: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
