package concurency_collection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ConCurrentBlockingQueue {
    public static void main(String[] args) {
        System.out.println("FIFO");
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.offer("Maria");
        queue.offer("Seleh");
        queue.offer("tom");
        System.out.println(queue.peek());
        System.out.println(queue.contains("Maria") + "," + queue.size());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.contains("Maria") + "," + queue.size());
        System.out.println(queue);

        try {
            queue.offer("Jim", 200, TimeUnit.MILLISECONDS);
            queue.poll(300, TimeUnit.MILLISECONDS);
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(queue);
    }
}
