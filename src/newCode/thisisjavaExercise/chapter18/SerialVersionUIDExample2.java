package src.newCode.thisisjavaExercise.chapter18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("경로 지정하기");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ClassC classC = (ClassC) ois.readObject();
        System.out.println("field1: " + classC.field1);
    }
}
