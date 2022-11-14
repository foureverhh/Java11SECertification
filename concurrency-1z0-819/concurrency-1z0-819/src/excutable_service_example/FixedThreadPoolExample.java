package excutable_service_example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> callables = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            final int finalI = i;
            Callable<Integer> callable = () -> finalI + 10;
            callables.add(callable);
        }
        try {
            System.out.println("invokeAny returns: " + executorService.invokeAny(callables));
            List<Future<Integer>> futures = executorService.invokeAll(callables);
            for (Future<Integer> f: futures) {
                System.out.println(f.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
