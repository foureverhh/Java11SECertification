package runnable_callable;

import java.util.concurrent.Callable;

public class CallThread implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("Callable is called");
        return new Object();
    }
}
