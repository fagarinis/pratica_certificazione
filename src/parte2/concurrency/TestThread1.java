package parte2.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread1 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);

        Runnable task1 = () -> System.out.println("task1 running");
        Runnable task2 = () -> System.out.println("task2 running");

        service.submit(task1);
        service.submit(task2);

        service.shutdown();

    }
}
