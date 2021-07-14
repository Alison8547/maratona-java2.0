package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Estudante;
import javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Goku";
        estudante1.idade = 25;
        estudante1.sexo = 'M';

        estudante2.nome = "Naruto";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

        impressora.imprime(estudante1);
        System.out.println();
        impressora.imprime(estudante2);


    }
}
