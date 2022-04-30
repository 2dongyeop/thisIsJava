package src.newCode.major.PracticeCode.chapter4;

public class ForEachArray {
    public static void main(String[] args) {
        String[][] array = {{"이", "동엽"}, {"이", "자바"}, {"이", "코딩"}};

        for (String[] a : array){
            for (String b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
