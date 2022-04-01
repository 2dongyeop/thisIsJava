package newCode.major.NumberGame;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        //심판이 3개의 숫자(1~10)를 뽑는다.
        //5명이 돌아가면서 심판의 숫자를 맞춰나간다.
        //5명 중 3개의 숫자를 먼저 알아 맞춘 플레이어가 이김
        //숫자를 하나씩 맞추고, 틀리면 다음 기회는 없음
        Scanner scanner = new Scanner(System.in);
        int[] answerNum = new int[3]; //심판이 뽑은 정답숫자
        answerNum[0] = 0; //중복 검출 위한 초기화

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < i; j++){
                if (answerNum[j] == answerNum[i]) { //이전 숫자와 비교
                    System.err.println("숫자 중복 - 게임 중단");
                    return;
                }
            }
            answerNum[i] = (int)(Math.random()*10 + 1); //1부터 10까지
        }
        System.out.println("심판의 숫자가 정해졌습니다. 게임 시작");

        int predictNum = 0; //예측 숫자
        int[] player = new int[5]; //5명의 플레이어
        boolean run = true;
        dwl : do {
            for (int i= 0; i < 5; i++){
                int answerCount = 0; //매 플레이어의 순서마다 정답 수 초기화
                System.out.println( (i+1) + "번 플레이어 차례");

                for (int j = 0; j < 3; j++) {
                    System.out.print("예측 > ");
                    //predictNum = (int)(Math.random()*10 + 1);
                    predictNum = scanner.nextInt();

                    //System.out.print(predictNum);
                    //System.out.println("");

                    if (answerNum[j] == predictNum){
                        System.out.println("정답");
                        answerCount++;
                    } else {
                        System.out.println("오답");
                        break;
                    }
                }
                if (answerCount == 3) {
                    System.out.println((i+1) + "번 플레이어 우승");
                    break dwl;
                }
            }
        } while (run);
    }
}
