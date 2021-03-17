package _b7_Abstract_class_Interface.bai_tap.interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square("red",2.3);
        shapes[1] = new Square(3.4);
        for (Shape shape : shapes) {
            if(shape instanceof Square){
                Colorable colorable = (Square)shape;
                System.out.println(colorable.howToColor());
            }
        }
    }
}
