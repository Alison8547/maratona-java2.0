package javacore.generics.test;

import javacore.generics.dominio.Carro;
import javacore.generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
