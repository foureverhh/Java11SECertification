import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchSyntax {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("basic_try_catch_demo.txt"));
            String line = null;
            while ((line = reader.readLine())!=null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.format("FileNotFoundException: %s%n", e);
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
