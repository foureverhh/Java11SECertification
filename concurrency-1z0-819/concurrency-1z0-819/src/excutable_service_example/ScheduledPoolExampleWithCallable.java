package excutable_service_example;

import java.util.concurrent.*;

public class ScheduledPoolExampleWithCallable {
    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(50);

    public static void main(String[] args) {
        Future<Double> doubleFuture= executorService.schedule(() -> {
            Thread.sleep((int) (Math.random() * 200));
            System.out.println("Thread id: " + Thread.currentThread().getId());
            return Math.random();
        }, 1000, TimeUnit.MILLISECONDS);

        try {
            System.out.println(doubleFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            doubleFuture.cancel(true);
        }
        if(doubleFuture.isCancelled()) {
            System.out.println("Sorry, the doubleFuture is cancelled!");
        }

        if(doubleFuture.isDone()) {
            System.out.println("Good, the doubleFuture is done!");
        }
        executorService.shutdown();
    }
}
