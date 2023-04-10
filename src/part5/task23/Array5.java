package part5.task23;

public class Array5 {
    public static void main(String[] args) {
        int[] elements = new int[10];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = (int) (Math.random() * 100);
            System.out.println(elements[i]);
        }
        System.out.println("");
        for (int j = 0; j < elements.length / 2; j++) {
            int x = elements[elements.length - 1 - j];
            int y = elements[j];
            elements[j] = x;
            elements[elements.length - 1 - j] = y;

        }
        for (int element : elements) {
            System.out.println(element);
        }
    }
}