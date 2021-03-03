package _b4_oop_java.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class QuaEqu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no root");
        } else if (delta == 0) {
            System.out.println("The equation has 1 root is: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has 2 root is: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
    }
}
