package part13.task53;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread1 thread = new MyThread1();
            thread.start();
        }
    }

    static class MyThread1 implements Runnable {
        Thread th;

        public MyThread1() {
            th = new Thread(this);
        }

        void start() {
            th.start();
        }

        @Override
        public void run() {
            int sum = 0;
            ArrayList<Integer> collection = new ArrayList<>();
            Random random = new Random();
            for (int j = 0; j < 10; j++) {
                int x = random.nextInt(100);
                collection.add(x);
                sum += x;
            }
            System.out.println(Thread.currentThread().getName() + " - cреднее арифметическое чисел коллекции: " + (double) sum / 10);
        }
    }
}