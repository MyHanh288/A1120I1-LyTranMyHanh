package _b2_loop_array_java.bai_tap;

import java.util.Scanner;

public class Prime_100 {
        static boolean isPrime(int n) {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0) return false;
            return true;
        }

        static void display() {
            int num;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input num: ");
            num = scanner.nextInt();
            if (num >= 2) {
                System.out.print(2);
            }
            for (int i = 3; i < num; i += 2) {
                if (isPrime(i)) {
                    System.out.print(" " + i);
                }
            }
        }
        public static void main(String[] args) {
            display();
        }
}
