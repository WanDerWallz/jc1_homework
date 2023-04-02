package part2.task5;

public class Arithmetic_Operations {
    private int doubleSum(int a, int b) {
        return a + b + a * b;
    }

    public static void main(String[] args) {
        Arithmetic_Operations y = new Arithmetic_Operations();
        int x = y.doubleSum(11, 12);
        System.out.println(x);
    }
}
