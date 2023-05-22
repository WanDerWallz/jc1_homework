package part11.task44;

public class NullException {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Произошло исключение. Пользователь попытался вызвать свойство переменной со значением null.");
        }
    }
}
