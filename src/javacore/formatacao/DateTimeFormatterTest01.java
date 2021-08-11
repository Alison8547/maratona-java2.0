package javacore.formatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20210811", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-08-11+04:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-08-11", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("-----------");

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s);
        LocalDateTime parse = LocalDateTime.parse("2021-08-11T15:35:27.2653498", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

        LocalDate parse4 = LocalDate.parse("11/08/2021", formatterBR);
        System.out.println(parse4);

        DateTimeFormatter formatterJA = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.JAPAN);
        String formatJA = LocalDate.now().format(formatterJA);
        System.out.println(formatJA);
        LocalDate parseJA = LocalDate.parse("11.8月.2021", formatterJA);
        System.out.println(parseJA);
    }
}
