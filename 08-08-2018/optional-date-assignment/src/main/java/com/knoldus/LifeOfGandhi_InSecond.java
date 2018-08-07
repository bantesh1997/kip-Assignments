package com.knoldus;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LifeOfGandhi_InSecond {

    public static void lifeCalculator(){

     //   LocalDate
     LocalDate birthDate=LocalDate.of(1869, Month.OCTOBER,2);
     LocalDate deathDate=LocalDate.of(1948, Month.JANUARY,30);
      //  Duration duration=Duration.between(deathDate,birthDate);
        //System.out.println(duration);
        long days = ChronoUnit.DAYS.between(birthDate, deathDate);
        System.out.println(days*60*60*24);
    }
}
