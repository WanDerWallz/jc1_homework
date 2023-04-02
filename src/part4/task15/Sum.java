package part4.task15;

public class Sum {
    public static void main(String[] args) {
        long sum = 0L;
        long n = 7893923445L;
        do {
            long x = n % 10;
            n = n / 10;
            sum = sum + x;
        } while (n > 1);
        System.out.println(sum);
    }
}
