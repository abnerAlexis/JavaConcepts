package concepts.inheritence;

public class AdvancedCalculator  extends Calculator{

    public int mutliply(int n1, int n2) {
        return n1 * n2;
    }

    public double divide(int n1, int n2) {
        try {
            return n1 /n2;
        } catch (Exception e) {
            System.out.println("You can not divide numbers by zero.");
            throw new RuntimeException(e);
        }
    }
}
