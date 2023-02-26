package concepts.thread.threadsafety;

public class Counter {
   int count;

   public synchronized void increment() {
       count++;
   }
}
