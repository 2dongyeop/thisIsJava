package newCode.major.assignment.week3;

import java.util.Scanner;

public class MoneyDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("천만원 이하의 정수를 입력하시오");
        System.out.print("입력 > ");
        int money = scanner.nextInt();

        if(money > 10000000) {
            System.err.println("오류");
        }
        //2,347,653 -> 234만 7천 6백 5십 3원입니다.
        int a = money / 10000; //234
        int b = money / 1000 - (money / 10000) * 10; //7 = 2347 - 2340
        int c = money / 100 - (money / 1000) * 10; //6 = 23476 - 23470
        int d = money / 10 - (money / 100) * 10; //5 = 234765 - 234760
        int e = money / 1 - (money / 10) * 10; //3 = 2347653 - 2347650

        System.out.println(a + "만 " + b + "천 " + c + "백" + d + "십" + e + "원입니다.");
    }
}
