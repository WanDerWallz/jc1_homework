package part4.task14;

public class Multiplication {
    public static void main(String[] args) {
        int i = 1;
        int multiplication = 1;
        do {
            multiplication *= i;
            i++;
        } while (i <= 25);
        System.out.println(multiplication);
    }
}
