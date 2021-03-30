package _b10_generic_stack_queue.bai_tap.binary_decimal;

import java.util.Scanner;
import java.util.Stack;

public class Decimal_Binary {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân: ");
        int num = scanner.nextInt();
        while (num != 0)
        {
            int d = num % 2;
            myStack.push(d);
            num /= 2;
        }
        System.out.println("Giá trị nhị phân là: ");
        while (!(myStack.isEmpty() ))
        {
            System.out.print(myStack.pop());
        }
        System.out.println();
    }
}
