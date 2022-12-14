package file_and_path;

import java.io.File;
import java.io.IOException;

public class PlayWithFiles {
    public static void main(String[] args) {
        File file = new File("files/sonnet.txt");
        System.out.println("file = " + file);
        System.out.println("file exists() = " + file.exists());
        System.out.println("file isDirectory() = " + file.isDirectory());
        System.out.println("file isFile() = " + file.isFile());

        file = new File("files/sonnet2.txt");
        try {
            boolean fileCreated = file.createNewFile();
            System.out.println("fileCreated = " + fileCreated);
            System.out.println("file exists = " + file.exists());
            File dir = new File("files/data");
            boolean dirCreated = dir.mkdir();
            System.out.println("dirCreated = " + dirCreated);
            System.out.println("dir exists = " + dir.exists());
            File dirs1 = new File("files/data1/more-data");
            boolean dirs1Created = dirs1.mkdir();
            System.out.println("dirs1Created = " + dirs1Created);
            System.out.println("dir1 exists = " + dirs1.exists());
            dirs1Created = dirs1.mkdirs();
            System.out.println("dirs1Created = " + dirs1Created);
            System.out.println("dir1 exists = " + dirs1.exists());
            //mkdir() creates only on directory
            //mkdirs() creates multi layer dir
            System.out.println("dirs1 is delete() = " + dirs1.delete());
            dirs1.deleteOnExit();
            System.out.println("dirs1 exists after deleteOnExit() = " + dirs1.exists());
            System.out.println("dirs1 = " + dirs1);
            String name = dirs1.getName();
            String parent = dirs1.getParent();
            String path = dirs1.getPath();

            System.out.println("name = " + name);
            System.out.println("parent = " + parent);
            System.out.println("path = " + path);

            dir = new File("images/debug.png");
            name = dir.getName();
            parent = dir.getParent();
            path = dir.getPath();
            System.out.println("name = " + name);
            System.out.println("parent = " + parent);
            System.out.println("path = " + path);

            dir = new File("images/images/debug.png");
            String absolutePath = dir.getAbsolutePath();
            String canonicalPath = dir.getCanonicalPath();
            System.out.println("absolutePath = " + absolutePath);
            System.out.println("canonicalPath = " + canonicalPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
