package src.newCode.major.PracticeCode.chapter3;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        num[0] = scanner.nextInt();
        num[1] = scanner.nextInt();
        num[2] = scanner.nextInt();

        int maxNum = num[0];
        for (int i = 1; i < 3; i++) {
            if (maxNum < num[i]) {
                maxNum = num[i];
            }
        }
        System.out.println(maxNum);
    }
}
