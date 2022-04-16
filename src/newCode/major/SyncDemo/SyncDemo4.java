package newCode.major.SyncDemo;

class Counter4{
    int count;
    synchronized void increase() {
        count++;
    }
}

public class SyncDemo4 {
    public static void main(String[] args)throws InterruptedException {

        Counter4 c = new Counter4();
        Thread t1 = new Thread(new Runnable(){
            public void run() {
                for (int i = 0; i < 10000; i++)
                    c.increase();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run() {
                for (int i = 0; i < 10000; i++)
                    c.increase();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count = " + c.count);
    }
}
