package javacore.colecoes.test;

import javacore.colecoes.dominio.Consumidor;
import javacore.colecoes.dominio.Manga;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Willan");
        Consumidor consumidor2 = new Consumidor("Dev dojo");

        Manga manga1 = new Manga(5L, "Naruto", 19.90, 0);
        Manga manga2 = new Manga(1L, "One piece", 9.90, 5);
        Manga manga3 = new Manga(4L, "Pokemon", 5.50, 0);
        Manga manga4 = new Manga(3L, "Naruto", 25.50, 2);
        Manga manga5 = new Manga(2L, "Death note", 15.50, 0);

        List<Manga> consumidorListManga1 = List.of(manga1, manga2, manga3); // adicionando os mangás que quero
        List<Manga> consumidorListManga2 = List.of(manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>(); // passando uma list<Manga> no map
        consumidorManga.put(consumidor1, consumidorListManga1); // passando o consumidor e a lista de mangá dele
        consumidorManga.put(consumidor2, consumidorListManga2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.println("---" + entry.getKey().getNome());  // key do consumidor

            for (Manga manga : entry.getValue()) {  // pegando o mesmo entry e passando aq pra pegar o value: list de mangás
                System.out.println("-------" + manga.getNome());
            }
        }
    }
}
