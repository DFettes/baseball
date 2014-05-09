package baseball;

public class Game {
	public static void NewGame(Team team1, Team team2){
		int inning = 1;
		int team1Score = 0;
		int team2Score = 0;
		int batterUp1 = 0;
		int batterUp2 = 0;
		
		while (inning < 10 || team1Score == team2Score){
			int score1Inc = Inning.NewInning(team1, batterUp1)[0];
			int score2Inc = Inning.NewInning(team2, batterUp2)[0];
			team1Score += score1Inc;
			team2Score += score2Inc;
			
			System.out.println("End of Inning " + inning);
			System.out.println(team1.name + ": " + team1Score);
			System.out.println(team2.name + ": " + team2Score);
			System.out.println();
			inning++;
		}
		
		if (team1Score > team2Score){
			System.out.println(team1.name + " Win!");
		}
		else System.out.println(team2.name + " Win!");
		
	}

}
