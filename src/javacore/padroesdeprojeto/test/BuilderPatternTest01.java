package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Alison")
                .lastName("Silva")
                .username("Mago")
                .email("Alison@hotmail.com")
                .build();

        System.out.println(build);
    }
}
