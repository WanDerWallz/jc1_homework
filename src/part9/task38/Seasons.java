package part9.task38;

import java.util.Scanner;

public enum Seasons {
    ЗИМА(90), ВЕСНА(92), ЛЕТО(92), ОСЕНЬ(91);
    private final int countOfDays;

    Seasons(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public static int getCountOfDays(Scanner scanner) {
        String season = scanner.nextLine();
        String season1 = season.toUpperCase();
        switch (season1) {
            case "ЗИМА":
                return Seasons.ЗИМА.countOfDays;
            case "ВЕСНА":
                return Seasons.ВЕСНА.countOfDays;
            case "ЛЕТО":
                return Seasons.ЛЕТО.countOfDays;
            case "ОСЕНЬ":
                return Seasons.ОСЕНЬ.countOfDays;
            default:
                return 0;
        }
    }
}
