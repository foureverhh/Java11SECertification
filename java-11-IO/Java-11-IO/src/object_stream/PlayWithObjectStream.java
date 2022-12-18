package object_stream;

import object_stream.model.User;

import java.io.*;

public class PlayWithObjectStream {
    public static void main(String[] args) {
        /*
        User u1 = new User("Paul", 23);
        User u2 = new User("Jennifer", 25);

        try(    FileOutputStream fos = new FileOutputStream("files/user.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(u1);
            oos.writeObject(u2);
        } catch (IOException e) {
           e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("files/user.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);) {
            User paul = (User) ois.readObject();
            User jennifer = (User) ois.readObject();
            System.out.println(paul);
            System.out.println(jennifer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
*/
        try(FileInputStream fis = new FileInputStream("files/user.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);) {
            Object paul = ois.readObject();
            Object jennifer = ois.readObject();
            System.out.println(paul);
            System.out.println(jennifer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
