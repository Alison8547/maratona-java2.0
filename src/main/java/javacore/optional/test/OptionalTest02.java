package javacore.optional.test;

import javacore.optional.dominio.Manga;
import javacore.optional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2")); // se tiver presente eu vou renomear
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);  // lançando uma excessão se não tiver o id
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Shingeki no Kyojin")
                .orElseGet(() -> new Manga(3, "Shingeki no Kyojin", 114)); // criando um novo manga se aquele não tiver
        System.out.println(newManga);
    }
}
