package Par1.Task2;

public class Clock {
    public static void main(String[] args) {
        int s, sec, m , min, h, hour, d, day, week;
        s = 3700;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        week = (d - day) / 7;
        System.out.println("Неделя " + week + " День " + day + ", " + hour + ":" + min + ":" + sec);
    }
}
