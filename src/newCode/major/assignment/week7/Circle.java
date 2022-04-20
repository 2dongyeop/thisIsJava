package newCode.major.assignment.week7;

public class Circle {
    private double radius;
    public static double PI = 3.141592;

    //생성자 구현
    public Circle(double radius) {
        this.radius = radius;
    }

    //원의 반지름을 사용하여 원의 면적을 구하는 메소드
    public double getArea() {
        return PI * radius * radius;
    }
}
