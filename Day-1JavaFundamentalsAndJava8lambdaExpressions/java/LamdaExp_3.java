package lambdaExpressions.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class LamdaExp_3 {

    public static void main(String[] args) {
        // Example using Supplier
        Supplier<String> currentTimeSupplier = () -> java.time.LocalTime.now().toString();
        String currentTime = currentTimeSupplier.get();
        System.out.println("Current Time: " + currentTime);

        // Example using Consumer
        List<String> names = new ArrayList<>();
        Consumer<String> nameConsumer = names::add;
        nameConsumer.accept("Alice");
        nameConsumer.accept("Bob");
        nameConsumer.accept("Charlie");
        System.out.println("List of Names: " + names);

        // Example using Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 15 even? " + isEven.test(15));

        // Example using Function
        Function<String, Integer> stringLengthFunction = String::length;
        int length1 = stringLengthFunction.apply("Hello");
        int length2 = stringLengthFunction.apply("Java");
        System.out.println("Length of 'Hello': " + length1);
        System.out.println("Length of 'Java': " + length2);
    }
}
