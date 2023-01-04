package currency_formatting;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyDemoWithNumberFormat {
    public static void main(String[] args) {
        Double amount = 54628.7;
        Locale currentLocale = Locale.getDefault();
        Currency currency = Currency.getInstance(currentLocale);
        System.out.println(currency.getSymbol());
        System.out.println(currency.getDisplayName());
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
        System.out.println(currencyFormatter.format(amount));
    }
}
