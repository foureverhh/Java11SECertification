package local_date_time;

import java.time.LocalDateTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2021,3,7,12,44,36);
        System.out.println("DayOfMonth - " + localDateTime.getDayOfMonth());
        System.out.println("Month - " + localDateTime.getMonth());
        System.out.println("Hour - " + localDateTime.getHour());
        System.out.println("Minute - " + localDateTime.getMinute());
        System.out.println("-----------------------------------------------");
        localDateTime = LocalDateTime.now();
        System.out.println("DayOfMonth - " + localDateTime.getDayOfMonth());
        System.out.println("Month - " + localDateTime.getMonth());
        System.out.println("Hour - " + localDateTime.getHour());
        System.out.println("Minute - " + localDateTime.getMinute());
    }
}
