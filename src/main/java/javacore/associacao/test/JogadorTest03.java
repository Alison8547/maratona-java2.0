package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Coutinho");
        Jogador[] jogadores = {jogador1, jogador2};
        Time time = new Time("Barcelona");
        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();
        System.out.println("--- Time ---");
        time.imprime();

    }
}
