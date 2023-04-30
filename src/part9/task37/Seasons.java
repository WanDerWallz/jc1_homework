package part9.task37;

import java.util.Scanner;

public enum Seasons {
    ЗИМА, ВЕСНА, ЛЕТО, ОСЕНЬ;
    public static Seasons getNextSeason(Scanner scanner) {
        String season = scanner.nextLine();
        String season1 = season.toUpperCase();
        switch (season1) {
            case "ЗИМА":
                return Seasons.ВЕСНА;
            case "ВЕСНА":
                return Seasons.ЛЕТО;
            case "ЛЕТО":
                return Seasons.ОСЕНЬ;
            case "ОСЕНЬ":
                return Seasons.ЗИМА;
            default:
                return null;
        }
    }
}

