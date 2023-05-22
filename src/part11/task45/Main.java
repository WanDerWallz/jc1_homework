package part11.task45;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyOwnException("Это моё собственное исключение.");
        } catch (MyOwnException e) {
            System.out.println("Произошло исключение. " + e.getMessage());
        }
    }
}

