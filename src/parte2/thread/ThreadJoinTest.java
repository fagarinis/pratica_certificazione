package parte2.thread;

public class ThreadJoinTest {
    public static void main(String[] args) throws InterruptedException {

        ThreadJoinTest test = new ThreadJoinTest();
        Thread thread1 = test.printAfterWaitTask(2000, "thread1 finish");
        Thread thread2 = test.printAfterWaitTask(500, "thread2 finish");

        thread1.start();
        thread1.join(); // wait main thread for thread1 to finish task
        thread2.start();
    }

    Thread printAfterWaitTask(long waitMs, String message) {
        return new Thread(() -> {
            try {
                Thread.sleep(waitMs);
                System.out.println(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
