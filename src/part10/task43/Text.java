package part10.task43;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String words[] = text.split("[^А-яеЁA-Za-z]+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, 0);
        }
        for (String word : words) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            }
        }
        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.println(element.getKey() + " - " + element.getValue());
        }
    }
}