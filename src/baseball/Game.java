package baseball;

public class Game {
	public static void Game(Player player1, Player player2){
		int inning = 1;
		int player1Score = 0;
		int player2Score = 0;
		
		while (inning < 10 || player1Score == player2Score){
			player1Score += Inning.Inning(player1);
			player2Score += Inning.Inning(player2);
			System.out.println("End of Inning " + inning);
			System.out.println("Player 1: " + player1Score);
			System.out.println("Player 2: " + player2Score);
			System.out.println();
			inning++;
		}
		
		if (player1Score > player2Score){
			System.out.println("Player 1 Wins!");
		}
		else System.out.println("Player 2 Wins!");
		
	}

}
