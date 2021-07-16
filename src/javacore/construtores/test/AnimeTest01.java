package javacore.construtores.test;
import javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 220, "Shounen");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();

    }
}
