package concepts.thread.implementingRunnable;

public class Greets  implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("Hello ");
            delay(1);
        }
    }

    public static void delay(long milisecs) {
        try {
            Thread.sleep(milisecs);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
