package Programming.devdojo.javacore.Einitializationblock.test;
import Programming.devdojo.javacore.Einitializationblock.domain.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");

        }

    }

}
