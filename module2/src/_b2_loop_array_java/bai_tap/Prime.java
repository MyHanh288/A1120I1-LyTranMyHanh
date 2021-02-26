package _b2_loop_array_java.bai_tap;

import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static void display() {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        int i = 2;
        int count = 0;
        while (count < num) {
            if (isPrime(i)) {
                System.out.print(" " + i);
                count++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        display();
    }
}
