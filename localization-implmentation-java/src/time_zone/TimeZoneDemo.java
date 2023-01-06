package time_zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneDemo {
    public static void main(String[] args) {
        // change Locale temporally
        // Locale.setDefault(Locale.CHINA);
        TimeZone localTimeZone = TimeZone.getDefault();
        System.out.println(Locale.getDefault());
        System.out.println("TimeZone - " + localTimeZone.getDisplayName(Locale.getDefault()));
        System.out.println("TimeZone - " + localTimeZone.getDisplayName(new Locale("sv")));

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("ZonedDateTime - " + zonedDateTime);
        System.out.println("DayOfMonth - " + zonedDateTime.toLocalDateTime().getDayOfMonth());
        System.out.println("DayOfMonth - " + zonedDateTime.getDayOfMonth());
        System.out.println("Hour - " + zonedDateTime.toLocalDateTime().getHour());
        System.out.println("Hour - " + zonedDateTime.getHour());
    }
}
