package ss11_stack_queue.bai_tap.chuyen_doi;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanVaNhiPhan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        System.out.print("nhap vao so thap phan: ");
        int num=scanner.nextInt();
        while(num!=0){
            int d =num%2;
            stack.push(d);
            num=num/2;
        }
        System.out.println();
        System.out.print("gia tri nhi phan: ");
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
//        System.out.print("nhap so nhi phan: ");
//        int number= scanner.nextInt();
    }
}