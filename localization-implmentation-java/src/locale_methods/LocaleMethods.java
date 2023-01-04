package locale_methods;

import java.util.Locale;

import static java.util.Locale.CANADA;
import static java.util.Locale.ITALIAN;

public class LocaleMethods {
    static void displayLocaleAttributes(Locale locale) {
        System.out.println("*** Displaying Locale Attributes ***");
        // name for the locale's country
        System.out.println("Display Country: " + locale.getDisplayCountry());
        // name for the locale's language
        System.out.println("Display Language: " + locale.getDisplayLanguage());
        // name for the locale's variant
        System.out.println("Display variant: " + locale.getDisplayVariant());
        // name for the locale
        System.out.println("Display Name: " + locale.getDisplayName());
        // language code for the locale
        System.out.println("Language Code: " + locale.getLanguage());
        // country code for the locale
        System.out.println("Country Code: " + locale.getCountry());
        // variant code for the locale
        System.out.println("Variant Code: " + locale.getVariant());
        System.out.println("**************************************");

    }
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Default locale: " + locale);
        System.out.println("Printing Locale attributes for default locale");
        displayLocaleAttributes(locale);
        locale = new Locale("fr");
        displayLocaleAttributes(locale);
        locale = new Locale("fr", "FR");
        displayLocaleAttributes(locale);
        locale = new Locale("fr", "FR", "MAC");
        displayLocaleAttributes(locale);
        locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        displayLocaleAttributes(locale);

        System.out.println("Printing Locale attributes for Locale constants");
        System.out.println("Display Country:" +  CANADA.getDisplayCountry());
        System.out.println("Display Language:" +  ITALIAN.getDisplayLanguage());
    }
}
