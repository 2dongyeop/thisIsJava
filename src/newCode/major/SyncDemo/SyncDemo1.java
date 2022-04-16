package newCode.major.SyncDemo;

class Counter {
    int count;
    void increase(){
        count++;
    }
}

public class SyncDemo1 {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter(); // instantiate Counter
        // Instantiate a thread t1
        Thread t1 = new Thread(new Runnable(){
            public void run() {
                for (int i = 0; i < 10000; i++)
                    c.increase();
            }
        });
        t1.start();
        System.out.println("Count = " + c.count);
    }
}
