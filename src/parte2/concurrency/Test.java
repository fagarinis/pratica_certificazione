package parte2.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(() -> {
            throw new RuntimeException("Task 1");
        });
        service.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 2");
        });
        service.submit(() -> System.out.println("Task 3"));
        service.shutdown();
    }
}
