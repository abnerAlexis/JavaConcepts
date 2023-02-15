package concepts;

import java.util.HashMap;
import java.util.Map;

public class CreateNprintHashMaps {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = createHashMap();
//        printMapElements(hashMap);
    }

    private static Map<String, Integer> createHashMap() {
        Map<String, Integer> hashMap = new HashMap<String, Integer>() {{
            put("Hulya", 30);
            put("Jule", 28);
            put("Alexis", 33);
            put("Jen", 26);
        }};
        return hashMap;
    }

    private static void printMapElements(Map<String, Integer> nameNage) {
        for (String name: nameNage.keySet()) {
            String key = name.toString();
            int value = nameNage.get(name);
            System.out.println(key + " is " + value + " year old.");
        }
    }
}
