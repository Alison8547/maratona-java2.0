package javacore.modificadorstatic.test;

import javacore.modificadorstatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Audi", 250);
        Carro carro2 = new Carro("SkyLine", 300);
        Carro carro3 = new Carro("Ferrari", 290);

        Carro.setVelocidadeLimite(180);  // Quando utilizar um método static: Quando não tiver nenhum objeto pra instanciar

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
