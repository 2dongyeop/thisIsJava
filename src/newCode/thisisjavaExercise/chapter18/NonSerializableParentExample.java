package src.newCode.thisisjavaExercise.chapter18;

import java.io.*;

public class NonSerializableParentExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("경로 지정하기");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Child child = new Child();
        child.field1 = "홍길동";
        child.field2 = "홍삼원";

        oos.writeObject(child);
        oos.flush(); oos.close(); fos.close();

        FileInputStream fis = new FileInputStream("경로 지정하기");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Child v = (Child) ois.readObject();
        System.out.println("field1: " + v.field1);
        System.out.println("field2: " + v.field2);
        ois.close(); fis.close();
    }
}
