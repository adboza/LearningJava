package Programming.devdojo.javacore.Gassociation.test;

import Programming.devdojo.javacore.Gassociation.domain.Player;
import Programming.devdojo.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("Pelé");
        Player player2 = new Player("Cafú");
        Team team = new Team ("Brazil");
        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("---Player---");
        player.print();
        System.out.println("---Team---");
        team.print();
    }
}
