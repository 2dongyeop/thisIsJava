package src.newCode.major.PracticeCode.chapter4;

public class ForEach {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};

        int[] copyNum = new int[5];
        int[] copyCopyNum = new int[5];
        System.arraycopy(num, 0, copyNum, 0, num.length);
        for (int a : copyNum){
            System.out.println(a);
        }
        int i = 0;
        for (int a : copyNum) {
            copyCopyNum[i] = a;
            System.out.println(copyCopyNum[i]);
            i++;
        }
    }
}
