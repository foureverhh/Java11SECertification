import java.io.IOException;

public class TryWithResourcesReverseCloseWithThrowException {
    public static void main(String[] args) {
        try(var one = new MyResourceWithException("one");
            var two = new MyResourceWithException("two")) {
            throw new RuntimeException();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*Closing resource #: two
      Closing resource #: one
       Exception in thread "main" java.lang.RuntimeException
	  at TryWithResourcesReverseClose.main(TryWithResourcesReverseClose.java:5)
    * */

    //reverse close resources, close two and then one
    //even throw exception in try-block, finally-block runs as well to close resources
}
