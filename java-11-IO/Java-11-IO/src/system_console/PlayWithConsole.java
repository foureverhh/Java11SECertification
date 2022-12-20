package system_console;

import java.io.Console;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PlayWithConsole {
    public static void main(String[] args) {
        Console console = System.console();
        PrintWriter writer = console.writer();
        writer.println("What is your name? >");
        String name = console.readLine();
        writer.printf("Hello %s\n", name);
        writer.printf("What is your password %s?", name);
        char[] chars=  console.readPassword();
        String password = new String(chars);
        writer.printf("%s is a easy password", password);

        // Reader reader = console.reader();
        writer.println();
        writer.printf("What are your favorite colors %s?", name);
        String colors = console.readLine();
        List<String> providedColors = new Scanner(colors).useDelimiter(",").tokens().collect(Collectors.toList());
        writer.println(providedColors);


    }
}
