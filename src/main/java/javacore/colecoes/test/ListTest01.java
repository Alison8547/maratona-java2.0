package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Alison");
        nomes.add("Maria");
        nomes2.add("Tiago");
        nomes2.add("Diego");

        nomes.remove("Maria");

        nomes.addAll(nomes2);

        for (String list : nomes) {
            System.out.println(list);
        }
        System.out.println("------------");
        nomes.add("Vinicius");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
