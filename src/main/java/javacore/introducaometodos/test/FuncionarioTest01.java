package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Tiago");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1200, 900, 845.45});
        funcionario.imprime();
        System.out.println("Média: "+funcionario.getMedia());
    }
}
