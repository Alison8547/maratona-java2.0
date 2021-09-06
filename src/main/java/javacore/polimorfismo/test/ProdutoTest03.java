package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("I5 3470", 4000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("01/01/2022");

        CalculadoraImposto.calculaImposto(tomate);
        System.out.println("---------------");
        CalculadoraImposto.calculaImposto(produto1);

    }
}
