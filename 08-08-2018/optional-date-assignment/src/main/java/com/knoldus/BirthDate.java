package com.knoldus;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BirthDate {

    public static void displayBirthDate(LocalDate birth_date) {

        LocalDate today_date = LocalDate.now();
        int difference = today_date.minusYears(birth_date.getYear()).getYear();

        List<DayOfWeek> dayOfWeekList =
                 IntStream.rangeClosed(0, difference)
                .boxed().map(birth_date::plusYears).map(LocalDate::getDayOfWeek)
                .collect(Collectors.toList());

        dayOfWeekList.forEach(System.out::println);
    }
}
