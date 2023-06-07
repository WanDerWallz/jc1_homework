package part16.task64;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int minValue = 1;
        int maxValue = 100;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * (maxValue - minValue)));
        }

        boolean divisibleByThreeAndFive = list.stream()
                .anyMatch(i -> i % 3 == 0 && i % 5 == 0);

        System.out.println(list);

        if (divisibleByThreeAndFive) {
            System.out.println("Данная коллекция List содержит числа которые делятся и на 3, и на 5.");
        } else {
            System.out.println("Данная коллекция List не содержит чисел которые делятся и на 3, и на 5.");
        }
    }
}