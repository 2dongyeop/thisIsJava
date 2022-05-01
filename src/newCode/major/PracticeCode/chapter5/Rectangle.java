package src.newCode.major.PracticeCode.chapter5;

public class Rectangle {
    private double garo;
    private double sero;

    public double getArea() {
        return garo * sero;
    }
    public double getCircumference() {
        return 2 * (garo + sero);
    }

    public Rectangle(double garo, double sero) {
        this.garo = garo;
        this.sero = sero;
    }
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(3.82, 8.65);
        System.out.println("면적 : " + rc.getArea());
        System.out.println("둘레 : " + rc.getCircumference());
    }
}
