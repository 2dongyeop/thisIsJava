package newCode.major.assignment.week3;

import java.util.Scanner;

public class ToDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        System.out.print("입력 > ");
        int input = scanner.nextInt();

        System.out.printf("%o", input); //8진수
        System.out.println();

        System.out.printf("%d", input); //10진수
        System.out.println();

        System.out.printf("%h", input);
        System.out.println();//16진수
        System.out.printf("%x", input);
    }
}
