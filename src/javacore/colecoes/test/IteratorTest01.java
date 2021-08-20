package javacore.colecoes.test;

import javacore.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>(); // LinkedList bom pra remove
        mangas.add(new Manga(5L, "Naruto", 19.90, 0));
        mangas.add(new Manga(1L, "One piece", 9.90, 5));
        mangas.add(new Manga(4L, "Pokemon", 5.50, 0));
        mangas.add(new Manga(3L, "Naruto", 25.50, 2));
        mangas.add(new Manga(2L, "Death note", 15.50, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0); // A diferença usando programação funcional só precisou de uma linha. manga referencia -> é a lógica

        System.out.println(mangas);

    }
}
