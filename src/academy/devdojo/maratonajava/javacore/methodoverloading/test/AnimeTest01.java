package academy.devdojo.maratonajava.javacore.methodoverloading.test;

import academy.devdojo.maratonajava.javacore.methodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Action");
        anime.printer();
    }
}
