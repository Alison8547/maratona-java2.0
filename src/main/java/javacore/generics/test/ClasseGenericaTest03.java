package javacore.generics.test;

import javacore.generics.dominio.Barco;
import javacore.generics.dominio.Carro;
import javacore.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("GTR")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Balsa")));

        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = carroRentalService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentalService.retornarObjetooAlugado(carro);

        System.out.println("--------------------");

        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);
        Barco barco = barcoRentalService.buscarCarroDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentalService.retornarObjetooAlugado(barco);
    }
}
