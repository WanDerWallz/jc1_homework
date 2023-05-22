package part12.task49;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Это текст с числами: 1, 2, 3. Вот ещё числа: 5, 6, 42, 100, 1.";
        String textWithoutPunctuation = text.replaceAll("\\p{Punct}", ""); //Без этого костыля числа, стоящие рядом со знаками препинания, не хотят добавляться в numbers.
        String fileName = "text2.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(textWithoutPunctuation)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    numbers.add(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }

            System.out.println("Найденные числа: " + numbers + ".");

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Сумма чисел: " + sum + ".");

            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            System.out.println("Все числа без повторов: " + uniqueNumbers + ".");
        }
    }
}