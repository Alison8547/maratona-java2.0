package javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void EuPagamento() {
        System.out.println("Nome: " + this.nome);  // Agora posso acessar o nome diretamente como se fosse os atributos originais dessa classe.
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
