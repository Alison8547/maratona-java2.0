package javacore.modificadorfinal.test;

import javacore.modificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_MAXIMA);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Willian");
        System.out.println(carro.COMPRADOR);
    }
}
