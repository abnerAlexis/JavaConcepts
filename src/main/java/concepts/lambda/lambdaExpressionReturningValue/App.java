package concepts.lambda.lambdaExpressionReturningValue;

public class App {
    public static void main(String[] args) {
        System.out.println("There is only one method in a functional interface.");

        usingAnonymousInnerClass();
    }

    private static void usingAnonymousInnerClass() {
        ClassA a = i -> {
            System.out.println("In onefunction() inner anonymus class using LAMBDA op.\n" + i +
                " is the returning value using LAMBDA");
        };
        a.oneFunction(5);
    }
}
