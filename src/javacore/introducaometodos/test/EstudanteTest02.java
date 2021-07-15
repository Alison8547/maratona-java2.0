package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Goku";
        estudante1.idade = 25;
        estudante1.sexo = 'M';

        estudante2.nome = "Naruto";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

        estudante1.imprime();
        System.out.println();
        estudante2.imprime();


    }
}
