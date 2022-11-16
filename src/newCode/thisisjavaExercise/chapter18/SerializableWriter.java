package src.newCode.thisisjavaExercise.chapter18;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableWriter {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("해당 경로 설정하기");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        ClassA classA = new ClassA();
        classA.field1 = 1;
        classA.field2.field1 = 2;
        classA.field4 = 4;

        oos.writeObject(classA);
        oos.flush(); oos.close(); fos.close();
    }
}
