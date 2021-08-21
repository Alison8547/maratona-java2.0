package javacore.generics.test;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printColsultaAnimal(animals);

    }

    // Type erasure
    public static void printConsulta(List<? extends Animal> animals) { // Aqui tô falando que posso passar animal ou qualquer um que seja filho
        for (Animal animal : animals) {
            animal.consulta();
        }

    }

    public static void printColsultaAnimal(List<? super Animal> animals) { // Aqui qualquer um que seja pai
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}

