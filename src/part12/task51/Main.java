package part12.task51;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String dirPath = "dir1/dir2/dir3";
        int fileCount = 5;
        int numCount = 10;

        try {
            Files.createDirectories(Paths.get(dirPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> fileNames = new ArrayList<>();
        for (int i = 0; i < fileCount; i++) {
            String fileName = "file" + (i + 1) + ".txt";
            fileNames.add(fileName);
            try (PrintWriter writer = new PrintWriter(new FileWriter(dirPath + "/" + fileName))) {
                Random random = new Random();
                for (int j = 0; j < numCount; j++) {
                    int number = random.nextInt(100);
                    writer.println(number);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(dirPath + "/all.txt"))) {
            for (String fileName : fileNames) {
                try (Scanner scanner = new Scanner(new File(dirPath + "/" + fileName))) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        writer.println(line);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(dirPath + "/files.txt"))) {
            File dir = new File(dirPath);
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        writer.println(file.getName());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
