package concepts.innerClass;

public class Pet {

    int age;

    public void show() {
        System.out.println("In show() method.");
    }

     class IdNumber {
        public void config() {
            System.out.println("In config() method.");
        }
    }
}
