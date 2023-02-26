package concepts.thread.threadsafety;

public class App {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {
            t2.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        System.out.println(c.count);
    }
}
