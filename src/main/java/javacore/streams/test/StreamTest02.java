package javacore.streams.test;

import javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        List<String> list = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle)) // ordernar ela pelo title
                .filter(ln -> ln.getPrice() <= 4)  // filtrar os que tem preços menor que 4
                .limit(3)  // limita a 3
                .map(LightNovel::getTitle) // map = pegar os titles
                .collect(Collectors.toList());  // Operação final agrupar e colocar no espaço  tolist retornar uma lista

        System.out.println(list);
    }
}
