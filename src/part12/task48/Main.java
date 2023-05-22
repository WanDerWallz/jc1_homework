package part12.task48;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов. Вывести результат на экран.";
        String fileName = "text1.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int punctuationCount = 0;
        int wordCount = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                punctuationCount += line.length() - line.replaceAll("\\p{Punct}", "").length();
                wordCount += line.split("\\s+").length;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Количество знаков препинания: " + punctuationCount + ".");
        System.out.println("Количество слов: " + wordCount + ".");
    }
}