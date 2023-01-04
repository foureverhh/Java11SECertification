package locale_constructor;
import java.util.*;
public class LocaleDemo {
    public static void main(String[] args) {
        Locale[] franceLocales = {
                new Locale("fr"),
                new Locale("fr","FR"),
                new Locale("fr","FR", "MAC")
        };
        System.out.println(franceLocales[0]);
        System.out.println(franceLocales[1]);
        System.out.println(franceLocales[2]);
        System.out.println("Locale builder");
        Locale franceLocaleByBuilder = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
        System.out.println(franceLocaleByBuilder);
    }
}
