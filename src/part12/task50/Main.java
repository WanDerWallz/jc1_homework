package part12.task50;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "numbers.bin";
        int numCount = 20;

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            Random random = new Random();
            for (int i = 0; i < numCount; i++) {
                int number = random.nextInt(100);
                dos.writeInt(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> numbers = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            for (int i = 0; i < numCount; i++) {
                int number = dis.readInt();
                numbers.add(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Числа: " + numbers + ".");

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numCount;
        System.out.println("Среднее арифметическое: " + average + ".");
    }
}
