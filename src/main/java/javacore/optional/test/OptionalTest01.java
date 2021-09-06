package javacore.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("DevDojo é foda.");
        Optional<String> op2 = Optional.ofNullable(null);
        Optional<String> op3 = Optional.empty();
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println("----------");
        Optional<String> optional = findName("William");
        String empty = optional.orElse("EMPTY");
        System.out.println(empty);
        optional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if (i != 1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
