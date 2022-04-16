package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_mang;

import java.util.Scanner;
import java.util.Stack;

public class NumberStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Stack<Integer>myNumbreStack =new Stack<>();

        myNumbreStack.add(1);
        myNumbreStack.add(2);
        myNumbreStack.add(3);
        myNumbreStack.add(4);
        myNumbreStack.add(5);
        myNumbreStack.add(6);
        System.out.println("mang ban dau");
        System.out.println(myNumbreStack);
        System.out.println("mang dao nguoc");
        for (int i = 0; i < myNumbreStack.size(); ) {
            System.out.println(myNumbreStack.pop());
        }


        System.out.println("DAO NGUOC CHUOI");
        Stack<String> wStack= new Stack<>();
        System.out.print("nhap chuoi:");
        String str= scanner.nextLine();

        System.out.println("chuoi ban dau: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print( wStack.push(str.charAt(i)+""));
        }
        System.out.println();
        System.out.println("chuoi dao nguoc");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(wStack.pop());
        }
    }
}
