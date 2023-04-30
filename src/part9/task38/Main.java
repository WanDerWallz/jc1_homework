package part9.task38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сезон года: ");
        int days = Seasons.getCountOfDays(new Scanner(System.in));
        System.out.println("Сумма дней в этом сезоне - " + days + ".");
    }
}
