package concepts.thread.workingWithLambdaExpression;

public class App {
    public static void main(String[] args) {
        Runnable greet = new Greets();
        Runnable name = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(" Alexis!");
                ((Greets) greet).delay(1);
            }

        };
        Thread t1 = new Thread(greet);
        Thread t2 = new Thread(name);
        t1.start();
        ((Greets) greet).delay(1/5);
        t2.start();
    }
}
