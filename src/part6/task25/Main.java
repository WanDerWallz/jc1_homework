package part6.task25;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(16, 42, 5);
        System.out.println(t1.getTotalSec());
        t1.showTime();
        Time t2 = new Time(13124);
        System.out.println(t2.getTotalSec());
        t2.showTime();
        int i = t1.compareTimeTo(t2);
        System.out.println(i);
    }
}
