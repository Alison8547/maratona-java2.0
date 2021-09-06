package javacore.polimorfismo.test;

import javacore.polimorfismo.repositorio.Repositorio;
import javacore.polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados(); // No caso é só preciso trocar o objeto e não a refêrencia
        repositorio.salvar();
    }
}
