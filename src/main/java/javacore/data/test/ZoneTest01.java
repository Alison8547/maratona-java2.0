package javacore.data.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneLosAngeles = ZoneId.of("America/Los_Angeles");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(zoneLosAngeles);
        System.out.println(zonedDateTime);

        Instant instantNow = Instant.now();
        System.out.println(instantNow);
        ZonedDateTime zonedDateTime2 = instantNow.atZone(zoneLosAngeles);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");

        OffsetDateTime offsetDateTime = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneOffset);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = instantNow.atOffset(zoneOffset);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate date = LocalDate.of(1900, 2, 1);
        JapaneseDate japaneseDate1 = JapaneseDate.from(date);
        System.out.println(japaneseDate1);


    }
}
