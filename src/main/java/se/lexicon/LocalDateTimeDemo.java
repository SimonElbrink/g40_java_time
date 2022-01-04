package se.lexicon;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime timestamp = LocalDateTime.now();

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        System.out.println("timestamp = " + timestamp.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("timestamp = " + timestamp.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println("timestamp = " + timestamp.format(DateTimeFormatter.ofPattern("eeee dd MM yyy hh:mm")));

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
    }
}
