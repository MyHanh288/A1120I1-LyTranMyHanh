package _b6_inheritance.bai_tap.triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(2.3,3.4,4.5);
        System.out.println(triangle);

        triangle = new Triangle("orange", false, 2.3, 4.5, 6.5);
        System.out.println(triangle);
    }
}
