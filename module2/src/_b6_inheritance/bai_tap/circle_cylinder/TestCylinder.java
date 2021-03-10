package _b6_inheritance.bai_tap.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.6);
        System.out.println(cylinder);

        cylinder = new Cylinder(3.4,"orange", 4.5);
        System.out.println(cylinder);
    }
}
