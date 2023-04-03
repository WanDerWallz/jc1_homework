package part5.task20;

public class Array2 {
    public static void main(String[] args) {
        int elements[] = {41, 141, 149, 4738, 4621, 58, 133, 899, 91, 7};
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(elements[i]);
            }
        }
    }
}
