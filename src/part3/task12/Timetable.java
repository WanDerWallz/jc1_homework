package part3.task12;

public class Timetable {
    public static void timeTable (int day) {
        switch (day) {
            case 1:
                System.out.println("Понедельник: учить Джаву.");
                break;
            case 2:
                System.out.println("Вторник: учить Джаву.");
                break;
            case 3:
                System.out.println("Среда: учить Джаву.");
                break;
            case 4:
                System.out.println("Четверг: учить Джаву.");
                break;
            case 5:
                System.out.println("Пятница: учить Джаву.");
                break;
            case 6:
                System.out.println("Суббота: учить Джаву.");
                break;
            case 7:
                System.out.println("Воскресенье: учить Джаву.");
                break;
            default:
                System.out.println("Дня с таким номером не существует.");
                break;
        }
    }

    public static void main(String[] args) {
        timeTable(7);
    }
}
