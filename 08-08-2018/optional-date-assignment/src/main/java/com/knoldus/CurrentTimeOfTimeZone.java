package com.knoldus;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class CurrentTimeOfTimeZone {

    public static void timezone(String zone_name){

        ZoneId zone = ZoneId.of(zone_name);
        LocalDateTime localDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTime = ZonedDateTime.of(localDateAndTime,zone );
        System.out.println("Current date and time in a particular timezone : " + dateAndTime);

        //ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateAndTime,ZoneId.ofOffset("UTC", ZoneOffset.UTC));
      // System.out.println(zonedDateTime1);
    }


}