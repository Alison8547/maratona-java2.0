package javacore.lambdas.test;

import javacore.lambdas.dominio.Anime;
import javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 987), new Anime("HunterxHunter", 112), new Anime("Naruto", 220), new Anime("Death note", 50)));
        animeList.sort(animeComparators::compareByEpisodeNonStatic);
        // animeList.sort((a1,a2) -> animeComparators.compareByEpisodeNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
