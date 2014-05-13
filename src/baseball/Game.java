package baseball;

public class Game {
	public static void PrintBoxScore(Team t1, Team t2){
		System.out.println();
		System.out.println(t1.name);
		System.out.println("Player-------------PA---AB---R---H---RBI---1B---2B---3B---HR---SB---CS---BB---SO---HBP");
		for (int i=0; i<9; i++){
			t1.battingOrder[i].gameH = t1.battingOrder[i].gamesingles + t1.battingOrder[i].gamedoubles + t1.battingOrder[i].gametriples + t1.battingOrder[i].gameHR;
			System.out.format("%-20s%-5d%-4d%-4d%-5d%-6d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d", t1.battingOrder[i].name, (int)t1.battingOrder[i].gamePA, (int)t1.battingOrder[i].gameAB, (int)t1.battingOrder[i].gameR, (int)t1.battingOrder[i].gameH, (int)t1.battingOrder[i].gameRBI, (int)t1.battingOrder[i].gamesingles, (int)t1.battingOrder[i].gamedoubles, (int)t1.battingOrder[i].gametriples, (int)t1.battingOrder[i].gameHR, (int)t1.battingOrder[i].gameSB, (int)t1.battingOrder[i].gameCS, (int)t1.battingOrder[i].gameBB, (int)t1.battingOrder[i].gameSO, (int)t1.battingOrder[i].gameHBP);
			System.out.println();
		}
		
		System.out.println();
		System.out.println(t2.name);
		System.out.println("Player-------------PA---AB---R---H---RBI---1B---2B---3B---HR---SB---CS---BB---SO---HBP");
		for (int i=0; i<9; i++){
			t2.battingOrder[i].gameH = t2.battingOrder[i].gamesingles + t2.battingOrder[i].gamedoubles + t2.battingOrder[i].gametriples + t2.battingOrder[i].gameHR;
			System.out.format("%-20s%-5d%-4d%-4d%-5d%-6d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d", t2.battingOrder[i].name, (int)t2.battingOrder[i].gamePA, (int)t2.battingOrder[i].gameAB, (int)t2.battingOrder[i].gameR, (int)t2.battingOrder[i].gameH, (int)t2.battingOrder[i].gameRBI, (int)t2.battingOrder[i].gamesingles, (int)t2.battingOrder[i].gamedoubles, (int)t2.battingOrder[i].gametriples, (int)t2.battingOrder[i].gameHR, (int)t2.battingOrder[i].gameSB, (int)t2.battingOrder[i].gameCS, (int)t2.battingOrder[i].gameBB, (int)t2.battingOrder[i].gameSO, (int)t2.battingOrder[i].gameHBP);
			System.out.println();
		}
		System.out.println();
	}
	
	public static void NewGame(Team team1, Team team2){
		int inning = 1;
		int team1Score = 0;
		int team2Score = 0;
		int batterUp1 = 0;
		int batterUp2 = 0;
		
		while (inning < 10 || team1Score == team2Score){
			System.out.println("TOP OF INNING " + inning);
			int[] inningArray1 = Inning.NewInning(team1, batterUp1);
			int score1Inc = inningArray1[0];
			team1Score += score1Inc;
			batterUp1 = inningArray1[1];
			
			if (inning > 8 && team1Score >= team2Score){
				System.out.println("BOTTOM OF INNING " + inning);
				int[] inningArray2 = Inning.NewInning(team2, batterUp2);			
				int score2Inc = inningArray2[0];			
				team2Score += score2Inc;			
				batterUp2 = inningArray2[1];
			}
			else if (inning > 8 && team1Score < team2Score){
				
			}
			else{
				System.out.println("BOTTOM OF INNING " + inning);
				int[] inningArray2 = Inning.NewInning(team2, batterUp2);			
				int score2Inc = inningArray2[0];			
				team2Score += score2Inc;			
				batterUp2 = inningArray2[1];
			}
			System.out.println("END OF INNING " + inning);
			System.out.println(team1.name + ": " + team1Score);
			System.out.println(team2.name + ": " + team2Score);
			System.out.println();
			inning++;
		}
		
		if (team1Score > team2Score){
			System.out.println(team1.name + " Win!");
			team1.W++;
			team2.L++;
		}
		else {
			System.out.println(team2.name + " Win!");
			team2.W++;
			team1.L++;
		}
		team1.G++;
		team2.G++;
		team1.RunsF+=team1Score;
		team1.RunsA+=team2Score;
		team2.RunsF+=team2Score;
		team2.RunsA+=team1Score;
		
		System.out.println();
		//PrintBoxScore(team1, team2);
	}

}
