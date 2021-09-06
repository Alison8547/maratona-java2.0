package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        // Set não permite valores duplicados HashSet não mantém ordem de inserção
        // LinkedHashSet vai manter a ordem de inserção que você colocou
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Naruto", 19.90, 0));
        mangas.add(new Manga(1L, "One piece", 9.90, 5));
        mangas.add(new Manga(4L, "Pokemon", 5.50, 0));
        mangas.add(new Manga(3L, "Naruto", 25.50, 2));
        mangas.add(new Manga(2L, "Death note", 15.50, 0));
        mangas.add(new Manga(2L, "Death note", 15.50, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
