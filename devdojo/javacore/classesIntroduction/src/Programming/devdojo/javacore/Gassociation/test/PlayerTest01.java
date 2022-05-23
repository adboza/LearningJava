package Programming.devdojo.javacore.Gassociation.test;

import Programming.devdojo.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("Tod");
        Player p2 = new Player("Mario");
        Player p3 = new Player("Louise");

        Player [] players = new Player[]{p1, p2, p3};

        for (Player player : players) {
            player.print();
        }

    }
}
