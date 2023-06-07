package part15.task59;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Callable<List<String>>> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add(new FileGenerator());
        }
        try {
            List<Future<List<String>>> list = executorService.invokeAll(tasks);
            for (int i = 0; i < list.size(); i++) {
                Future<List<String>> future = list.get(i);
                List<String> fileNames = future.get();
                System.out.println("Задание " + (i + 1) + " выполнено потоком " + Thread.currentThread().getName() + ". Сгенерированы файлы: " + fileNames);
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    static class FileGenerator implements Callable<List<String>> {

        @Override
        public List<String> call() throws Exception {
            List<String> fileNames = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                String fileName = "file" + (i + 1) + ".txt";
                fileNames.add(fileName);
                try (FileWriter writer = new FileWriter(fileName)) {
                    for (int j = 0; j < 10; j++) {
                        writer.write(generateRandomString() + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            Thread.sleep(random.nextInt(2000) + 1000);

            return fileNames;
        }
    }

    private static String generateRandomString() {
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            char randomChar = (char)(random.nextInt(26) + 'a');
            buffer.append(randomChar);
        }
        return buffer.toString();
    }
}

