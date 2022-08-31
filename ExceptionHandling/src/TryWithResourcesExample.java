import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("in.txt");
             FileOutputStream out = new FileOutputStream("out.txt")){
            out.write(in.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
