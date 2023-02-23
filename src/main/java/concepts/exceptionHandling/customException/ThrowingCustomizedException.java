package concepts.exceptionHandling.customException;

public class ThrowingCustomizedException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            System.out.println(18 + " / " + i + " = " + 18/i);
            if (j == 0) {
                throw new ArithmeticException("I don't want to print zero.");
            }
        }
        catch (ArithmeticException e) {
            j = 18 / -18;
            System.out.println(j + " is the default output due to exception handling.\n" + e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong.\n" + e);
        }
        System.out.println("Goob bye!");
    }
}
