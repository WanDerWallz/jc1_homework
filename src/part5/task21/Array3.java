package part5.task21;

public class Array3 {
    public static void main(String[] args) {
        int j = 0;
        int elements[] = {13, 4231, 493, 546, 4238, 78, 5, 876, 92, 509};
        int maxNumber = elements[0];
        for (int i = 0; i < 10; i++) {
            if (maxNumber < elements[i]) {
                maxNumber = elements[i];
                j = i;
            }
        }
        System.out.println(j);
    }
}
