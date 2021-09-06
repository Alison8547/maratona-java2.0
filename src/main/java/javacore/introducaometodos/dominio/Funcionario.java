package javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        if (salarios == null) {
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        mediaSalario();
    }

    public void mediaSalario() {
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);

    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
