package part2.task5;

public class DoubleSum {
    public int doubleSum(int a, int b) {
        return a + b + a * b;
    }

    public static void main(String[] args) {
        DoubleSum x = new DoubleSum();
        int y = x.doubleSum(24,56);
        System.out.println(y);
    }
}
