package data_and_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimes_2 {
    public static void main(String[] args) {
        System.out.println("Dates and times, part 2 DateTimeFormatter");
        LocalDateTime localDateTime = LocalDateTime.of(2022, 10,31,9,45);
        var pattern = DateTimeFormatter.ofPattern("EEEE, LLLL dd, yyyy 'at' hh:mm");
        String dateTimesString = localDateTime.format(pattern);
        System.out.println(dateTimesString);
    }
}
