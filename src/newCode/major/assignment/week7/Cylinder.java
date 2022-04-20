package newCode.major.assignment.week7;

public class Cylinder {
    static Circle circle;
    static double height;

    public Cylinder(Circle c, double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        circle = new Circle(2.8);
        height = 5.6;

        System.out.println("원통의 부피 : " + getVolume());

        Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
    }

    public static double getVolume() {
        return circle.getArea() * height;
    }
}
