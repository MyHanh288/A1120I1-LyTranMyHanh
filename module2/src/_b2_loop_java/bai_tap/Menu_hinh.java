package _b2_loop_array_java.bai_tap;

import java.util.Scanner;

public class Menu_hinh {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    int n, m;
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Input n: ");
                    System.out.println("Input m: ");
                    n = scanner1.nextInt();
                    m = scanner1.nextInt();
                    for (int i = 1; i <= n; i++) {
                        for (int k = 1; k <= m; k++) {
                            if (i == 1 || k == 1 || i == n || k == m) {
                                System.out.printf("*");
                            } else {
                                System.out.printf(" ");
                            }
                        }
                        System.out.printf("\n");
                        break;
                    }
            }
        }
    }
}
