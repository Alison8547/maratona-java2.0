package javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        // Strings são imutáveis
        String nome1 = "Alison";  // String constant pool
        String nome2 = "Alison";
        nome1 = nome1.concat(" Silva");
        System.out.println(nome1);
        System.out.println(nome1 == nome2);

        String nome3 = new String("Alison"); // Ninguém usa assim.
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // pega o valor por isso dar true
    }
}
