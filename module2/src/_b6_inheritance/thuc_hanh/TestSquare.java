package _b6_inheritance.thuc_hanh;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.5);
        System.out.println(square);

        square = new Square("yellow", true, 5.8);
        System.out.println(square);
    }
}
