package time_stamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TimestampDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        System.out.println("Timestamp converted from localDateTime - " + timestamp);
    }
}
