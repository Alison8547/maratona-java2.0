package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Naruto", 19.90));
        mangas.add(new Manga(1L, "One piece", 9.90));
        mangas.add(new Manga(4L, "Pokemon", 5.50));
        mangas.add(new Manga(3L, "Naruto", 25.50));
        mangas.add(new Manga(2L, "Death note", 15.50));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-------------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-------------------");
      //  Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator()); // ? É um.. passando com comparator para ser organizado pelo id
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
