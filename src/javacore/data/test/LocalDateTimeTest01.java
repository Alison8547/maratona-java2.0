package javacore.data.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate data = LocalDate.parse("2022-10-08");
        LocalTime time = LocalTime.parse("23:45:00");
        LocalDateTime localDateTime1 = data.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(data);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
