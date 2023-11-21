package lambdaExpressions.java;

import java.util.ArrayList;
import java.util.List;

public class LamdaExp_4 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("kiwi");
        words.add("orange");

        words.removeIf(word -> word.length() % 2 != 0);

        System.out.println("Words with Even Lengths: " + words);
    }
}

