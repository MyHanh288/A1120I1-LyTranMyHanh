package _b7_Abstract_class_Interface.bai_tap.interface_resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius = " + radius + ", color = " + super.getColor()+ ", Area = " + getArea() + '}';
    }

    @Override
    public void resize (double percent) {
        this.radius += this.radius * percent/100;
    }
}
