package excutable_service_example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledPoolExampleWithRunnable {
    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(50);

    public static void main(String[] args) {
        boolean timeToShutdown = false;
        final AtomicInteger i = new AtomicInteger(0);
        executorService.scheduleWithFixedDelay(() -> {
           i.incrementAndGet();
            System.out.println(i + "Thread id: " + Thread.currentThread().getId());
        },1000, 1000, TimeUnit.MILLISECONDS);

        // executorService.shutdown();
        try {
            timeToShutdown = executorService.awaitTermination(30, TimeUnit.SECONDS);
            if(!timeToShutdown) {
                executorService.shutdown();
            }
        } catch (InterruptedException e) {
            executorService.shutdown();
            e.printStackTrace();
        }
        }
}
