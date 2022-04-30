package src.newCode.major.PracticeCode.chapter1;

import java.util.Scanner;

public class HelloOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("십진수를 입력하세요.");
        int num = scanner.nextInt();

        System.out.println(num);
    }
}
