package resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TextBundle {
    public static void main(String[] args) {
        Locale usLocale = new Locale("en", "US");
        try {
            ResourceBundle textBundleUs = ResourceBundle.getBundle("TextBundle", usLocale);
            System.out.println(textBundleUs.getString("msg1"));
            System.out.println(textBundleUs.getString("msg2"));
        } catch (Exception e) {
            ResourceBundle defaultBundle = ResourceBundle.getBundle("TextBundle");
            System.out.println(defaultBundle.getString("msg1"));
            System.out.println(defaultBundle.getString("msg2"));
        }
    }
}
