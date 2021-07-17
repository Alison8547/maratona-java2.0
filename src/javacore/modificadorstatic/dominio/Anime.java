package javacore.modificadorstatic.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização static 1"); // bloco de inicializão static só é executado uma vez
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização static 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização static 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não static 4");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
