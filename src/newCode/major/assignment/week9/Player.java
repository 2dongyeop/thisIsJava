package src.newCode.major.assignment.week9;

import java.util.Scanner;

public class Player {
    int number;
    public int guess() {
        System.out.println("예상 값을 입력 > ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        return number;
    }
}
