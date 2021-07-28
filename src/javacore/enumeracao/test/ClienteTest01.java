package javacore.enumeracao.test;

import javacore.enumeracao.dominio.Cliente;
import javacore.enumeracao.dominio.TipoCliente;
import javacore.enumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alison", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calculaPagamento(100));
        System.out.println(TipoPagamento.DEBITO.calculaPagamento(100));

    }
}
