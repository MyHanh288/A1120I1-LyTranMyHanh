package _b7_Abstract_class_Interface.bai_tap.interface_resizeable;

public abstract class Shape implements Resizeable{
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + '}';
    }

}

