package stream_charactor;

import java.io.*;

public class ReadingCharactersFromBytes {
    public static void main(String[] args) {
        String hello = "Hello world!";
        ByteArrayOutputStream buffer;
        try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(bos)) {
            writer.write(hello);
            buffer = bos;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        byte[] bytes = buffer.toByteArray();
        System.out.println("using InputStreamReader");
        try(ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            InputStreamReader reader = new InputStreamReader(bis)) {
            char[] buf = new char[8];
            int read;
            StringBuilder sb = new StringBuilder();
            while ((read = reader.read(buf)) > 0) {
               sb.append(buf,0, read);
            }
            System.out.println(sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("using InputStreamReader and BufferedReader");
        try(ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            InputStreamReader irs = new InputStreamReader(bis);
            BufferedReader reader = new BufferedReader(irs) ) {
            String str;
            while( (str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
