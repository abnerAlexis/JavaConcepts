package concepts.thread.implementingRunnable;

public class App {
    public static void main(String[] args) {
        Runnable greet = new Greets();
        Runnable name = new TheName();
        Thread t1 = new Thread(greet);
        Thread t2 = new Thread(name);
        t1.start();
        ((Greets) greet).delay(1/5);
        t2.start();
    }
}
