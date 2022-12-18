package stream_charactor;

import java.io.*;
import java.math.BigInteger;

public class ReadingWithDataStream {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        byte[] bytes = {};
        try(ByteArrayOutputStream os = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(os);) {
            for (int integer: ints) {
                dos.writeInt(integer);
            }
            dos.flush();
            bytes = os.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("byte.length = " + bytes.length );

        try(ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            DataInputStream dis = new DataInputStream(bis)) {
            /*
            for(int i = 0; i < 5; i++) {
                int read = dis.readInt();
                System.out.println("read = " + read);
            }
            System.out.println("Buff");
             */
            int totalBytes = bis.available();
            System.out.println("totalBytes " + totalBytes);
            byte[] buf = new byte[4];
            while (dis.read(buf) != -1) {
                int integer = new BigInteger(buf).intValue();
                System.out.println("read via buf = " + integer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
