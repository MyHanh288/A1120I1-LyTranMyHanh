package _b10_generic_stack_queue.bai_tap.palindrome;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra : ");
        String chuoi = scanner.nextLine();
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < chuoi.length(); i++) {
            myStack.push(chuoi.charAt(i));
        }
        String reverseString = "";

        while (!myStack.isEmpty()) {
            reverseString = reverseString+myStack.pop();
        }
        if (chuoi.equals(reverseString))
            System.out.println("Day la chuoi doi xung.");
        else
            System.out.println("Day khong phai la chuoi doi xung.");
    }
}
