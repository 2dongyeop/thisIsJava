package src.newCode.major.assignment.week9;

import java.util.Scanner;

public class GuessGame {
    final int SIZE = 3;
    int[] randomNum = new int[SIZE];

    boolean run = true;
    Scanner scanner = new Scanner(System.in);

    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    public void startGame() {
        int answerCount = 0;
        for (int i = 0; i < SIZE; i++) {
            randomNum[i] = (int) (Math.random()*6 + 1);
        }
        System.out.println("=====게임 시작=====");

        loop : do {
            System.out.println("=====1번째 플레이어=====");
            loop1 : for (int i = 0; i < SIZE; i++) {
                if (randomNum[i] == p1.guess()) {
                    System.out.println("정답입니다.");
                    answerCount++;

                    if (answerCount == 3) {
                        System.out.println("우승자가 나왔습니다.");
                        break loop;
                    }
                } else {
                    System.out.println("오답입니다.");
                    answerCount = 0;
                    break loop1;
                }
            }
            System.out.println("=====2번째 플레이어=====");
            loop2 : for (int i = 0; i < SIZE; i++) {
                if (randomNum[i] == p2.guess()) {
                    System.out.println("정답입니다.");
                    answerCount++;

                    if (answerCount == 3) {
                        System.out.println("우승자가 나왔습니다.");
                        break loop;
                    }
                } else {
                    System.out.println("오답입니다.");
                    answerCount = 0;
                    break loop2;
                }
            }
            System.out.println("=====3번째 플레이어=====");
            loop3 : for (int i = 0; i < SIZE; i++) {
                if (randomNum[i] == p3.guess()) {
                    System.out.println("정답입니다.");
                    answerCount++;

                    if (answerCount == 3) {
                        System.out.println("우승자가 나왔습니다.");
                        break loop;
                    }
                } else {
                    System.out.println("오답입니다.");
                    answerCount = 0;
                    break loop3;
                }
            }
        } while(run);
    }
}
