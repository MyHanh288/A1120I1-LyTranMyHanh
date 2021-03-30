package _b10_generic_stack_queue.bai_tap.bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bieu thuc can kiem tra : ");

        String bieuthuc = scanner.nextLine();
        Stack<String> myStack = new Stack<>();
        for (int index=0; index<bieuthuc.length(); index++){
            if(bieuthuc.charAt(index)=='('){
                String sym = myStack.push("(");
            }
            if(bieuthuc.charAt(index)==')'){
                if(myStack.isEmpty()){
                    System.out.println("False");
                }else{
                    String left = myStack.push(")");
                }
            }

        }
    }
}
