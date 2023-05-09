package part10.task40;

import java.util.ArrayList;

public class Grades {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            grades.add((int) ((Math.random() * 10) + 1));
        }
        System.out.println(grades);
        for (int i = 0; i < 3; i++) {
            while (grades.contains(i)) {
                grades.remove(grades.get(grades.indexOf(i)));
            }
        }
        System.out.println(grades);
    }
}


