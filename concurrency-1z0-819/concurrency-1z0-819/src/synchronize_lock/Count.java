package synchronize_lock;

public class Count {
    public static int counter;
    public static synchronized void incrementCounter() {
        int current = counter;
        System.out.println("Before: " + counter + " current thread: " + Thread.currentThread().getName() +
                " with id " + Thread.currentThread().getId());
        counter = current + 1;
        System.out.println("After: " + counter + " current thread: " + Thread.currentThread().getName() +
                " with id " + Thread.currentThread().getId());
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                incrementCounter();;
            }, "t" + i);
            t.start();
        }
    }
}
