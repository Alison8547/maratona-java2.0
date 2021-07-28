package javacore.abstratas.test;

import javacore.abstratas.dominio.Desenvolvedor;
import javacore.abstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Sandryelly", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alison", 6000);
        System.out.println(desenvolvedor);
    }
}
