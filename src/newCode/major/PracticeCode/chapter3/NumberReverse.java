package src.newCode.major.PracticeCode.chapter3;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수를 입력하세요");
        int number = scanner.nextInt();

        do {
            System.out.print(number % 10);
            number /= 10;
        } while (number != 0);
    }
}
