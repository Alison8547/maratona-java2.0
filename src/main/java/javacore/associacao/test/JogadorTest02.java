package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Time time = new Time("Barcelona");
        jogador.setTime(time);
        jogador.imprime();
    }
}
