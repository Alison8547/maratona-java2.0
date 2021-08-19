package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Naruto", 19.90));
        mangas.add(new Manga(1L, "One piece", 9.90));
        mangas.add(new Manga(4L, "Pokemon", 5.50));
        mangas.add(new Manga(3L, "Naruto", 25.50));
        mangas.add(new Manga(2L, "Death note", 15.50));

        // Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(2L, "Death note", 15.50);

        System.out.println(Collections.binarySearch(mangas, mangaSearch, mangaByIdComparator)); // passando uma list, uma key e um comparator por id

    }
}
