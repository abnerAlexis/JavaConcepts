package concepts.inheritence;

import concepts.thisNsuper.A;

public class App {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        int r1 = calc.add(6, 8);
        int r2 = calc.subtract(16, 4);
        int r3 = calc.mutliply(7, 4);
        double r4 = calc.divide(16, 4);
        double r5 = calc.power(5, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
        System.out.printf("%d %d %d %.0f %.0f", r1, r2, r3, r4, r5);
    }
}
