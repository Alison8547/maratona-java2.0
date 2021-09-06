package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Televisao;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("XYZ Ryzen 9", 14000);
        Tomate tomate = new Tomate("Tomate Carmem", 5);
        Televisao tv = new Televisao("Samsung 50\"", 1400);

        CalculadoraImposto.calculaImposto(computador);
        System.out.println("------------------");
        CalculadoraImposto.calculaImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calculaImposto(tv);
    }
}
