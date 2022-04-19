package newCode.major.assignment.week3;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력해보세요.");
        System.out.print("입력 > ");
        double firstNum = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력해보세요.");
        System.out.print("입력 > ");
        double secondNum = scanner.nextInt();

        double sum, avg;
        sum = firstNum + secondNum;
        System.out.println("합 : " + sum);

        avg = sum / 2.0;
        System.out.println("평균 : " + avg);
    }

}
