package newCode.major.assignment.week3;

import java.util.Scanner;

public class Quarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("달을 입력하시오");
        System.out.print("입력 > ");
        int month = scanner.nextInt();

        if (month > 0 && month <= 6) {
            System.out.println("상반기");
        } else if (month > 6 && month <=12) {
            System.out.println("하반기");
        } else {
            System.out.println("입력 오류");
        }
    }
}
