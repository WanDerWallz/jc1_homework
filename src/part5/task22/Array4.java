package part5.task22;

public class Array4 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        int b = 0;
        int elements[] = {111, 5, 13, 53, 428, 78, 5, 476, 4706, 599};
        int max = elements[0];
        int min = elements[0];
        for (int i = 0; i < 10; i++) {
            if (max < elements[i]) {
                max = elements[i];
                a = i;
            } else if (min > elements[i]) {
                min = elements[i];
                b = i;
            }
        }
        int i1 = Math.min(b, a);
        int i2 = Math.max(b, a);
        for (int x = i1 + 1; x < i2; x++) {
            sum += elements[x];
        }
        System.out.println(sum);
    }
}