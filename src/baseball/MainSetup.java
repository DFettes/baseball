package baseball;

public class MainSetup {

	public static void main(String[] args) {
		Player[] playerArray = CreatePlayer.CreatePlayers();
		Player p1 = playerArray[0];
		Player p2 = playerArray[1];
		Player p3 = playerArray[2];
		
		Player p10 = playerArray[3];
		Player p11 = playerArray[4];
		Player p12 = playerArray[5];
		Player p13 = playerArray[6];
		Player p14 = playerArray[7];
		Player p15 = playerArray[8];
		Player p16 = playerArray[9];
		Player p17 = playerArray[10];
		Player p18 = playerArray[11];
		
		Team t1 = CreateTeam.NewTeam("Blue Jays", p10,p12,p11,p13,p16,p18,p14,p15,p17);
		Team t2 = CreateTeam.NewTeam("Legends", p1,p2,p3,p1,p2,p3,p1,p2,p3);
		Game.NewGame(t1, t2);

	}

}
