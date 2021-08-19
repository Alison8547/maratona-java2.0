package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Naruto");
        mangas.add("Boku no hero");
        mangas.add("Akira");
        mangas.add("Kimetsu");

        Collections.sort(mangas);

        List<Double> money = new ArrayList<>();
        money.add(100.45);
        money.add(25D);
        money.add(211.47);
        money.add(10D);

        Collections.sort(money);
        System.out.println(money);

        for (String list : mangas) {
            System.out.println(list);
        }
    }
}
