package javacore.abstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {  // Como já tô fazendo aq as outras classes não vai ter q implementar esse método
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus();
}
