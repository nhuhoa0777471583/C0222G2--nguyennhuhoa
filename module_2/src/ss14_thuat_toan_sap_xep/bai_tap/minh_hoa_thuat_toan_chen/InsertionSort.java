package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_chen;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[]list ={8,2,4,5,7,1,6,4};
//        System.out.print("nhap size: ");
//        int size=Integer.parseInt(scanner.nextLine());
//        int[]list=new int[size];
//        System.out.println("list co:"+ size+ " gia tri: ");
//        for (int i = 0; i < list.length; i++) {
//            list[i]=Integer.parseInt(scanner.nextLine());
//        }

        System.out.println("truoc khi chua đuoc chen: ");
        for (int i:list) {
            System.out.print(i+" ");
        }
        System.out.println();
        insertionSort(list);
        System.out.println("sau khi chen");
        for (int i:list) {
            System.out.print(i+" ");
        }
    }
    public static void insertionSort(int[]array){
        int pos;
        int x;
        for (int i = 1; i < array.length ; i++) {
            x=array[i];
            pos=i-1;

            while (pos>-1 && x< array[pos]){
                System.out.println("vi tri: "+pos+" doi voi ptu: "+x);
                array[pos+1]=array[pos];
                pos--;
            }
            array[pos+1]=x;
        }
    }
}
