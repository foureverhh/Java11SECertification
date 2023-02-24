package format_number;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
    public static void main(String[] args) {
        double num = 32360.856874;
        DecimalFormat df = new DecimalFormat("$#0.00");
        String result = df.format(num);
        System.out.println("Number formatted using DecimalFormat - " + result);
    }
}
