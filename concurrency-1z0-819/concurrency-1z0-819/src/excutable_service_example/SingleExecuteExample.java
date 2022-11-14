package excutable_service_example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecuteExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            System.out.println("1: " + Math.random() + " Thread id: " + Thread.currentThread().getId());
            System.out.println("2: " + Math.random() + " Thread id: " + Thread.currentThread().getId());
            System.out.println("3: " + Math.random() + " Thread id: " + Thread.currentThread().getId());
            System.out.println("4: " + Math.random() + " Thread id: " + Thread.currentThread().getId());
            // executorService.shutdown();
        });

        List<Callable<Integer>> callables = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int finalI = i;
            Callable<Integer> intCallable = ()
                    -> finalI + 10;
            callables.add(intCallable);
        }
        try {
            Thread.sleep(100);
            System.out.println("ExecutorService invokeAny callable task and return: " + executorService.invokeAny(callables));
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
    }
}
