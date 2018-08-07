package com.knoldus;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeapYear {

    public static void leapYearCalculation(LocalDate input_date){

        LocalDate date=LocalDate.now();
        int difference = date.minusYears(input_date.getYear()).getYear();
        List<LocalDate> list =
                        IntStream.rangeClosed(0, difference)
                        .boxed().map(input_date::plusYears)
                        .filter(LocalDate::isLeapYear)
                        .collect(Collectors.toList());
         list.forEach(i->System.out.println(i.getYear()));
    }

}
