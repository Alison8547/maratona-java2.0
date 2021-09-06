package javacore.data.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofYears(7);
        Period p3 = Period.ofMonths(3);
        Period p4 = Period.ofWeeks(45);
        Period p5 = Period.ofDays(2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p3.getMonths());
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(p3.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(p4.getDays()), ChronoUnit.DAYS));
    }
}
