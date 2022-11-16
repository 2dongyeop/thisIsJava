package src.newCode.thisisjavaExercise.chapter18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("위치 지정하기");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        ClassC classC = new ClassC();
        classC.field1 = 1;
        oos.writeObject(classC);
        oos.flush(); oos.close(); fos.close();
    }
}
