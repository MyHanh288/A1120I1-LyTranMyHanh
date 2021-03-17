package _b7_Abstract_class_Interface.bai_tap.interface_resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width = " + width + ", height = " + height + ", color = " + super.getColor() + " , Area = " + getArea()+'}';
    }

    @Override
    public void resize(double percent) {
        this.width += this.width * percent/100;
        this.height+= this.height * percent/100;
    }
}
