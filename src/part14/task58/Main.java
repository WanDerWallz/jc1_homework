package part14.task58;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Producer producer1 = new Producer("Producer 1", queue);
        Producer producer2 = new Producer("Producer 2", queue);
        Producer producer3 = new Producer("Producer 3", queue);
        Consumer consumer1 = new Consumer("Consumer 1", queue);
        Consumer consumer2 = new Consumer("Consumer 2", queue);

        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();


        try {
            producer1.join();
            producer2.join();
            producer3.join();
            consumer1.join();
            consumer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class Producer extends Thread {
        private final Queue<Integer> queue;
        private volatile boolean producing;

        public Producer(String name, Queue<Integer> queue) {
            super(name);
            this.queue = queue;
            producing = true;
        }

        @Override
        public void run() {
            Random random = new Random();
            int processedNumbers = 0;

            while (producing && processedNumbers < 10000) {
                processedNumbers++;
                synchronized (queue) {
                    while (queue.size() >= 200) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int value = random.nextInt(99) + 1;
                    queue.add(value);
                    processedNumbers++;
                    System.out.println(getName() + " добавил число " + value + ".");
                    queue.notifyAll();
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    private static class Consumer extends Thread {
        private final Queue<Integer> queue;

        public Consumer(String name, Queue<Integer> queue) {
            super(name);
            this.queue = queue;
        }

        @Override
        public void run() {
            int processedNumbers = 0;

            while (processedNumbers < 10000) {
                processedNumbers++;
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int value = queue.remove();
                    System.out.println(getName() + " забрал число " + value + ".");
                    queue.notifyAll();

                    if (queue.size() <= 80) {
                        queue.notifyAll();
                    }
                }

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            /*if (processedItems == 10000) {
                System.exit(0);*/
        }
    }
}
