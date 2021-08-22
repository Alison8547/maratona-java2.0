package javacore.generics.service;

import javacore.generics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarCarroDisponivel() {
        System.out.println("Buscando objeto disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponiveis pra alugar...");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetooAlugado(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis pra alugar..");
        System.out.println(objetosDisponiveis);
    }
}
