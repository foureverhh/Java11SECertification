public class TryWithResourcesReverseClose {
    public static void main(String[] args) {
        try(var one = new MyResource("one");
            var two = new MyResource("two")) {
            throw new RuntimeException();
        }
    }

    /*Closing resource #: two
      Closing resource #: one
       Exception in thread "main" java.lang.RuntimeException
	  at TryWithResourcesReverseClose.main(TryWithResourcesReverseClose.java:5)
    * */

    //reverse close resources, close two and then one
    //even throw exception in try-block, finally-block runs as well to close resources
    //Compare with TryWithResourcesReverseCloseWithThrowException, if AutoCloseable close() does not throw exception, then catch-block is optional
}
