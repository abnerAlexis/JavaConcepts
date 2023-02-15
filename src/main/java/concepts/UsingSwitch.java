package concepts;

import java.util.Scanner;

public class UsingSwitch {
    private static Scanner scanner;
    public static void main(String[] args) {
        int day;
        String input = "";

        do {
            scanner = new Scanner(System.in);
            try {
                System.out.print("Enter a number of the day 1 - 7 : ");
                input = scanner.nextLine();
                day = Integer.valueOf(input);
                if (day >= 1 && day <= 7) {
                    break;
                }
                throw new Exception();
            } catch (Exception ex) {
                System.out.println(input + " is an invalid selection.");
            }
        } while(true);

        var result = switch (day) {
            case 1 -> "1 - Monday";
            case 2 -> "2 - Tuesday";
            case 3 -> "3 - Wednesday";
            case 4 -> "4 - Thursday";
            case 5 -> "5 - Friday";
            case 6 -> "6 - Saturday";
            case 7 -> "7 - Sunday";
            default -> "How did you come here.";
        };
        System.out.println(result);
    }
}
