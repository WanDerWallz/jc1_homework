package part15.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add(new NumberGenerator());
        }
        try {
            List<Future<String>> futures = executorService.invokeAll(tasks);
            for (int i = 0; i < futures.size(); i++) {
                Future<String> future = futures.get(i);
                String result = future.get();
                System.out.println("Задание " + (i + 1) + " выполнено потоком " + Thread.currentThread().getName() + ". Сумма чисел: " + result + ".");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    static class NumberGenerator implements Callable<String> {

        @Override
        public String call() throws Exception {
            List<Integer> numbers = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                numbers.add(random.nextInt(100));
            }
            Thread.sleep(random.nextInt(9000) + 1000);
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            return String.valueOf(sum);
        }
    }
}
