package part7.task32;

public class Concatenation {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        String s1 = "aaabbbccc";
        String s2 = null;
        StringBuilder s3 = new StringBuilder(s1);
        for (int i = 0; i <= 1000000; i++) {
            s3.append(s1);
        }
        long t1 = System.currentTimeMillis() - time;
        for (int i = 0; i <= 1000000; i++) {
            s2 += s1;
        }
        long t2 = System.currentTimeMillis() - time;
        long t3 = t2 - t1;
        if (t3 > 0) {
            System.out.println("Метод append класса StringBuilder выполнился быстрее сложения объектов класса String на " + t3 + " миллисекунд.");
        } else {
            System.out.println("Сложение объектов класса String выполнилось быстрее метода append класса StringBuilder на " + t3 + " миллисекунд.");
        }
    }
}
