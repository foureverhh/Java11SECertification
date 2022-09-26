package data_and_time;

import java.time.*;

public class DateAndTimes {
    public static void main(String[] args) {
        System.out.println("Date and times, Part 1");
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        localDate = LocalDate.of(2022,10,31);
        System.out.println("localDate:" + localDate);
        localTime = LocalTime.of(9,45,00,00);
        System.out.println("localTime:" + localTime);
        localDateTime = LocalDateTime.of(2022, 10,31,9,45);
        System.out.println("localDateTime:" + localDateTime);
        zonedDateTime = ZonedDateTime.of(2022,10,31,9,45, 00, 00, ZoneId.of("America/Chicago"));
        System.out.println("zonedDateTime:" + zonedDateTime);

        String dateTimeString = localDateTime.getDayOfWeek() + " " + localDateTime.getMonth() + " " + localDateTime.getDayOfMonth()
    }

}
