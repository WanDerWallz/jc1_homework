package part16.task62;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int sumInCm = IntStream.rangeClosed(1, 20)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println(i + " дюйма(ов)."))
                .map(i -> (int) (i * 2.54))
                .peek(i -> System.out.println(i + " см."))
                .sum();
        System.out.println("Сумма в сантиметрах: " + sumInCm + ".");
    }
}