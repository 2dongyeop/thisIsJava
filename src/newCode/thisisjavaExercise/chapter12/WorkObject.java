package src.newCode.thisisjavaExercise.chapter12;

public class WorkObject { //두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체
    public synchronized void methodA() {
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
        }

    }

    public synchronized void methodB() {
        System.out.println("ThreadB의 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
        }
    }
}
