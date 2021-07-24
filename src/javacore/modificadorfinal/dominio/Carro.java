package javacore.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_MAXIMA = 250; // final nunca pode ser mudado.
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
