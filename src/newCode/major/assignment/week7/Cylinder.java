package src.newCode.major.assignment.week7;

public class Cylinder {
    static newCode.major.assignment.week7.Circle circle;
    static double height;

    public Cylinder(newCode.major.assignment.week7.Circle c, double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        circle = new newCode.major.assignment.week7.Circle(2.8);
        height = 5.6;

        System.out.println("원통의 부피 : " + getVolume());

        Cylinder cd = new Cylinder(new newCode.major.assignment.week7.Circle(2.8), 5.6);
    }

    public static double getVolume() {
        return circle.getArea() * height;
    }
}
