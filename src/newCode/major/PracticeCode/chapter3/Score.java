package src.newCode.major.PracticeCode.chapter3;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성적을 입력해주세요");
        int score = scanner.nextInt();
        char grade;

        switch (score/10){
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }
        System.out.println(grade);
    }
}
