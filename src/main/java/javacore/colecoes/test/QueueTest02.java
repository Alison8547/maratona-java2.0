package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Naruto", 19.90, 0));
        mangas.add(new Manga(1L, "One piece", 9.90, 5));
        mangas.add(new Manga(4L, "Pokemon", 5.50, 0));
        mangas.add(new Manga(3L, "Naruto", 25.50, 2));
        mangas.add(new Manga(2L, "Death note", 15.50, 0));
        mangas.add(new Manga(7L, "Akira", 15.50, 0));
        mangas.add(new Manga(7L, "Akira", 15.50, 0));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }


    }
}
