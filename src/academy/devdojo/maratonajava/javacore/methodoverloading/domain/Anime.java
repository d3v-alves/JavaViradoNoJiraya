package academy.devdojo.maratonajava.javacore.methodoverloading.domain;

public class Anime {
    private String nome;
    private String type;
    private int episodes;
    private String genre;

    public void init(String nome, String type, int episodes) {
        this.nome = nome;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String nome, String type, int episodes, String genre) {
        this.init(nome, type, episodes);
        this.genre = genre;

    }

    public void printer() {
        System.out.println(this.nome);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }
}