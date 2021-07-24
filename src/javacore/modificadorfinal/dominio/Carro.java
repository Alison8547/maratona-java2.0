package javacore.modificadorfinal.dominio;

public final class Carro { // final na class ela não pode ser extends
    private String nome;
    public static final double VELOCIDADE_MAXIMA = 250; // final nunca pode ser mudado.
    public final Comprador COMPRADOR = new Comprador();

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }
    public final void imprime(){  // Mesma coisa no método se colocar final ela não pode ser sobrescrita/alterado
        System.out.println(this.nome);
    }

    //    static { Podia iniciar aq pq é static e inicializa direto
//        VELOCIDADE_MAXIMA = 250;
//    }
//    public Carro(){ Aqui também
//        VELOCIDADE_MAXIMA = 250;
//    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
