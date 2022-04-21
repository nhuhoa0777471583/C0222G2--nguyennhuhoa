package ss15_xu_li_ngoai_le_debug.thuc_hanh.su_dung_lop_array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random =new Random();
        Integer[]arr= new Integer[100];
        System.out.println("danh sách phần tử trong mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i]= random.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner =new Scanner(System.in);
        System.out.println();
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
