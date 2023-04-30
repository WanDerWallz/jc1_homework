package part9.task37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название сезона: ");
        Seasons nextSeason = Seasons.getNextSeason(new Scanner(System.in));
        System.out.println(nextSeason);
    }
}
