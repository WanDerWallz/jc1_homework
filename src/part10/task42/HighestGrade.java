package part10.task42;

import java.util.ArrayList;
import java.util.Iterator;

public class HighestGrade {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            grades.add((int) (Math.random() * 10));
        }
        System.out.println(grades);
        Iterator<Integer> iterator = grades.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            if (iterator.next() > i) {
                i = iterator.next();
            }
        }
        System.out.println("Самая высокая оценка - " + i + ".");
    }
}
