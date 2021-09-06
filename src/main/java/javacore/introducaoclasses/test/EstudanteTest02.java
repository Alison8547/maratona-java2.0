package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "José";

        System.out.println(estudante.nome);
        System.out.println(estudante2.nome);

    }
}
