package src.newCode.major.PracticeCode.chapter5;

public class SalaryMan {
    static long salary = 1000000;
    public SalaryMan() {
        this.salary = 1000000;
    }
    public SalaryMan(long salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        System.out.println(new SalaryMan().getAnnualGross());
        System.out.println(new SalaryMan(2_000_000).getAnnualGross());
    }
    public static long getAnnualGross() {
        //연봉을 반환하는 메소드
        return salary + salary * 5;
    }
}
