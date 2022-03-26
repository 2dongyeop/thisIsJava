package newCode.thisisjavaExercise.chapter16;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});

        intStream
                .sorted()
                .forEach(n->System.out.println(n + ","));
        System.out.println();  //1,2,3,4,5,

        List<Student2> studentList = Arrays.asList(
                new Student2("홍길동", 30),
                new Student2("신용권", 10),
                new Student2("유미선", 20)
        );

        studentList.stream()
                .sorted()
                .forEach(s->System.out.println(s.getScore() + ","));
        System.out.println();   //10,20,30,

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s->System.out.println(s.getScore() + ","));
        System.out.println();   //30,20,10,
    }
}