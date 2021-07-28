package javacore.enumeracao.dominio;

public enum TipoPagamento {
    CREDITO {
        @Override
        public double calculaPagamento(double valor) {
            return valor * 0.1;
        }
    }, DEBITO {
        @Override
        public double calculaPagamento(double valor) {
            return valor * 0.05;
        }
    };


    public abstract double calculaPagamento(double valor);


}
