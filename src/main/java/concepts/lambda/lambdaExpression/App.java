package concepts.lambda.lambdaExpression;

public class App {
    public static void main(String[] args) {
        System.out.println("There is only one method in a functional interface.");

        usingAnonymousInnerClass();
    }

    private static void usingAnonymousInnerClass() {
        ClassA a = () -> {
            System.out.println("In onefunction() inner anonymus class using LAMBDA op.");
        };
        a.oneFunction();
    }
}
