package src.newCode.major.PracticeCode.chapter5;

public class Computer {
    public String[] osType = {"윈도", "애플", "안드로이드"};
    public int ram = 0;
    public String ComOsType;

    public void print() {
        System.out.println("운영체제: " + this.ComOsType + ", 메인메모리: " + this.ram);
    }

    public Computer() {}
    public Computer(int i, int ram) {
        this.ram = ram;
        this.ComOsType = osType[i];
    }

    public static void main(String[] args) {
        Computer pc = new Computer(0, 16);
        Computer apple = new Computer(1, 32);
        Computer galaxy = new Computer(2, 16);
        pc.print();
        apple.print();
        galaxy.print();
    }


}
