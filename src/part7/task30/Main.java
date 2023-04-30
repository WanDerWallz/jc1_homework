package part7.task30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        HexadecimalNumbers hexadecimalNumbers = new HexadecimalNumbers();
        hexadecimalNumbers.findHexadecimalNumbers(s1);
    }
}
