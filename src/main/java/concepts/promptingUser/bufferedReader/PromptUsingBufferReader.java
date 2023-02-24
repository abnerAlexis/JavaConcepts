package concepts.promptingUser.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromptUsingBufferReader {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader );
        int num;
        try {
            num = Integer.parseInt(bufferedReader.readLine());
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(num);
    }
}
