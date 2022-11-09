public class RunThread implements Runnable {
    @Override
    public void run() {
       // System.out.println("Interrupted flag is: "  + Thread.currentThread().getName() + " , "  + Thread.currentThread().isInterrupted());
       // while (!Thread.interrupted()) {
            for (int i = 0; i < 10; i++) {
                // System.out.println("loop is: " + Thread.currentThread().isInterrupted());
                System.out.println("Current thread id: " + Thread.currentThread().getId() + " , name: " + Thread.currentThread().getName() + " , i: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                /*
                https://www.geeksforgeeks.org/interrupting-a-thread-in-java/
                interrupt() method:
                If any thread is in sleeping or waiting for a state then using the interrupt() method,
                we can interrupt the execution of that thread by showing InterruptedException.
                A thread that is in the sleeping or waiting state can be interrupted with the help of the interrupt() method of Thread class.
                If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behavior and
                does not interrupt the thread but sets the interrupt flag to true.
                 */
                    Thread.currentThread().interrupt();
                    break;
                    // System.out.println("catch is: " + Thread.currentThread().isInterrupted());
                }
            }
       // }
    }
}
