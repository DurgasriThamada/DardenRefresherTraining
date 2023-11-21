package lambdaExpressions.java;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExp_5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "kiwi", "orange");

        StringBuilder result = new StringBuilder();
        Consumer<String> firstLetterConsumer = word -> result.append(word.charAt(0));

        words.forEach(firstLetterConsumer);

        System.out.println("Result String: " + result.toString());
    }
}

