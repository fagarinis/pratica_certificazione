package parte2.concurrency;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread1 {
    public static void main(String[] args) throws Exception {

        invokeAnyTest();
    }

    static void executorServiceTest() {
        ExecutorService service = Executors.newFixedThreadPool(1);

        Runnable task1 = () -> System.out.println("task1 running");
        Runnable task2 = () -> System.out.println("task2 running");

        service.submit(task1);
        service.submit(task2);

        service.shutdown();
    }

    static void invokeAnyTest() throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Callable<String> task1 = () -> "task1 completed";
        Callable<String> task2 = () -> {
            throw new Exception();
        };
        Callable<String> task3 = () -> "task3 completed".repeat(100);

        // ritorna il risultato del primo task (in ordine) che è stato completato con successo
        String result = service.invokeAny(List.of(task2,task3 ,task1 ));
        System.out.println(result);
        service.shutdown();
    }
}
