package javacore.colecoes.test;


import javacore.colecoes.dominio.Manga;
import javacore.colecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarca implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getValor(), o2.getValor());
    }
}

public class NavigableTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartphoneMarca());
        SmartPhone smartPhone = new SmartPhone("1234", "Nokia");
        set.add(smartPhone);
        System.out.println(smartPhone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());  // TreeSeT é baseado na ordem que você colocou no comparator e não coloca valores duplicados

        mangas.add(new Manga(5L, "Naruto", 19.90, 0));
        mangas.add(new Manga(1L, "One piece", 9.90, 5));
        mangas.add(new Manga(4L, "Pokemon", 5.50, 0));
        mangas.add(new Manga(3L, "Naruto", 25.50, 2));
        mangas.add(new Manga(2L, "Death note", 15.50, 0));
        mangas.add(new Manga(7L, "Akira", 15.50, 0));
        mangas.add(new Manga(7L, "Akira", 15.50, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga hxh = new Manga(12L, "HunterxHunter", 19.90, 2);
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("--------------------");
        System.out.println(mangas.lower(hxh));
        System.out.println(mangas.floor(hxh));
        System.out.println(mangas.higher(hxh));
        System.out.println(mangas.ceiling(hxh));

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());


    }
}
