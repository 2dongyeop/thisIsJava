package src.newCode.major.PracticeCode.chapter4;

public class SumAndN {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while(sum <= 5000) {
            sum += n;
            n++;
        }

        System.out.println("n : " + (--n));
        System.out.println("sum : " + (sum - n));
    }
}
