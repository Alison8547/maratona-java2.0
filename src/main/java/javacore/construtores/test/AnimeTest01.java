package javacore.construtores.test;

import javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 220, "Shounen", "Pierrot");
        anime.imprime();

    }
}
