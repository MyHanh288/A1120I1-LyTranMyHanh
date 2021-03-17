package _b7_Abstract_class_Interface.bai_tap.interface_resizeable;

import _b7_Abstract_class_Interface.thuc_hanh.interface_comparable.ComparableCircle;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("yellow", 2.3);
        shapes[1] = new Rectangle("blue",4.6,3.4);
        shapes[2] = new Square("orange",3.5);

        for (Shape shape : shapes) {
            System.out.println("Pre-random:" + shape);
            shape.resize(Math.random()*100+1);
            System.out.println("After-random:" + shape);
        }
    }
}
