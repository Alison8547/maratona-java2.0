package javacore.generics.test;

import javacore.generics.dominio.Barco;
import javacore.generics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Carro> list = criarArrayComUmObjeto(new Carro("GTR Skyline"));
        System.out.println(list);

        criarArrayComUmobjeto2(new Barco("Canoa"));
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }

    private static <T> void criarArrayComUmobjeto2(T t) {
        List<T> list = List.of(t);
        System.out.println(t);
    }
}
