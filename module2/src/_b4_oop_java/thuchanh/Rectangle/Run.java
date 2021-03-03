package _b4_oop_java.thuchanh.Rectangle;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}
