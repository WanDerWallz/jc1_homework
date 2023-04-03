package part4.task13;

public class Factorial {
    public static void main(String[] args) {
        int  factorial = 1;
        int i = 0;
        while (i == 0) {
            i++;
            System.out.println(factorial);
        }
        while (i <= 10) {
            factorial *= i;
            System.out.println(factorial);
            i++;
        }
        System.out.println(factorial);
    }
}
