package javacore.generics.service;

import javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Balsa")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponivel...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barco disponiveis pra alugar...");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco: " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barco disponiveis pra alugar..");
        System.out.println(barcosDisponiveis);
    }
}
