package concepts.exceptionHandling.trywithresources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFinallyUse {
    public static void main(String[] args) {
        int num = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a number : ");
            num = Integer.parseInt(bufferedReader.readLine());
            System.out.println(num);
            System.out.println("Bye - try block");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Bye - finally ");
        }
    }
}
