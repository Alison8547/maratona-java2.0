package javacore.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Alison");
        sb.append(" Silva").append(" Santos"); // StringBuilder não é preciso ficar sempre alocando na mémoria feito a String normal.
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);

    }
}
