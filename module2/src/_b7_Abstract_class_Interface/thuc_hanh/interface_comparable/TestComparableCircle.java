package _b7_Abstract_class_Interface.thuc_hanh.interface_comparable;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.6);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle("red", false, 3.5);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : comparableCircles) {
            System.out.println(circle);
        }

        Arrays.sort(comparableCircles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : comparableCircles) {
            System.out.println(circle);
        }
    }
}
