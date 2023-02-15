package concepts;

import java.nio.charset.StandardCharsets;

public class StringManipulation {
    public static void main(String[] args) {
        usingStringBuffer();
    }

    private static void usingStringBuffer() {
        System.out.println("USING STRING BUFFER");
        StringBuffer  stringBuffer = new StringBuffer("Alexis");
        System.out.println("At First : " + stringBuffer);
        System.out.println("Append Abner and Insert H");
        stringBuffer.append(" Abner");
        stringBuffer.insert(7, "J ");
        System.out.println(stringBuffer);

        String text = String.valueOf(stringBuffer);
        System.out.println("Hash Code : " + text.hashCode());
        System.out.println("Char At 0 : " + text.charAt(0));
        System.out.println("CONCAT :\n" + text.concat(" SDET"));
        System.out.println("Getting Byte Value :\n" + text.getBytes(StandardCharsets.UTF_8));
    }
}
