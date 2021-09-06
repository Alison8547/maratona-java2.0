package javacore.serializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {

    private static final long serialVersionUID = 992885558227866958L;

    private Long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "José Glícerio";
    private transient Turma turma;


    @Override
    public String toString() {
        return "Aluno{" +
                "id: " + id +
                ", nome: '" + nome + '\'' +
                ", password: '" + password + '\'' +
                ", NOME_ESCOLA: '" + NOME_ESCOLA + '\'' +
                ", turma: '" + turma + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream oss) {
        try {
            oss.defaultWriteObject();
            oss.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Aluno(Long id, String nome, String password) {
        System.out.println("Dentro do construtor"); // ele não é executado no momento da serialização
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
