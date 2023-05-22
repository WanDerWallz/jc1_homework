package part11.task46;

public class Main {
    public static void myMethod() throws MyException {
        throw new MyException("Это тестовое исключение.");
    }

    public static void main(String[] args) {
        try {
            myMethod();
        } catch (MyException e) {
            System.out.println("Произошло исключение. " + e.getMessage());
        }
    }
}