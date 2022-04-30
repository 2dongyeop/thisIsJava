package src.newCode.major.PracticeCode.chapter5;

public class Cylinder {
    static double height;

    public Cylinder(Circle circle, double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.8);
        height = 5.6;
        System.out.println(getVolume(circle));

        Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
    }
    public static double getVolume(Circle circle) {
        return circle.getArea() * height;
    }
}
