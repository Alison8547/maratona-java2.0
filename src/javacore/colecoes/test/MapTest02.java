package javacore.colecoes.test;

import javacore.colecoes.dominio.Consumidor;
import javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Willan");
        Consumidor consumidor2 = new Consumidor("Dev dojo");

        Manga manga1 = new Manga(5L, "Naruto", 19.90, 0);
        Manga manga2 = new Manga(1L, "One piece", 9.90, 5);
        Manga manga3 = new Manga(4L, "Pokemon", 5.50, 0);
        Manga manga4 = new Manga(3L, "Naruto", 25.50, 2);
        Manga manga5 = new Manga(2L, "Death note", 15.50, 0);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);  // consumidor 1 "comprando" o mangá Naruto. basicamente isso a lógica aq
        consumidorManga.put(consumidor2, manga2);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome()); // pegando só o nome mesmo getNome
        }


    }
}
