package parte2.thread;

import java.util.List;
import java.util.concurrent.*;

class Test {
    static void sleep(int numOfSeconds) {
        try {
            Thread.sleep(1000 * numOfSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Callable<String> task1 = () -> "Task 1";
        Callable<String> task2 = () -> {
            sleep(1);
            return "Task 2";
        };
        Callable<String> task3 = () -> {
            sleep(2);
            return "Task 3";
        };
        service.invokeAll(List.of(task1, task2, task3), 2, TimeUnit.SECONDS)
                .forEach(f -> {
                    try {
                        System.out.println(f.get());
                    } catch (InterruptedException | ExecutionException e) { }
                });

        service.shutdown();
        System.out.println("ciao");
    }
}

