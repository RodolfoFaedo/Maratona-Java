package cf.rodolfo.JavaCore.G_Association.test;

import cf.rodolfo.JavaCore.G_Association.domain.Player;
import cf.rodolfo.JavaCore.G_Association.domain.Team;

public class PlayerTest02 {
	public static void main(String[] args) {
		Player player01 = new Player("Messi");
		Team team = new Team("Barcelona");
		player01.setTeam(team);
		player01.printInfo();
	}
}
