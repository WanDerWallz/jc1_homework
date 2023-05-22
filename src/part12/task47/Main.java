package part12.task47;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dir = new File("D:\\");
        File filesList[] = dir.listFiles();
        System.out.println("Каталоги: ");
        for (File file: filesList) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
        System.out.println("\nФайлы: ");
        for (File file: filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
