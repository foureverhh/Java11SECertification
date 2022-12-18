package reader_and_writer.bytes_reader_and_writer;

import java.io.*;

public class PlayWithInputStream {
    public static void main(String[] args) {
        byte[] header = {0xC, 0xA, 0XF, 0xE, 0xB, 0xA, 0xB, 0xE};
        try(OutputStream os = new FileOutputStream("files/data.bin");) {
            os.write(header);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(InputStream is = new FileInputStream("files/data.bin")) {
            byte[] allBytes = is.readAllBytes(); // read all bytes in one time
            for (byte item : allBytes) {
                System.out.printf("0x%x ", item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
