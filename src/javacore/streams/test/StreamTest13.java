package javacore.streams.test;

import javacore.streams.dominio.Category;
import javacore.streams.dominio.LightNovel;
import javacore.streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static javacore.streams.dominio.Promotion.*;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        final Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE));
        System.out.println(collect);

        // Map<Category, Map<Promotion, List<LightNovel>>>

        final Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE))); // Agrupando primeiro o category e depois as promotions
        System.out.println(collect1);
    }
}
