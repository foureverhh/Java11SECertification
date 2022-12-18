package reader_and_writer.file_reader_and_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PlayWithBufferedWriter {
    public static void main(String[] args) {
        /*
        // have to explicitly flush bufferedWriter
        try( FileWriter fileWriter = new FileWriter("files/words.txt")) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Writing to a buffered writer");
            //without bufferedWriter.flush(); it does not work
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        //better practice
        try( FileWriter fileWriter = new FileWriter("files/words.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Writing to a buffered writer!");
            //bufferedWriter auto close will flush
        } catch (IOException e) {
            e.printStackTrace();
        }

        // best practice
        Path path = Path.of("files/words_with_files.txt");
        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
            bufferedWriter.write("writing with Files.newBufferedWriter");
            bufferedWriter.write(" FileWriter fileWriter = new FileWriter(\"files/words.txt\");\n" +
                    "        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)\n" +
                    "equals\n" +
                    "Files.newBufferedWriter(path)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
