package concepts.innerClass.anonimousInnerClass;

public class App {
    public static void main(String[] args) {
        //anonymous inner class. You can create the inner class with the abstract
        //class. (even it is abstract class)
        ClassOne obj = new ClassOne() {

            @Override
            public void show() {
                System.out.println("Inside the anonymous inner class show().");
            }

            @Override
            public void config() {
                System.out.println("Inside the annonymous inner class config().");
            }
        };
        obj.show();
        obj.config();
    }
}
