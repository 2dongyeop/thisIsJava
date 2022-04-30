package src.newCode.major.assignment.week4;//package newCode.major.assignment.week4;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        int[] num = new int[3];

        System.out.print("3개의 정수를 입력하시오: ");
        Scanner scanner = new Scanner(System.in);

        num[0] = scanner.nextInt();
        num[1] = scanner.nextInt();
        num[2] = scanner.nextInt();

        int maxNum = num[0];
        for (int i = 0; i < 3; i++) {
            if (maxNum < num[i]) {
                maxNum = num[i];
            }
        }
        System.out.println("가장 큰 수 : " + maxNum);
    }
}
