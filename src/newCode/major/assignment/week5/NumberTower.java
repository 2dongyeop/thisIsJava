package newCode.major.assignment.week5;

public class NumberTower {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 7; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else  {
                    System.out.print(j);
                }
            }
            System.out.println("0");
            for (int j = 0; j < 7; j++){
                if (i > j) {
                    System.out.print(j + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
