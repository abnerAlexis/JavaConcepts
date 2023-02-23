package concepts.exceptionHandling.throwNthrows;

public class UsingThrows {
    public static void showClass() throws ClassNotFoundException {
        Class.forName("Demo");
    }

    public static void main(String[] args) {
        try {
            showClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
