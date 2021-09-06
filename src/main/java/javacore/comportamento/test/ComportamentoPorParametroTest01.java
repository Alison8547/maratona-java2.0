package javacore.comportamento.test;

import javacore.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterByColor(cars, "black"));
        System.out.println(filterByColor(cars, "red"));
        System.out.println(filterByYear(cars,2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;

    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> redCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                redCars.add(car);
            }
        }
        return redCars;

    }

    private static List<Car> filterByColor(List<Car> cars, String color) {
        List<Car> coloCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                coloCars.add(car);
            }
        }
        return coloCars;

    }

    private static List<Car> filterByYear(List<Car> cars, int year) {
        List<Car> yearCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                yearCars.add(car);
            }
        }
        return yearCars;

    }
}
