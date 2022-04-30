package src.newCode.major.PracticeCode.chapter4;

public class RaggedArray {
    public static void main(String[] args) {
        int[][] rag = new int[4][];
        rag[0] = new int[] {78,48,78,98};
        rag[1] = new int[] {99, 92};
        rag[2] = new int[] {29, 64, 83};
        rag[3] = new int[] {34, 78, 92, 56};

        int sum = 0;
        double avg = 0;
        int count = 0;
        for (int[] a : rag) {
            for (int b : a) {
                sum += b;
                count++;
            }
            avg = (double) sum / (double) count;
            System.out.println("행의 합 : " + sum);
            System.out.println("행의 평균 : " + avg);
        }

        int sum2 = 0;
        double avg2 = 0;
        int count2 = 0;
        for (int i = 0; i < rag.length; i++) {
            for (int j = 0; j < rag[i].length; j++) {
                sum2 += rag[i][j];
                count2++;
            }
            avg2 = (double) sum2 / (double) count2;
            System.out.println("행의 합 : " + sum2);
            System.out.println("행의 평균 : " + avg2);
        }
    }
}
