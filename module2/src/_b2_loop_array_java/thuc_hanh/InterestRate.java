package _b2_loop_array_java.thuc_hanh;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestrate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of month: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestrate = scanner.nextDouble();
        double total_interest = 0;
        for(int i = 0; i < month; i++){
            total_interest += money * (interestrate/100)/12 * month;
        }
        System.out.println("Total of interest: " + total_interest);
    }

    public static class Greatest_common_factor {
        public static void main(String[] args) {
            int a;
            int b;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            a = scanner.nextInt();
            System.out.println("Enter b: ");
            b = scanner.nextInt();
            a = Math.abs(a);
            b = Math.abs(b);
            if (a == 0 || b == 0)
                System.out.println("No greatest common factor");
            while (a!=b) {
                if (a>b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}
