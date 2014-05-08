package baseball;

public class Game {
	public static void NewGame(Player player1, Player player2){
		int inning = 1;
		int player1Score = 0;
		int player2Score = 0;
		
		while (inning < 10 || player1Score == player2Score){
			player1Score += Inning.NewInning(player1);
			player2Score += Inning.NewInning(player2);
			System.out.println("End of Inning " + inning);
			System.out.println(player1.name + ": " + player1Score);
			System.out.println(player2.name + ": " + player2Score);
			System.out.println();
			inning++;
		}
		
		if (player1Score > player2Score){
			System.out.println(player1.name + " Wins!");
		}
		else System.out.println(player2.name + " Wins!");
		
	}

}
