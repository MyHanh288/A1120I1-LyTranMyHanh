package _b4_oop_java.bai_tap.Fan;

public class Fan {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    static final int slow = 1;
    static final int medium = 2;
    static final int fast = 3;

    public Fan(){

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getSlow() {
        return slow;
    }

    public static int getMedium() {
        return medium;
    }

    public static int getFast() {
        return fast;
    }

    public String toString(){
        if (isOn()) {
            return "Speed: " + getSpeed() + " Color: " + getColor() + " Radius: " + getRadius()  + ". The fan is ON.";
        } else {
            return "Color: " + getColor() + " Radius: " + getRadius() + ". The fan is OFF.";
        }
    }
}
