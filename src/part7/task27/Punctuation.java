package part7.task27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Punctuation {
    public static void main(String[] args) {
        int i = 0;
        String s1 = ",,,fdssadpxz,.fdf.../::f'-'..!!><";
        Pattern p1 = Pattern.compile("[!#$%&'()*+,-./:;<=>?@^_`{|}~]");
        Pattern p2 = Pattern.compile(("[.]{3}"));
        Matcher m1 = p1.matcher(s1);
        Matcher m2 = p2.matcher(s1);
        while (m1.find()) {
            i++;
            if (m2.find()) {
                i = i - 2;
            }
        }
        System.out.println("Количество знаков препинания в тексте - " + i + ".");
    }
}
