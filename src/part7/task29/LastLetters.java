package part7.task29;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastLetters {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        char[] text = s1.toCharArray();
        Pattern p = Pattern.compile("[A-Za-zА-Яа-яёЁ]\\b");
        Matcher m = p.matcher(s1);
        int j;
        System.out.println("Текст, составленный из последних букв исходного текста:");
            while (m.find()) {
                j = m.start();
                System.out.print(text[j]);
        }
    }
}