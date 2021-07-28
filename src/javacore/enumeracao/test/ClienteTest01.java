package javacore.enumeracao.test;

import javacore.enumeracao.dominio.Cliente;
import javacore.enumeracao.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alison", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Diego", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Juliana", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
