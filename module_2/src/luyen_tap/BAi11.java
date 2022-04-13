package luyen_tap;

import java.util.Arrays;
import java.util.Scanner;


public class BAi11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //bai 11
//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
        double[] arr = {1, 2, 3, 4, 5, 2, 5, 7};
        double sum = 0;
        double tb;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(sum);
        }
        tb = sum / arr.length;
        System.out.println("gia tri tb: " + tb);

//bai12
//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
//Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
        int[] n = new int[5];
        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            System.out.print("nhap so nguyen: ");
            n[i] = scanner.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
//        System.out.println("so lon nhat la: " + max);
        //bai 13 //Viết chương trình cho phép nhập vào n,
        // sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
        //Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.

        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        System.out.println("min= " + min);
//        //bai 14
        // Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
        //Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.
        int[]num={1,2,3,4,5};
        int a=0;
        int b=num.length-1;
        System.out.println(Arrays.toString(num));
      while (a<b){
          int temp=num[a];
          num[a]=num[b];
          num[b]=temp;
          a++;
          b--;
        }
        System.out.println(Arrays.toString(num));
    }
}
