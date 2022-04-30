package src.newCode.major.PracticeCode.chapter4;

import java.util.Scanner;

public class ExceptMultiple {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0) continue;
            if (i % 3 == 0) continue;
            if (i % 5 == 0) continue;
            if (i % 7 == 0) continue;

            System.out.print(i + " ");
            count++;
            if (count % 10 == 0){
                System.out.println();
            }
        }

    }
}
