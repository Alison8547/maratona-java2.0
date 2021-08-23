package javacore.lambdas.test;

import javacore.lambdas.dominio.Anime;
import javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 987), new Anime("HunterxHunter", 112), new Anime("Naruto", 220), new Anime("Death note", 50)));
        //   animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //   animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisode);
        System.out.println(animeList);
    }
}
