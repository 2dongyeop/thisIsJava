package newCode.major.assignment.week3;

import java.util.Scanner;

public class YearJudgement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하시오");
        System.out.println("입력 > ");
        int year = scanner.nextInt();

        if (year / 400 == 0) {
            System.out.println("윤년");
        } else {
            if (year / 4 == 0) {
                if (year / 100 == 0) {
                    System.out.println("평년");
                } else {
                    System.out.println("우선 윤년");
                }
            }
        }
    }
}
