package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "GTR";
        carro1.modelo = "Nissan";
        carro1.ano = 2014;

        carro2.nome = "Gol";
        carro2.modelo = "Volkswagen";
        carro2.ano = 2000;

        carro1 = carro2; // Agora carro1 está fazendo referência a carro2

        System.out.println("Carro1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
