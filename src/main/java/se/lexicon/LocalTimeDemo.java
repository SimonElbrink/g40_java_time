package se.lexicon;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        LocalTime startOfLecture = LocalTime.of(9,0);
        LocalTime endOfOfWorkDay = LocalTime.parse("16:30");

        System.out.println(timeNow);
        System.out.println(timeNow.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(timeNow.truncatedTo(ChronoUnit.SECONDS));

        LocalTime lunch = LocalTime.NOON;
        LocalTime min = LocalTime.MIN;
        LocalTime max = LocalTime.MAX;

        System.out.println("lunch = " + lunch);
        System.out.println("min = " + min);
        System.out.println("max = " + max);


//        LocalTime plus_10_hours = timeNow.plusHours(10);
        LocalTime plus_10_hours = timeNow.plus(10, ChronoUnit.HOURS);
        System.out.println(plus_10_hours);


        Duration duration = Duration.between(timeNow, lunch);
        System.out.println("Minutes to Lunch: " + (duration.getSeconds() / 60));



    }



}
