package lambdaExpressions.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExp_8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

            Consumer<Integer> numberConsumer = System.out::println;

            Thread numberPrintingThread = new Thread(() -> numbers.forEach(numberConsumer));

            numberPrintingThread.start();
        }
    }


