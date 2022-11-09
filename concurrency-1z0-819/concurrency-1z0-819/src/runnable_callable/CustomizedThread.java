package runnable_callable;

public class CustomizedThread extends Thread{
    @Override
    public void run() {
        System.out.println("Customized Thread: " + Thread.currentThread().getId());
    }
}
