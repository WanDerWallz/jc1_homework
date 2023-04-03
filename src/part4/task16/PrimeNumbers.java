package part4.task16;

public class PrimeNumbers {
    public static void main(String[] args) {
        int x = 0;
        for (int p = 50; p <= 70; p++) {
            boolean prime = true;
            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                x++;
                if (x == 2) {
                    System.out.println(p);
                    break;
                }
            }
        }
    }
}
