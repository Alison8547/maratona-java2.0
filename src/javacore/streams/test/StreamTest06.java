package javacore.streams.test;

import javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(l -> l.getPrice() > 9)); // anyMatch. Algum é maior que 9 ?
        System.out.println(lightNovels.stream().allMatch(l -> l.getPrice() > 0)); // allMatch. Todos são maiores que 0 ?
        System.out.println(lightNovels.stream().noneMatch(l -> l.getPrice() < 0)); // nenhum elemento é menor que 0 nessa lista ?

        lightNovels.stream()
                .filter(l -> l.getPrice() > 3)
                .findAny() // findAny retorna um optional. Então o resultado não é garantido pode ser qualquer um da lista > 3
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(l -> l.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice)) // Ordem por preço
                .findFirst() // findFirst. Retorna o primeiro elemento > 3 na lista
                .ifPresent(System.out::println);


        lightNovels.stream()
                .filter(l -> l.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
