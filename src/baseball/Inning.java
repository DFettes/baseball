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
			/*
			System.out.println("Outs: " + outs);
			System.out.println("Runs: " + runsBatter[0]);
			if (run1b !=null){
			System.out.println("First Base: " + run1b.name);}
			if (run2b !=null){
			System.out.println("Second Base: " + run2b.name);}
			if (run3b !=null){
			System.out.println("Third Base: " + run3b.name);}
			*/
			if (run1b!=null && run2b==null){
				int outcome = RunningRolls.Run(run1b, 1);
				if (outcome == 1){
					System.out.println("RUNNER: " + run1b.name + " Stole Second Base!");
					run1b.gameSB++;
					run2b = run1b;
					run1b = null;
				}
				else if (outcome == 2){
					System.out.println("RUNNER: " + run1b.name + " Caught Stealing Second Base!");
					run1b.gameCS++;
					run1b = null;
					outs++;
				}
			}
			
			if (run2b!=null && run3b==null && outs < 2){
				int outcome = RunningRolls.Run(run2b, 2);
				if (outcome == 1){
					System.out.println("RUNNER: " + run2b.name + " Stole Third Base!");
					run2b.gameSB++;
					run3b = run2b;
					run2b = null;
				}
				else if (outcome == 2){
					System.out.println("RUNNER: " + run2b.name + " Caught Stealing Third Base!");
					run2b.gameCS++;
					run2b = null;
					outs++;
				}
			}
			
			Player p1 = t.battingOrder[BatterUp];
			int resultCode = AtBat.NewAtBat(p1);
			String result = ("BATTER: " + p1.name + " RESULT: " + results[resultCode-1]);
			//System.out.println();
			
			if (resultCode > 6){
				if (resultCode == 7){
					p1.SO++;
				}
				if (resultCode == 10 && run3b!=null && outs < 2){
					double randomSacFly = Math.random();
					if (randomSacFly < run3b.StealSuccP){
						runsBatter[0]++;
						result = (result + " - " + run3b.name + " Scored on Sacrifice Fly");
						run3b.gameR++;
						p1.gameRBI++;
					}
					else {
						outs++;
						result = (result + " - " + run3b.name + " Thrown Out At Home");
					}
					run3b = null;
				}
				if (resultCode == 9 && outs < 2){
					if (run1b!=null && run2b!=null && run3b!=null){
						result = (result + " - Double Play - " + run3b.name + " Out at Home");
						run3b = null;					
						run3b = run2b;
						run2b = run1b;
						run1b = null;
						outs++;
					}				
					else if (run1b!=null && run2b!=null) {
						result = (result + " - Double Play - " + run2b.name + " Out at Third");
						run2b = run1b;					
						run1b = null;
						outs++;
					}
					else if (run2b!=null && run3b!=null){
						run1b = p1;
					}
					else if (run1b!=null && run3b!=null) {
						if (outs == 0){
							result = (result + " - Double Play - " + run1b.name + " Out at Second - " + run3b.name + " Scored");
							run3b.gameR++;
							p1.gameRBI++;
							run3b = null;					
							run1b = null;
							outs++;
							runsBatter[0]++;
						}
					
						else{
							result = (result + " - Double Play - " + run1b.name + " Out at Second");
							run3b = null;					
							run1b = null;
							outs++;
						}
					}
					else if (run1b!=null){
						result = (result + " - Double Play - " + run1b.name + " Out at Second");
						run1b = null;
						outs++;
					}
				}
				outs++;
				p1.gameAB++;
			}
			else if (resultCode == 1){		
				if (run3b!=null){
					result = (result + " - " + run3b.name + " Scored");
					run3b.gameR++;
					p1.gameRBI++;
					run3b = null;
					runsBatter[0]++;
				}
				if (run2b!=null){
					int outcome = RunningRolls.RunFrom2nd(run2b);
					if (outcome == 1){
						result = (result + " - " + run2b.name + " Scored");
						run2b.gameR++;
						p1.gameRBI++;
						runsBatter[0]++;
					}
					else if (outcome == 2){
						result = (result + " - " + run2b.name + " Thrown Out At Home");
						outs++;
					}
					else run3b = run2b;		
					run2b = null;
				}
				if (run1b!=null){
					run2b = run1b;
					run1b = null;
				}
				run1b = p1;
				p1.gamesingles++;
				p1.gameAB++;
			}
			
			else if (resultCode == 2){		
				if (run3b!=null){
					result = (result + " - " + run3b.name + " Scored");
					run3b.gameR++;
					p1.gameRBI++;
					run3b = null;
					runsBatter[0]++;
				}
				if (run2b!=null){
					result = (result + " - " + run2b.name + " Scored");
					run2b.gameR++;
					p1.gameRBI++;
					run2b = null;
					runsBatter[0]++;
				}
				if (run1b!=null){
					int outcome = RunningRolls.RunFrom2nd(run1b);
					if (outcome == 1){
						result = (result + " - " + run1b.name + " Scored");
						run1b.gameR++;
						p1.gameRBI++;
						runsBatter[0]++;
					}
					else if (outcome == 2){
						result = (result + " - " + run1b.name + " Thrown Out At Home");
						outs++;
					}
					else run3b = run1b;		
					run1b = null;
				}
				run2b = p1;
				p1.gamedoubles++;
				p1.gameAB++;
			}
			
			
			else if (resultCode == 3){		
				if (run3b!=null){
					result = (result + " - " + run3b.name + " Scored");
					run3b.gameR++;
					p1.gameRBI++;
					run3b = null;
					runsBatter[0]++;
				}
				if (run2b!=null){
					result = (result + " - " + run2b.name + " Scored");
					run2b.gameR++;
					p1.gameRBI++;
					run2b = null;
					runsBatter[0]++;
				}
				if (run1b!=null){
					result = (result + " - " + run1b.name + " Scored");
					run1b.gameR++;
					p1.gameRBI++;
					run1b = null;
					runsBatter[0]++;
				}
				run3b = p1;
				p1.gametriples++;
				p1.gameAB++;
			}
			
			
			else if (resultCode == 4){		
				if (run3b!=null){
					result = (result + " - " + run3b.name + " Scored");
					run3b.gameR++;
					p1.gameRBI++;
					run3b = null;
					runsBatter[0]++;
				}
				if (run2b!=null){
					result = (result + " - " + run2b.name + " Scored");
					run2b.gameR++;
					p1.gameRBI++;
					run2b = null;
					runsBatter[0]++;
				}
				if (run1b!=null){
					result = (result + " - " + run1b.name + " Scored");
					run1b.gameR++;
					p1.gameRBI++;
					run1b = null;
					runsBatter[0]++;
				}
				result = (result + " - " + p1.name + " Scored");
				p1.gameR++;
				p1.gameRBI++;
				runsBatter[0]++;
				p1.gameHR++;
				p1.gameAB++;
			}
			
			
			else if (resultCode == 5 || resultCode == 6){
				if (resultCode ==5){
					p1.gameBB++;
				}
				else p1.gameHBP++;
				
				if (run1b!=null && run2b!=null && run3b!=null){
					result = (result + " - " + run3b.name + " Scored");
					run3b.gameR++;
					p1.gameRBI++;
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
			
			p1.gamePA++;
		}
		System.out.println();
		//System.out.println("3 Outs, inning over");
		runsBatter[1] = BatterUp ;
		return runsBatter;
	}
	

}
