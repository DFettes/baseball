package baseball;

public class Game {
	public static void NewGame(Team team1, Team team2){
		int inning = 1;
		int team1Score = 0;
		int team2Score = 0;
		int batterUp1 = 0;
		int batterUp2 = 0;
		
		while (inning < 10 || team1Score == team2Score){
			int[] inningArray1 = Inning.NewInning(team1, batterUp1);
			int score1Inc = inningArray1[0];
			team1Score += score1Inc;
			batterUp1 = inningArray1[1];
			
			int[] inningArray2 = Inning.NewInning(team2, batterUp2);			
			int score2Inc = inningArray2[0];			
			team2Score += score2Inc;			
			batterUp2 = inningArray2[1];
			
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
