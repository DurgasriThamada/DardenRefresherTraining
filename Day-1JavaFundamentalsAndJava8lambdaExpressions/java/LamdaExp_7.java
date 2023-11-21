package lambdaExpressions.java;

import java.util.HashMap;
import java.util.Map;

public class LamdaExp_7 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("grape", 2);
        map.put("kiwi", 4);

        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        System.out.println("Result String: " + result.toString());
    }
}

