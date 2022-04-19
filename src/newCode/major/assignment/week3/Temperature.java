package newCode.major.assignment.week3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("화씨(F)인지 섭씨(F)인지 선택하시오");
        System.out.print("입력 > ");
        char temp = scanner.next().charAt(0);

        if (temp == 'F' || temp == 'f') {
            System.out.println("온도를 입력하시오");
            System.out.print("입력 > ");
            int temperature = scanner.nextInt();

            System.out.println((9.0 / 5.0) * temperature + 32);
        } else if (temp == 'C' || temp == 'c') {
            System.out.println("온도를 입력하시오");
            System.out.print("입력 > ");
            int temperature = scanner.nextInt();

            System.out.println((5.0 / 9.0) * temperature - 32);
        } else {
            System.err.println("입력 오류");
        }
    }
}
