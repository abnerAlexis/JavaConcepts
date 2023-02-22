package concepts.lambda.multipleParameters;

public class App {
    public static void main(String[] args) {
        System.out.println("There is only one method in a functional interface.");

        usingAnonymousInnerClass();
    }

    private static void usingAnonymousInnerClass() {
        ClassA a = (i, k) -> i + k;

        int result = a.oneAddingFunction(2,7);
        System.out.println(result);
    }
}
