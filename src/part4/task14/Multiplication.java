package part4.task14;

public class Multiplication {
    public static void main(String[] args) {
        long i = 1L;
        long multiplication = 1L;
        do {
            multiplication *= i;
            i++;
        } while (i <= 25);
        System.out.println(multiplication);
    }
}
