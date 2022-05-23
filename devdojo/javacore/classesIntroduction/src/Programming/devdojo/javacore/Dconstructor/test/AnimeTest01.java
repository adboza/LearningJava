package Programming.devdojo.javacore.Dconstructor.test;


import Programming.devdojo.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init ("Dragonball","TV", 12, "action");
        anime.inPrint();

    }
}
