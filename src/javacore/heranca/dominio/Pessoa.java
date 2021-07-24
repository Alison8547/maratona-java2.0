package javacore.heranca.dominio;

public class Pessoa {
    protected String nome;  // protected: É protegido fica publico para classes filhas e mesmo pacote.
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco inicializador static pessoa");
    }

    {
        System.out.println("Dentro do bloco inicializador pessoa 1");
    }

    {
        System.out.println("Dentro do bloco inicializador pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do bloco construtor pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("Rua: " + endereco.getRua() + " Cep: " + endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
