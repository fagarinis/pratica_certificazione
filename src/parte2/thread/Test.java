package parte2.thread;

import java.util.List;
import java.util.concurrent.*;

public class Test {

    static void sleep(int numOfSeconds, String threadName) {
        try {
            int startSeconds = numOfSeconds;
            System.out.println(threadName);
            while (numOfSeconds-- > 0) {
                Thread.sleep(1000);
                System.out.println(threadName + ".".repeat(startSeconds - numOfSeconds));
            }
            System.out.println(threadName + " finish");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(1);
        Callable<String> task1 = () -> "Task 1";
        Callable<String> task2 = () -> {
            sleep(3, "task2");
            return "Task 2";
        };
        Callable<String> task3 = () -> {
            sleep(5, "task3");
            return "Task 3";
        };
        Callable<String> task4 = () -> {
            sleep(5, "task4");
            return "Task 4";
        };
        service.invokeAll(List.of(task1, task2, task3, task4), 15, TimeUnit.SECONDS)
                .forEach(f -> {
                    try {
                        System.out.println(f.get());
                    } catch (InterruptedException | ExecutionException e) {
                    }
                });

        service.shutdown();
    }
}

