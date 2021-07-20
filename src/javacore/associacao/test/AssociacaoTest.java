package javacore.associacao.test;

import javacore.associacao.dominio.Aluno;
import javacore.associacao.dominio.Local;
import javacore.associacao.dominio.Professor;
import javacore.associacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua da liberdade");
        Aluno aluno1 = new Aluno("André", 16);
        Aluno aluno2 = new Aluno("Junior", 17);
        Aluno[] alunos = {aluno1, aluno2};
        Seminario seminario1 = new Seminario("Achar espécies de animais", alunos, local);
        Seminario[] seminarios = {seminario1};
        Professor professor = new Professor("Ivyson", "Ciências");
        professor.setSeminarios(seminarios);
        professor.imprime();


    }
}
