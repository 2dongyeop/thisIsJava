package newCode.thisisjavaExercise.chapter16;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
    private List<Student3> list;

    public MaleStudent() {
        list = new ArrayList<Student3>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
    }

    public void accumulate(Student3 student) {
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }

    public void combine(MaleStudent other) {
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }

    public List<Student3> getList() {
        return list;
    }
}
