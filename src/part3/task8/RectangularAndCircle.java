package part3.task8;

public class RectangularAndCircle {
    public boolean rectangularAndCircle(int a, int b, int r) {
        int x = a * a + b * b;
        return Math.sqrt(x) < 2 * r;
    }

    public static void main(String[] args) {
        RectangularAndCircle x = new RectangularAndCircle();
        boolean y = x.rectangularAndCircle(5, 17, 7);
        if (y) {
            System.out.println("Можно закрыть отверстие.");
        } else {
            System.out.println("Нельзя закрыть отверстие.");
        }
    }
}
