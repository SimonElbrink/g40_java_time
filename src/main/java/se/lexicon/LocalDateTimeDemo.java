package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime dateAndTimeNow = LocalDateTime.now();

        System.out.println("dateAndTimeNow = " + dateAndTimeNow.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println("dateAndTimeNow = " + dateAndTimeNow.format(DateTimeFormatter.ofPattern("eeee dd MM yyy hh:mm")));
        
    }
}
