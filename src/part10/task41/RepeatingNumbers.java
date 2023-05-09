package part10.task41;

import java.util.ArrayList;

public class RepeatingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> repeatingNumbers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            repeatingNumbers.add((int) (Math.random() * 100));
        }
        System.out.println(repeatingNumbers);
        for (int i = 0; i < 100; i++) {
            while (repeatingNumbers.contains(i) && repeatingNumbers.lastIndexOf(i) != repeatingNumbers.indexOf(i)) {
                repeatingNumbers.remove(repeatingNumbers.get(repeatingNumbers.indexOf(i)));
            }
        }
        System.out.println(repeatingNumbers);
    }
}