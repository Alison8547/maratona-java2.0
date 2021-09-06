package javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = entrada.next().toUpperCase().charAt(0);
        System.out.println("--------------------");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Sexo: " + sexo);

    }
}
