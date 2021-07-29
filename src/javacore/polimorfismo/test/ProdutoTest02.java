package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("I5 3470",4000);  // Produto q é a mais generica fazendo a refêrencia pra o computador
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calculaImposto());
        System.out.println("------------");
        Produto produto2 = new Tomate("Americano",20,"01/01/2022");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calculaImposto());

    }
}
