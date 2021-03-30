package _b10_generic_stack_queue.bai_tap.reverse_stack;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int n, m;
        Stack<Integer> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap vao so phan tu trong mang: ");
            n = scanner.nextInt();
        } while (n<=0);
        System.out.println("Nhap cac phan tu cho mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            m = scanner.nextInt();
            myStack.push(m);
        }
        System.out.println("Mang stack ban dau :" + myStack);

        Stack<Integer> myStack1 = new Stack<>();
        for (int j = myStack.size(); j > 0; j--){
            System.out.println(myStack1.push(myStack.peek()));
            myStack.pop();
        }
        System.out.println("Mang stack sau khi dao nguoc :" + myStack1);
    }
}



