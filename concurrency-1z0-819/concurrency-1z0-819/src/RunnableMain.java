import runnable_callable.RunThread;

public class RunnableMain {
    public static void main(String[] args)  {
        /*
        Thread t = new Thread(()->{
            System.out.println("Thread id: " + Thread.currentThread().getId() + " prints hello world");
        });
        t.start();

        CustomizedThread customizedThread = new  CustomizedThread();
        customizedThread.start();

        new CallThread().call();

        System.out.println("Main id :" + Thread.currentThread().getId());

         */
        Thread labor1 = new Thread(new RunThread(), "labor1");
        labor1.start();
        // laborThread.interrupt();
        try {
            labor1.join(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread labor2 = new Thread(new RunThread(), "labor2");
        labor2.start();

        System.out.println("Main thread job is done");
    }
}