package javacore.comportamento.test;

import javacore.comportamento.dominio.Car;
import javacore.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
//        filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
        List<Car> greenFilter = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redFilter = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearFilter = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenFilter);
        System.out.println(redFilter);
        System.out.println(yearFilter);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCars.add(car);
            }
        }
        return filterCars;

    }

}
