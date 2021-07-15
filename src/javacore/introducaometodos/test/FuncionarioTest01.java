package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Tiago";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{1200, 900, 845.45};
        funcionario.imprime();
    }
}
