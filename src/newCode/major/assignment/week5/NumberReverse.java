package src.newCode.major.assignment.week5;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("수를 입력하시오");
        System.out.print("입력 > ");
        int n = input.nextInt();

        do {
            System.out.print(n % 10);
            n /= 10;
        } while (n != 0);
    }
}
