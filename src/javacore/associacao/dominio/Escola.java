package javacore.associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professors;

    public void imprime() {
        System.out.println(this.nome);
        if (professors == null) return;
        for (Professor professores : professors) {
            System.out.println(professores.getNome());
        }
    }

    public Escola(String nome, Professor[] professors) {
        this.nome = nome;
        this.professors = professors;
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
