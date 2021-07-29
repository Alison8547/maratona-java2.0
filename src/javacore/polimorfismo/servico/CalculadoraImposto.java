package javacore.polimorfismo.servico;

import javacore.polimorfismo.dominio.Produto;


public class CalculadoraImposto {

    public static void calculaImposto(Produto produto) {  // Fazendo o método mais generico e aplicando polimorfismo
        System.out.println("Relatorio imposto...");
        double imposto = produto.calculaImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

    }
}
