package date_time_formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime;

        System.out.println("------------- DateTimeFormatter.ofPattern() -------------");
        String pattern = "dd-MMMM-yyyy HH:mm:ss.SSS";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        formattedDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println("Formatted LocalDateTime.now() - " + formattedDateTime);

        System.out.println();

        System.out.println("----------- DateTimeFormatter.ISO_LOCAL_DATE_TIME ---------");
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        formattedDateTime = isoLocalDateTime.format(localDateTime);
        System.out.println("Formatted LocalDateTime.now() - " + formattedDateTime);

        System.out.println();

        System.out.println("----------- DateTimeFormatter.ofLocalizedDateTime() ---------");
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        formattedDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println("Formatted LocalDateTime.now() FormatStyle.SHORT - " + formattedDateTime);
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        formattedDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println("Formatted LocalDateTime.now() FormatStyle.MEDIUM - " + formattedDateTime);
        System.out.println("Formatted LocalDateTime.now() - " + localDateTime);

        System.out.println();

        System.out.println("-------------- DateTimeFormatter.ofLocalizedDate() --------------");
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        formattedDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println("Formatted LocalDateTime.now() FormatStyle.LONG - " + formattedDateTime);
        dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        formattedDateTime = dateTimeFormatter.format(localDateTime);
        System.out.println("Formatted LocalDateTime.now() FormatStyle.FULL - " + formattedDateTime);

        System.out.println();

        System.out.println("----------------Temporal accessor---Parse()-------------------");
        TemporalAccessor parse = isoLocalDateTime.parse("2023-01-05T11:07:56.425172");
        System.out.println("TemporalAccessor: " + parse);


    }
}
