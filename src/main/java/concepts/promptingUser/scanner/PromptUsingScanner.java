package concepts.promptingUser.scanner;

import java.util.Scanner;

public class PromptUsingScanner {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }
}
