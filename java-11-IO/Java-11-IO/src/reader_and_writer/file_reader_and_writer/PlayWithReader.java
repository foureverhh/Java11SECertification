package reader_and_writer.file_reader_and_writer;

import java.io.*;

public class PlayWithReader {
    public static void main(String[] args) {
        /*
        Reader reader = null;
        try {
             reader = new FileReader("files/sonnet.txt");
            char[] buf = new char[16];
            int read = reader.read(buf);
            StringBuilder sb = new StringBuilder();
            while (read > 0) {
                sb.append(buf, 0, read);
                read = reader.read(buf);
            }
            System.out.println("sb result: " + sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        */

        try (Reader reader = new FileReader("files/sonnet.txt");) {
            char[] buf = new char[16];
            int read = reader.read(buf);
            StringBuilder sb = new StringBuilder();
            while (read > 0) {
                sb.append(buf, 0, read);
                read = reader.read(buf);
            }
            System.out.println("sb result: " + sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
