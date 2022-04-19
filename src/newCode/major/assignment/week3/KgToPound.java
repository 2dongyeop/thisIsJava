package newCode.major.assignment.week3;

import java.util.Scanner;

public class KgToPound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("무게(kg)를 입력해보세요.");
        System.out.println("입력 > ");
        double weightKg = scanner.nextDouble();

        double weightPound = weightKg * 0.453592;
        System.out.println(Math.round(weightPound*1000)/1000.0);
    }
}
