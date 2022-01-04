package se.lexicon;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();

        System.out.println(timeNow);
        System.out.println(timeNow.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(timeNow.truncatedTo(ChronoUnit.SECONDS));

        LocalTime lunch = LocalTime.NOON;
        LocalTime min = LocalTime.MIN;
        LocalTime max = LocalTime.MAX;

        System.out.println("lunch = " + lunch);
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        LocalTime startOfLecture = LocalTime.of(9,0);
        LocalTime endOfOfWorkDay = LocalTime.parse("16:30");

//        LocalTime localTime = timeNow.plusHours(10);
        LocalTime localTime = timeNow.plus(10, ChronoUnit.HOURS);

        System.out.println(localTime);

        Duration duration = Duration.between(timeNow, lunch);

        System.out.println("seconds to Lunch " + (duration.getSeconds()/60));



    }



}
