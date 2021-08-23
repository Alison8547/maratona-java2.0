package javacore.comportamento.test;

import javacore.comportamento.dominio.Car;
import javacore.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> greenFilter = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redFilter = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearFilter = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenFilter);
        System.out.println(redFilter);
        System.out.println(yearFilter);
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(numbers, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {  // generics: T
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
