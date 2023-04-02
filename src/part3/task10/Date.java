package part3.task10;

public class Date {
    public static void main(String[] args) {
        int a = 28, b = 2, c = 2012;
        if (a > 31 || b > 12) {
            System.out.println("Дата введена неверно.");
        } else if (a > 29 && b == 2) {
                System.out.println("Дата введена неверно.");
        } else if (a > 30 && b == 4) {
            System.out.println("Дата введена неверно.");
        } else if (a > 30 && b == 6) {
            System.out.println("Дата введена неверно.");
        } else if (a > 30 && b == 9) {
            System.out.println("Дата введена неверно.");
        } else if (a > 30 && b == 11) {
            System.out.println("Дата введена неверно.");
        } else if (a == 28 && b == 2 && c % 4 == 0) {
            System.out.println("Завтра будет 29 число, месяц 2, год " + c + ".");
        } else if (a == 31 && b == 12) {
            c++;
            System.out.print("Завтра будет 1 число, месяц 1, год " + c + ".");
        } else if (a == 31 && b == 1) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 28 && b == 2) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 31 && b == 3) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 30 && b == 4) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 31 && b == 5) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 30 && b == 6) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 31 && b == 7) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 31 && b == 8) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 30 && b == 9) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 31 && b == 10) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else if (a == 30 && b == 11) {
            b++;
            System.out.print("Завтра будет 1 число, месяц " + b + ", год " + c + ".");
        } else {
            a++;
            System.out.println("Завтра будет " + a + " число," + " месяц " + b + ", год " + c + ".");
        }
    }
}
