package concepts.thread;

public class TheName extends Greets implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(" Alexis!");
            delay(1);
        }
    }
}
