package javacore.lambdas.dominio;

public class Anime {
    private String title;
    private int episodes;

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }

    public Anime(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }
}
