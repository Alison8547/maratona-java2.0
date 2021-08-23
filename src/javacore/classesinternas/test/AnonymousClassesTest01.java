package javacore.classesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking...");
    }
}

public class AnonymousClassesTest01 {

    public static void main(String[] args) {
        Animal animal = new Animal(){ // uma AnonymousClass que só vai ser usada nesse determinado lugar
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
