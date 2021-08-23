package javacore.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> stringList = List.of("Luffy", "Zoro", "Nami", "Usoop", "Sanji");
        List<Integer> integerList = List.of(1, 2, 4, 5, 6, 7, 8, 9, 10);
        forEach(stringList, names -> System.out.println(names));
        forEach(integerList, numbers -> System.out.println(numbers));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
