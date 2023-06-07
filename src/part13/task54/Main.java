package part13.task54;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread2 thread = new MyThread2();
            thread.start();
        }
    }

    static class MyThread2 implements Runnable {
        Thread th;

        public MyThread2() {
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
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println(Thread.currentThread().getName() + ": " + max);
        }
    }
}
