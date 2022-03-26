package newCode.thisisjavaExercise.chapter16;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100); //1부터 100까지
        //IntStream stream = IntStream.range(1, 100); //1부터 99까지
        stream.forEach(a -> sum += a);
        System.out.println("총합: " + sum);
    }
}
