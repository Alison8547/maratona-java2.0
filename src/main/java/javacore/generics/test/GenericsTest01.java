package javacore.generics.test;

import javacore.colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>(); // <String> em tempo de compilação mas quando é executado ele fica List qualquer object
        lista.add("Alison");
        lista.add("Mario");


        add(lista, new Consumidor("Togashi"));

        for (String o : lista) {
            System.out.println(o);
        }
    }

    public static void add(List lista, Consumidor consumidor) { // vai dar erro
        lista.add(consumidor);
    }
}
