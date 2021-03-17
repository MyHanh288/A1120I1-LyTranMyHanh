package _b7_Abstract_class_Interface.bai_tap.interface_colorable;

public class Square extends Shape implements Colorable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public String toString() {
        return "Square{" + "side = " + side + ", color = " + super.getColor() +  ", Area = " + getArea()+'}';
    }

    @Override
    public String howToColor() {
        return "Color all four sides.";
    }
}
