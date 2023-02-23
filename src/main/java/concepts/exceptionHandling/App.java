package concepts.exceptionHandling;

public class App {
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 2;
        int[] array = {1, 6, 45, 7};
        String str = null;

        try {
            System.out.println(str.length());
            System.out.println(n1 + " / " + n2 + " = " + n1/n2);
            System.out.println("Third element of the array :" + array[3]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.\n" + e);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Array has " + array.length + " elements.\n" + e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong.\n" + e);
        }
        System.out.println("Goob bye!");
    }
}
