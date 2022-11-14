package reenter_lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count {
    public static int counter;
    private static final Lock lock = new ReentrantLock();
    public static void incrementCounter() {
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    //Lock和TryLock的区别
                    //1:  lock拿不到锁会一直等待。tryLock是去尝试，拿不到就返回false，拿到返回true。
                    //
                    //2:  tryLock是可以被打断的，被中断的，lock是不可以。
                    // lock.lock()
                    int current = counter;
                    System.out.println("Before: " + counter + " current thread: " + Thread.currentThread().getName() +
                            " with id " + Thread.currentThread().getId());
                    counter = current + 1;
                    System.out.println("After: " + counter + " current thread: " + Thread.currentThread().getName() +
                            " with id " + Thread.currentThread().getId());
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Thread failed to get the lock.");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // lock on object lock
            Thread t = new Thread(Count::incrementCounter, "t" + i);
            t.start();
        }
    }
}
