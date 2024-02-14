package lesson_from_school;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
     LocalDate date = LocalDate.now();
     System.out.print("Bugun " + date);

     LocalDate olDate = LocalDate.of(2009,11,29);

     Period period = Period.between(date, olDate);
     System.out.println("Yosh " + period);

     LocalTime time = LocalTime.now();
     System.out.println(time);

     LocalDateTime localDateTime = LocalDateTime.now();
     System.out.println(localDateTime);


        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Ameirca/Chicago"));
        System.out.println(zonedDateTime);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(dateTime.format(dateTimeFormatter));


    }
}
