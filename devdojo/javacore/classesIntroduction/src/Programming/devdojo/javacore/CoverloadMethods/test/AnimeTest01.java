package Programming.devdojo.javacore.CoverloadMethods.test;

import Programming.devdojo.javacore.CoverloadMethods.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setName("Dragonball");
//        anime.setType("TV");
//        anime.setEpisodes(12);
        //anime.init ("Dragonball","TV", 12);
        //anime.setGender("Action");// this is outside! there is a smarter way, create new method

        anime.init ("Dragonball","TV", 12, "action");
        anime.inPrint();

    }
}
