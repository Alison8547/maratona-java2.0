package javacore.classesinternas.test;

public class OuterClassesTest03 {
    private String name = "Alison";

    static class Nested {
        private String lastName = "Silva";

        public void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
