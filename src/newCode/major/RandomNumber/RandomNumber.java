package newCode.major.RandomNumber;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) { //심판이 3개의 숫자(1~10)를 뽑는다.

        Scanner scanner = new Scanner(System.in);
        int[] answerNum = new int[3]; //심판이 뽑은 정답숫자
        for (int i = 0; i < answerNum.length; i++) {
            int checkNum = (int) (Math.random() * 10 + 1);
            for (int j = 0; j <= i; j++) {
                if (answerNum[j] == checkNum) { //이전에 뽑은 숫자랑 중복될 시

                    System.err.println("중복 오류");
                    System.exit(1); //비정상 종료
                }
            }
            answerNum[i] = checkNum;
            System.out.println(answerNum[i]);
        }

        System.out.println("심판의 숫자가 정해졌습니다. 게임 시작");

        int predictNum = 0; //예측 숫자
        int answerCount = 0; //정답 수 초기화
        for (int i = 0; i < 10; i++) { //10번의 기회
            System.out.print("예측 > ");
            predictNum = scanner.nextInt();

            boolean answerYes = false; //정답 유무를 가리기 위함

            for (int j = 0; j < answerNum.length; j++) {
                if (answerNum[j] == predictNum) {
                    System.out.println("정답");
                    answerCount++;
                    answerYes = true;
                }
            }
            if (answerYes == false) {
                System.out.println("오답");
            }

            if (answerCount >= 3) { //정답 횟수가 3번이 되면 게임 종료
                break;

            }
        }
        if (answerCount == 3) {
            System.out.println("게임 승리");
        } else {
            System.out.println("게임 패배");
        }
    }
}