package file_and_path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PlayWithPath {
    public static void main(String[] args) {
        // Path path1 = Paths.get("images/seaside.jpg");
        Path path1 = Paths.get("/images/seaside.jpg");
        Path path2 = Path.of("images/mountain.jpg");
        System.out.println("path1 = " + path1);
        System.out.println("path2 = " + path2);
        System.out.println("path1 = " + path1.getClass());
        System.out.println("path2 = " + path2.getClass());

        boolean absolute = path1.isAbsolute();
        System.out.println("absolute = " + absolute);

        Path root1 = path1.getRoot();
        System.out.println("root1 = " + root1);
        Path root2 = path2.getRoot();
        System.out.println("root2 = " + root2);

        //resolve

        //resolve with empty or relative path, cancat
        //resolve with absolute path, only takes absolute path
        Path pathAbsolute1 = Path.of("C:/myImages/sunrise.jpg");
        Path pathRelative1 = Path.of("sunset.jpg");

        Path resolve = pathAbsolute1.resolve(pathRelative1);
        System.out.println("pathAbsolute resolves pathRelative = " + resolve);
        //result /images/sunrise.jpg/sunset.jpg

        Path pathRelative2 = Path.of("images/sunrise.jpg");
        resolve = pathRelative2.resolve(pathRelative1);
        System.out.println("Relative resolve relative: " + resolve); // result images/sunrise.jpg/sunset.jpg

        Path placeHolder = Path.of("");
        resolve = pathAbsolute1.resolve(placeHolder);
        System.out.println(resolve); // /images/sunrise.jpg
        resolve = pathRelative2.resolve(placeHolder);
        System.out.println(resolve); // images/sunrise.jpg

        Path pathAbsolute2 = Path.of("/images/hello.jpg");
        resolve = pathAbsolute1.resolve(pathAbsolute2);
        System.out.println("absolut resolve absolute: " + resolve); // /images/hello.jpg
        resolve = pathAbsolute1.resolve(pathRelative1);
        System.out.println(resolve);


        // test resolveSibling()
        // replace file
        path1 = Paths.get("c:/images/mountain.jpg");
        path2 = Path.of("seaside.jpg");
        Path resolveSibling = path1.resolveSibling(path2);
        System.out.println("resolveSibling = " + resolveSibling); // c:/images/seaside.jpg
        path1 = Paths.get("mountain.jpg");
        resolveSibling = path1.resolveSibling(path2);
        System.out.println("resolveSibling with this path as relative path, or the other is absolute, then only take the other: " + resolveSibling );
        // seaside.jpg

        path1 = Paths.get("c:/images/mountain.jpg");;
        path2 = Path.of("");
        System.out.println("absolute resolve empty, returns the parent of this parent: " + path1.resolveSibling(path2));
        // c:/images


        // relativize()
        // find relative path from this path to other path
        System.out.println("relativize() testing");
        path1 = Paths.get("C:/images/jpgs/");
        path2 = Paths.get("C:/images/pngs/");
        System.out.println("path1: " + path1);
        System.out.println("path2: " + path2);
        Path relativize = path1.relativize(path2);
        System.out.println("relativize absolute with absolute: " + relativize); // ../pngs
        path1 = Paths.get("C:/videos/");
        relativize = path1.relativize(path2);
        System.out.println("relativize absolute with absolute: " + relativize); // ../images/pngs

        // normalize()
        // remove redundancies from a path
        System.out.println("normalize()");
        path1 = Path.of("videos/../videos/../videos");
        path2 = Path.of("images/pngs/");
        Path normalize = path1.normalize();
        System.out.println("normalize: " + normalize);
        normalize = path2.normalize();
        System.out.println("normalize: " + normalize);


        /**
         * File fs is representative the platform's local file system
         * FileSystem fs = DefaultFileSystem.getFileSystem();
         *
         * FilesSystems.getDefault().getPath();
         */

    }
}
