package part5.task19;

public class Array1 {
    public static void main(String[] args) {
        int elements[] = new int[10];
        for (int i = 0; i < 10; i++) {
            elements[i] = (int) (Math.random() * 100);
        }
        System.out.println(elements[9]);
    }
}
