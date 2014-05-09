package baseball;

public class Inning {
	
	public static int[] NewInning(Team t, int BatterUp){
		int outs = 0; 
		int[] runsBatter = {0, BatterUp};
		boolean run1b = false;
		boolean run2b = false;
		boolean run3b = false;
		//Team inningTeam = t;
		
		
		
		while (outs < 3){
			/*System.out.println("Outs: " + outs);
			System.out.println("Runs: " + runs);
			System.out.println("First Base: " + run1b);
			System.out.println("Second Base: " + run2b);
			System.out.println("Third Base: " + run3b);
			*/
			
			Player p1 = t.battingOrder[BatterUp];
			String result = AtBat.NewAtBat(p1);
			System.out.println("BATTER: " + p1.name + " - RESULT: " + result);
			//System.out.println();
			
			if (result == "Out" || result == "Strikeout"){
				outs++;
			}
			else if (result == "Single"){		
				if (run3b){
					run3b = false;
					runsBatter[0]++;
				}
				if (run2b){
					run2b = false;
					run3b = true;
				}
				if (run1b){
					run1b = false;
					run2b = true;
				}
				run1b = true;
			}
			
			else if (result == "Double"){		
				if (run3b){
					run3b = false;
					runsBatter[0]++;
				}
				if (run2b){
					run2b = false;
					runsBatter[0]++;
				}
				if (run1b){
					run1b = false;
					run3b = true;
				}
				run2b = true;
			}
			
			else if (result == "Triple"){		
				if (run3b){
					run3b = false;
					runsBatter[0]++;
				}
				if (run2b){
					run2b = false;
					runsBatter[0]++;
				}
				if (run1b){
					run1b = false;
					runsBatter[0]++;
				}
				run3b = true;
			}
			
			else if (result == "HOME RUN!"){		
				if (run3b){
					run3b = false;
					runsBatter[0]++;
				}
				if (run2b){
					run2b = false;
					runsBatter[0]++;
				}
				if (run1b){
					run1b = false;
					runsBatter[0]++;
				}
				runsBatter[0]++;
			}
			
			else if (result == "Walk" || result == "Hit By Pitch"){		
				if (run1b && run2b && run3b){
					runsBatter[0]++;
				}
				else if (run1b && run2b || run1b && run3b || run2b && run3b){
					run1b = run2b = run3b = true;
				}
				else if (run3b || run2b){
					run1b = true;
				}
				else if (run1b){
					run2b = true;
				}
				else run1b = true;
			}
			
			runsBatter[1]++;
		}
		System.out.println();
		//System.out.println("3 Outs, inning over");
		runsBatter[1] = runsBatter[1] % 9;
		return runsBatter;
	}
	

}
