package part7.task30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexadecimalNumbers {
    public void findHexadecimalNumbers(String string) {
        Pattern p = Pattern.compile("0x[A-Fa-f0-9]+");
        Matcher m = p.matcher(string);
        System.out.println("В строке есть шестнадцатеричное(ые) число(а). Его(их) положение(я) (индексы): ");
        while (m.find()) {
            System.out.println("Начало - " + m.start() + "; конец - " + m.end() + ".");
        }
    }
}
