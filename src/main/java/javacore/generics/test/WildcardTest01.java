package javacore.generics.test;

abstract class Animal {
    abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(),new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
        Animal[] animals = {new Cachorro(),new Gato()};
        printConsulta(animals);



    }

    public static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
     //   animals[1] = new Gato(); Error

    }
}

