package cf.rodolfo.JavaCore.G_Association.test;

import cf.rodolfo.JavaCore.G_Association.domain.Player;
import cf.rodolfo.JavaCore.G_Association.domain.Team;

public class PlayerTest03 {
	public static void main(String[] args) {
		Player player01 = new Player("Messi");
		Team team = new Team("Argentina");
		Player[] players = {player01};
		
		player01.setTeam(team);
		team.setPlayers(players);
		
		player01.printInfo();
		team.printInfo();
	}

}