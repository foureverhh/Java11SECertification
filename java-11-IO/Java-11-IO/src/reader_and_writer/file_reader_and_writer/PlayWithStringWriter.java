package reader_and_writer.file_reader_and_writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class PlayWithStringWriter {
    public static void main(String[] args) {
        try(StringWriter writer = new StringWriter()) {
            writer.write("Hello world!");
            writer.flush();
            StringBuffer buffer = writer.getBuffer();
            String string = writer.toString();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
