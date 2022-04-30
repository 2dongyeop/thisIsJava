package src.newCode.major.PracticeCode.chapter4;

public class MultiDimArray {
    public static void main(String[] args) {
        int[][] multiArr = new int[2][];
        multiArr[0] = new int[2];
        multiArr[1] = new int[3];

        multiArr[0][0] = 0; multiArr[0][1] = 1; //multiArr[0][2] = 2;
        multiArr[1][0] = 3; multiArr[1][1] = 4; multiArr[1][2] = 5;

        for (int i = 0; i < multiArr.length; i++){
            for (int j = 0; j < multiArr[i].length; j++){
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] a : multiArr){
            for (int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
