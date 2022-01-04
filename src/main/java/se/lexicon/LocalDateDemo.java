package se.lexicon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalDateDemo {


    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate.parse("2022-01-04");

        System.out.println("today = " + today);

        DayOfWeek dayOfWeek = today.getDayOfWeek();

        System.out.println("dayOfWeek = " + dayOfWeek);

        LocalDate myBirthdate = LocalDate.of(1997, 3, 18);

        System.out.println(myBirthdate.getDayOfWeek());

        boolean isLeapYear = myBirthdate.isLeapYear();

        System.out.println("isLeapYear = " + isLeapYear);
        
        LocalDate myBirthdatePlus3Days = myBirthdate.plus(3, ChronoUnit.DAYS);

        System.out.println("myBirthdatePlus3Days = " + myBirthdatePlus3Days);

        LocalDate myNextBirthDay = myBirthdate.plus(Period.ofYears(1));
        System.out.println("myNextBirthDay = " + myNextBirthDay);

        Period period = daysToChristmas(LocalDate.now());

        System.out.println(period.getYears() + " Years " + period.getMonths() + " Months " + period.getDays() + " Days.");

    }

    public static Period daysToChristmas(LocalDate today){

        LocalDate christmas = LocalDate.of(today.getYear(), 12, 24);

        return Period.between(today,christmas);

    }


}
