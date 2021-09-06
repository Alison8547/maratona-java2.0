package javacore.associacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private Aluno[] alunos;

    public void imprime() {
        if (this.seminarios == null) return;
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("--- Seminarios ---");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println("Endereço: " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("---Alunos---");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade());

            }
        }


    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
