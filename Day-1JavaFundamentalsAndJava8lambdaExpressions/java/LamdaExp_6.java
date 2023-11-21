package lambdaExpressions.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class LamdaExp_6 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "grape", "kiwi", "orange"));

        UnaryOperator<String> toUppercase = String::toUpperCase;
        words.replaceAll(toUppercase);

        System.out.println("Uppercase Words: " + words);
    }
}

