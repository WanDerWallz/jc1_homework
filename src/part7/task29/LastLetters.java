package part7.task29;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastLetters {
    public static void main(String[] args) {
        String s1 = "Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв исходного текста.";
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