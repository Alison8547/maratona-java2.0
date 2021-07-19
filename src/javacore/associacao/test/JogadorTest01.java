package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Cristiano Ronaldo");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};  // Agora faz duas referencias a do objeto e a do arrays/index.

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
