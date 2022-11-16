package src.newCode.thisisjavaExercise.chapter18;

import java.io.Serializable;

public class ClassA implements Serializable {
    int field1;
    ClassB field2 = new ClassB();
    static int field3;
    transient int field4;
}

class ClassB implements Serializable {
    int field1;
}
