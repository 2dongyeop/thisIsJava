package src.newCode.major.PracticeCode.chapter6;

public class Motor extends Vehicle{
    private String name = "자동차";
    private int displacement;

    public Motor() {} //생략 가능
    public Motor(double maxSpeed, int seater, int displacement) {
        super(maxSpeed,seater);
        this.displacement = displacement;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setSeater(int Seater) {
        this.seater = seater;
    }
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void printInfo() {
        System.out.print("name: " + name);
        System.out.println(", 최대속도: " + maxSpeed + " km");
        System.out.print("정원: " + seater + " 명");
        System.out.println(", 배기량: " + displacement + " cc");
    }

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setMaxSpeed(300);
        motor.setSeater(2);
        motor.setDisplacement(3500);
        motor.printInfo();
    }
}
