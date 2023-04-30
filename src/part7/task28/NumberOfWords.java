package part7.task28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfWords {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        int i = 0;
        Pattern p  = Pattern.compile("[А-яёЁa-zA-Z0-9]+");
        Matcher m = p.matcher(s1);
        while (m.find()) {
            i++;
        }
        System.out.println("Количество слов в тексте - " + i + ".");
    }
}
