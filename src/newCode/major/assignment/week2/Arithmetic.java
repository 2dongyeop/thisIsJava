package newCode.major.assignment.week2;

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사칙연산을 시행합니다.");

        System.out.println("첫 번째 숫자를 입력해보세요.");
        System.out.print("입력 > ");
        int firstNum = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력해보세요.");
        System.out.print("입력 > ");
        int secondNum = scanner.nextInt();

        System.out.println("덧셈 : " + (firstNum + secondNum));
        System.out.println("뺄셈 : " + (firstNum - secondNum));
        System.out.println("곱셈 : " + (firstNum * secondNum));
        System.out.println("나눗셈 : " + ((double)firstNum / (double)secondNum));
    }
}
