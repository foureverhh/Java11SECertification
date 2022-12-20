package excutable_service_example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleSubmitExample {
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static Future<Double> getRandom(int i) {
        return executorService.submit(() -> {
            System.out.println(i);
            return Math.random();
        });
    }
    public static void main(String[] args) {
        Future<Double> doubleFuture = getRandom(1);
        getRandom(2);
        getRandom(3);
        getRandom(4);
        while (!doubleFuture.isDone()) {
            if(doubleFuture.isCancelled()) {
                System.out.println("Future is cancelled, we are sorry");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                System.out.println(doubleFuture.get());
            } catch (InterruptedException | ExecutionException e) {
               e.printStackTrace();
            }
            executorService.shutdown();
        }
    }
}
