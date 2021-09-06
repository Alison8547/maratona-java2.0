package javacore.heranca.test;

import javacore.heranca.dominio.Endereco;
import javacore.heranca.dominio.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Alison");
        Endereco endereco = new Endereco();
        endereco.setRua("Rua da liberdade");
        endereco.setCep("111111-111");
        funcionario.setCpf("705.789.151.45");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000.0);
        funcionario.imprime();
    }
}
