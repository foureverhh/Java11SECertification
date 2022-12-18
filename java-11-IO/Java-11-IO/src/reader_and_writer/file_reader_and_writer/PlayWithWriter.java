package reader_and_writer.file_reader_and_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class PlayWithWriter {
    public static void main(String[] args) {

        try( Writer writer = new FileWriter("files/words.txt")){
            writer.write("hello world!");
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
