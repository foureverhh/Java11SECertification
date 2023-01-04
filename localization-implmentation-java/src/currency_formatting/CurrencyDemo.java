package currency_formatting;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
    public static void main(String[] args) {
        Locale currencyLocale = Locale.getDefault();
        Currency curCurrency = Currency.getInstance(currencyLocale);
        System.out.println(curCurrency.getDisplayName());
        System.out.println(curCurrency.getSymbol());

        currencyLocale = new Locale("en","US");
        curCurrency = Currency.getInstance(currencyLocale);
        System.out.println(curCurrency.getDisplayName());
        System.out.println(curCurrency.getSymbol());
    }
}
