package newCode.major.SyncDemo;

class Counter2 {
    int count;
    void increase() {
        count++;
    }
}

public class SyncDemo2 {
    public static void main(String[] args)throws InterruptedException {

        Counter2 c = new Counter2();
        Thread t1 = new Thread(new Runnable(){
            public void run() {
                for (int i = 0; i < 10000; i++)
                    c.increase();
            }
        });
        t1.start();
        t1.join();
        System.out.println("Count = " + c.count);
    }
}
