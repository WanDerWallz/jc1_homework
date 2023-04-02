package part3.task9;

public class Money {
    public static void main(String[] args) {
        int x = 14412;
        if (x % 10 == 1 && x % 100 != 11 && x != 11) {
            System.out.println(x + " рубль.");
        } else if (x % 10 > 1 && x % 10 < 5 && x % 100 != 12 && x % 100 != 13 && x % 100 != 14) {
            System.out.println(x + " рубля.");
        } else {
            System.out.println(x + " рублей.");
        }
    }
}
