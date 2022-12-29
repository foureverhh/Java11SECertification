package thread_problem;

public class DeadLock {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        final String resource1 = "stuck";
        final String resource2 = "forever";
        // first get a lock on resource1 and then try to obtain one lock on resource2
        Thread thread1 = new Thread(() -> {
          synchronized (resource1) {
              System.out.println("Thread1 has a lock on resource1");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (resource2) {
                System.out.println("Thread1 has further a lock on resource2");
            }
          }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread2 has a lock on resources2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread2 has further a lock on resource1");
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
