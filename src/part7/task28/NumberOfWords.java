package part7.task28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfWords {
    public static void main(String[] args) {
        String s1 = " Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами, в начале и в конце текста также могут быть пробелы, но могут и отсуствовать.";
        int i = 0;
        Pattern p  = Pattern.compile("[А-яёЁa-zA-Z0-9]+");
        Matcher m = p.matcher(s1);
        while (m.find()) {
            i++;
        }
        System.out.println("Количество слов в тексте - " + i + ".");
    }
}
