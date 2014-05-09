package baseball;

public class Inning {
	
	public static int[] NewInning(Team t, int BatterUp){
		String[] results = {"Single", "Double", "Triple", "HOME RUN!", "Walk", "Hit By Pitch", "Strikeout", "Out", "Ground Out", "Fly Out"};
		int outs = 0; 
		int[] runsBatter = {0, BatterUp};
		Player run1b = null;
		Player run2b = null;
		Player run3b = null;
		Player[] runnersOnBase = {null, null, null};
		//Team inningTeam = t;
		
		
		System.out.println("Current Team at Bat: " + t.name);
		while (outs < 3){
			//runnersOnBase = RunnersOnBase.checkRunners(runnersOnBase);
			
			System.out.println("Outs: " + outs);
			System.out.println("Runs: " + runsBatter[0]);
			if (run1b !=null){
			System.out.println("First Base: " + run1b.name);}
			if (run2b !=null){
			System.out.println("Second Base: " + run2b.name);}
			if (run3b !=null){
			System.out.println("Third Base: " + run3b.name);}
			
			
			Player p1 = t.battingOrder[BatterUp];
			int resultCode = AtBat.NewAtBat(p1);
			String result = ("BATTER: " + p1.name + " RESULT: " + results[resultCode-1]);
			//System.out.println();
			
			if (resultCode > 6){
				if (resultCode == 10 && run3b!=null && outs < 2){
					double randomSacFly = Math.random();
					run3b = null;
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
				if (run3b!=null){
					run3b = null;
					runsBatter[0]++;
				}
				if (run2b!=null){
					run3b = run2b;
					run2b = null;
				}
				if (run1b!=null){
					run2b = run1b;
					run1b = null;
				}
				run1b = p1;
			}
			
			else if (resultCode == 2){		
				if (run3b!=null){
					run3b = null;
					runsBatter[0]++;
				}
				if (run2b!=null){
					run2b = null;
					runsBatter[0]++;
				}
				if (run1b!=null){
					run3b = run1b;
					run1b = null;
				}
				run2b = p1;
			}
			
			else if (resultCode == 3){		
				if (run3b!=null){
					run3b = null;
					runsBatter[0]++;
				}
				if (run2b!=null){
					run2b = null;
					runsBatter[0]++;
				}
				if (run1b!=null){
					run1b = null;
					runsBatter[0]++;
				}
				run3b = p1;
			}
			
			else if (resultCode == 4){		
				if (run3b!=null){
					run3b = null;
					runsBatter[0]++;
				}
				if (run2b!=null){
					run2b = null;
					runsBatter[0]++;
				}
				if (run1b!=null){
					run1b = null;
					runsBatter[0]++;
				}
				runsBatter[0]++;
			}
			
			else if (resultCode == 5 || resultCode == 6){		
				if (run1b!=null && run2b!=null && run3b!=null){
					run3b = run2b;
					run2b = run1b;
					run1b = p1;
					runsBatter[0]++;
				}				
				else if (run1b!=null && run2b!=null) {
					run3b = run2b;
					run2b = run1b;
					run1b = p1;
				}
				else if (run2b!=null && run3b!=null){
					run1b = p1;
				}
				else if (run1b!=null && run3b!=null) {
					run2b = run1b;
					run1b = p1;
				}
				else if (run1b!=null){
					run2b = run1b;
					run1b = p1;
				}
				else run1b = p1;
			}
			
			
			BatterUp++;
			if (BatterUp == 9){
				BatterUp = 0;
			}
			
			System.out.println(result);
			runnersOnBase[0] = run1b;
			runnersOnBase[1] = run2b;
			runnersOnBase[2] = run3b;
		}
		System.out.println();
		//System.out.println("3 Outs, inning over");
		runsBatter[1] = BatterUp ;
		return runsBatter;
	}
	

}
