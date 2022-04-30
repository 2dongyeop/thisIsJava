package src.newCode.major.PracticeCode.chapter2;

import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몸무게와 키를 입력하세요");
        int kg = scanner.nextInt();
        double cm = scanner.nextDouble();

        System.out.println("키 : " + cm + " 몸무게 : " + kg);

    }
}
