package part5.task23;

public class Array5 {
    public static void main(String[] args) {
        int elements[] = new int[10];
        for (int i = 0; i < 10; i++) {
            elements[i] = (int) (Math.random() * 100);
            System.out.println(elements[i]);
        }
        System.out.println("");
        for (int j = 0; j < 10; j++){
            int x = 9 - j;
            System.out.println(elements[x]);
        }

    }
}