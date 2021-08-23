package javacore.classesinternas.test;

public class OuterClassesTest01 {
    private String name = "Naruto";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); // this da class interna
            System.out.println(OuterClassesTest01.this); // this da class externa

        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
        // Dois modos de fazer
        Inner inner = outerClasses.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
