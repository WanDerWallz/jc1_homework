package part6.task25;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        if (min >= 60 || sec >= 60 || min < 0 || sec < 0 || hour < 0 || hour > ((Integer.MAX_VALUE / 3600) - 3599)) {
            System.out.println("Время введено неверно.");
            System.exit(1);
        }
    }

    public Time(int totalSec) {
        hour = totalSec / 3600;
        min = (totalSec % 3600) / 60;
        sec = totalSec - hour * 3600 - min * 60;
        if (totalSec < 0 ) {
            System.out.println("Количество секунд введено неверно.");
            System.exit(1);
        }
    }

    public int getTotalSec() {
        return sec + 60 * min + 3600 * hour;
    }

    public int compareTimeTo(Time t2) {
        return Integer.compare(this.getTotalSec(), t2.getTotalSec());
    }

    public void showTime() {
        System.out.println("Время - " + hour + ":" + min + ":" + sec);
    }
}
