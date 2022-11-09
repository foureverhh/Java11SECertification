package synchronize_lock;

public class Count {
    public static int counter;
    private static final Object lock = new Object();
    public static void incrementCounter() {
        synchronized (lock) {
            int current = counter;
            System.out.println("Before: " + counter + " current thread: " + Thread.currentThread().getName() +
                    " with id " + Thread.currentThread().getId());
            counter = current + 1;
            System.out.println("After: " + counter + " current thread: " + Thread.currentThread().getName() +
                    " with id " + Thread.currentThread().getId());
        }
    }

    // lock on an instance
    public void incrementCounterInstanceMethod() {
        synchronized (this) {
            int current = counter;
            System.out.println("Instance lock before: " + counter + " current thread: " + Thread.currentThread().getName() +
                    " with id " + Thread.currentThread().getId());
            counter = current + 1;
            System.out.println("Instance lock after: " + counter + " current thread: " + Thread.currentThread().getName() +
                    " with id " + Thread.currentThread().getId());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                // lock on object lock
                incrementCounter();
                // lock on instance
                count.incrementCounterInstanceMethod();
                System.out.println("------");
            }, "t" + i);
            t.start();
        }
    }
}
