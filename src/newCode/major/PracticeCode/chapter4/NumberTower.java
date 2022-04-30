package src.newCode.major.PracticeCode.chapter4;

public class NumberTower {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                if ((j + i) >= 7) {
                    System.out.print(7 - j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("0");
            for (int k = 0; k < 7; k++) {
                if (i > k) {
                    System.out.print(k + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
