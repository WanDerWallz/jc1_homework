package part9.task36;

public class Main {
    public static void main(String[] args) {
        for (Seasons seasons: Seasons.values()) {
            System.out.println(seasons);
            System.out.println(seasons.getDescription());
            System.out.println(seasons.getCountOfDays());
        }
    }
}
