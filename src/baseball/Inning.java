package baseball;

public class Inning {
	
	public static int[] NewInning(Team t, int BatterUp){
		String[] results = {"Single", "Double", "Triple", "HOME RUN!", "Walk", "Hit By Pitch", "Strikeout", "Out", "Ground Out", "Fly Out"};
		int outs = 0; 
		int[] runsBatter = {0, BatterUp};
		boolean run1b = false;
		boolean run2b = false;
		boolean run3b = false;
		//Team inningTeam = t;
		
		
		System.out.println("Current Team at Bat: " + t.name);
		while (outs < 3){
			/*System.out.println("Outs: " + outs);
			System.out.println("Runs: " + runs);
			System.out.println("First Base: " + run1b);
			System.out.println("Second Base: " + run2b);
			System.out.println("Third Base: " + run3b);
			*/
			
			Player p1 = t.battingOrder[BatterUp];
			int resultCode = AtBat.NewAtBat(p1);
			String result = ("BATTER: " + p1.name + " RESULT: " + results[resultCode-1]);
			//System.out.println();
			
			if (resultCode > 6){
				if (resultCode == 10 && run3b && outs < 2){
					double randomSacFly = Math.random();
					run3b = false;
					if (randomSacFly < 0.7){
						runsBatter[0]++;
						result = (result + " - Sacrifice Fly (SAFE)");
					}
					else {outs++;
					result = (result + " - Sacrifice Fly (Runner Out At Home)");
					}
				}
				outs++;
			}
			else if (resultCode == 1){		
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
			
			else if (resultCode == 2){		
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
			
			else if (resultCode == 3){		
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
			
			else if (resultCode == 4){		
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
			
			else if (resultCode == 5 || resultCode == 6){		
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
			
			
			BatterUp++;
			if (BatterUp == 9){
				BatterUp = 0;
			}
			
			System.out.println(result);
		}
		System.out.println();
		//System.out.println("3 Outs, inning over");
		runsBatter[1] = BatterUp ;
		return runsBatter;
	}
	

}
