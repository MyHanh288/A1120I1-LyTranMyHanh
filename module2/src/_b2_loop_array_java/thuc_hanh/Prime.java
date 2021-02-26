package _b2_loop_array_java.thuc_hanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number :");
        int number = scanner.nextInt();

        if (number<2){
            System.out.print(number + " is not prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if(number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.print(number + " is a prime");
            else
                System.out.print(number + " is not a prime");
        }
    }
}
