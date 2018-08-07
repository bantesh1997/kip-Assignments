package com.knoldus;

import java.time.LocalDate;
import java.time.Month;

public class ProjectDriver {
    public static void main(String a[]) {
        LocalDate birth_date = LocalDate.of(1991, Month.MAY, 10);

        BirthDate.displayBirthDate(birth_date);

        LocalDate date = LocalDate.of(1900, Month.MAY, 10);

        LeapYear.leapYearCalculation(date);

        //TimeZone tz=new TimeZone();
        CurrentTimeOfTimeZone.timezone("UTC+12");

        LifeOfGandhi_InSecond.lifeCalculator();

    }
}
