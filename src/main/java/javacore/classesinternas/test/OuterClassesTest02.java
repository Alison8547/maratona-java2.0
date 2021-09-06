package javacore.classesinternas.test;

public class OuterClassesTest02 {
    private String name = "Alison";

    void print(final String param) {  // class locais aquelas que são criadas dentro de um método ou construtor
        final String lastName = "Silva";  // tem q ser final parametro também
        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClasses = new OuterClassesTest02();
        outerClasses.print("");
    }
}
