package concepts;

public class Counter {
    public static void main(String[] args) {
//        countWithWhile();
        nestedWhile();
    }

    private static void nestedWhile() {
        int i = 1;
        while (i <= 3) {
            System.out.println(i++ + " choclate");
            int j = 1;
            while (j <= 4) {
                System.out.println(j++ + " candy");
            }
        }
    }

    private static void countWithWhile() {
        int count = 1;

        while (count <= 10) {
            if (count == 1) {
                System.out.println(count++ + " Brownie");
            }
            System.out.println(count++ + " Brownies");
        }
    }
}
