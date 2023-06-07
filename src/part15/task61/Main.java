package part15.task61;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3); //Что здесь, что в предыдущих заданиях, всё выполняет поток main. Причину этого я понять не могу.
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add(new FileWriterTask());
        }
        try {
            List<Future<String>> futures = executorService.invokeAll(tasks);
            for (int i = 0; i < futures.size(); i++) {
                Future<String> future = futures.get(i);
                String result = future.get();
                System.out.println("Задание " + (i + 1) + " выполнено потоком " + Thread.currentThread().getName() + ". Результат: " + result);
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    static class FileWriterTask implements Callable<String> {

        private static final String FILE_NAME = "output.txt";

        @Override
        public synchronized String call() {
            LocalDateTime now = LocalDateTime.now();
            String message = "Hello World " + now + "\n";
            try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
                writer.write(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return message;
        }
    }
}
