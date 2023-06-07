package part15.task61;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class HelloWorldWriter implements Callable<String> {
    private final String threadName;

    public HelloWorldWriter(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public String call() throws Exception {
        synchronized (this) {
            String message = "Hello World " + new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
            try (FileWriter writer = new FileWriter("hello_world.txt", true)) {
                writer.write(message + "\n");
                System.out.println("Thread " + threadName + " wrote message: " + message);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Thread.sleep(1000);
            return message;
        }
    }
}
