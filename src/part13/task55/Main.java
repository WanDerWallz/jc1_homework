package part13.task55;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread3 thread = new MyThread3();
            thread.start();
        }
    }

    static class MyThread3 implements Runnable {

        Thread th;

        public MyThread3() {
            th = new Thread(this);
        }

        void start() {
            th.start();
        }

        @Override
        public void run() {
            Random random = new Random();
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }
            String fileName = Thread.currentThread().getName() + ".txt";
            File file = new File(fileName);
            try {
                FileWriter writer = new FileWriter(file);
                for (int j : array) {
                    writer.write(j + " ");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
