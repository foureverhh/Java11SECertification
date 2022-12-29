package concurency_collection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicExamples {
    private static AtomicInteger ai = new AtomicInteger(0);
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.execute(() -> System.out.println(ai.getAndIncrement()));
        }
        service.shutdown();
    }
}
