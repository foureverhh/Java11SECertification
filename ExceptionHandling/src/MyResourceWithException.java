import java.io.IOException;

public class MyResourceWithException implements AutoCloseable{
    String name;

    public MyResourceWithException(String name) {
        this.name = name;
    }
    @Override
    public void close() throws IOException {
        System.out.println("Closing resource #: " + name);
    }
}
