package concepts.interfaceConcept.functionalInterface;

public class App {
    public static void main(String[] args) {
        System.out.println("There is only one method in a functional interface.");
        //usingImplementingClass();

        usingAnonymousInnerClass();
    }

    private static void usingAnonymousInnerClass() {
        ClassA a = new ClassA() {
            @Override
            public void oneFunction() {
                System.out.println("In onefunction() inner anonymus class.");
            }
        };
        a.oneFunction();
    }

    private static void usingImplementingClass() {
        ClassA b = new ClassB();
        b.oneFunction();
    }
}
