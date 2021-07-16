package javacore.sobrecargametodos.test;

import javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 220, "Shounen");
        anime.imprime();
    }
}
