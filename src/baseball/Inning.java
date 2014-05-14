package baseball;

public class Inning {
	
	public static String getLocation(int resultCode){
		String location = "";
		double randomLocation = Math.random();
		double options;
		switch (resultCode){
		
		case 7:
			options = 2;
			if (randomLocation < 1/options){
				location = " Swinging";
			}
			else {
				location = " Looking";
			}
			break;
		
		case 11:
			options = 3;
			if (randomLocation < 1/options){
				location = " to Deep Left";
			}
			else if (randomLocation < 2/options){
				location = " to Deep Center";
			}
			else {
				location = " to Deep Right";
			}
			break;
			
		case 10:
			options = 13;
			if (randomLocation < 1/options){
				location = " to Shallow Left";
			}
			else if (randomLocation < 2/options){
				location = " to Shallow Center";
			}
			else if (randomLocation < 3/options){
				location = " to Shallow Right";
			}
			else if (randomLocation < 4/options){
				location = " to Shallow Left Center";
			}
			else if (randomLocation < 5/options){
				location = " to Shallow Right Center";
			}
			else if (randomLocation < 6/options){
				location = " to Left";
			}
			else if (randomLocation < 7/options){
				location = " to Center";
			}
			else if (randomLocation < 8/options){
				location = " to Right";
			}
			else if (randomLocation < 9/options){
				location = " to Left Center";
			}
			else if (randomLocation < 10/options){
				location = " to Right Center";
			}
			else if (randomLocation < 10.5/options){
				location = " to First";
			}
			else if (randomLocation < 11/options){
				location = " to Second";
			}
			else if (randomLocation < 11.5/options){
				location = " to Third";
			}
			else if (randomLocation < 12.0/options){
				location = " to Shortstop";
			}
			else if (randomLocation < 12.5/options){
				location = " to Catcher";
			}
			else location = " to Pitcher";
			
			break;
			
		case 1:
			options = 13;
			if (randomLocation < 1/options){
				location = " to Shallow Left";
			}
			else if (randomLocation < 2/options){
				location = " to Shallow Center";
			}
			else if (randomLocation < 3/options){
				location = " to Shallow Right";
			}
			else if (randomLocation < 4/options){
				location = " to Shallow Left Center";
			}
			else if (randomLocation < 5/options){
				location = " to Shallow Right Center";
			}
			else if (randomLocation < 6/options){
				location = " to Left";
			}
			else if (randomLocation < 7/options){
				location = " to Center";
			}
			else if (randomLocation < 8/options){
				location = " to Right";
			}
			else if (randomLocation < 9/options){
				location = " to Left Center";
			}
			else if (randomLocation < 10/options){
				location = " to Right Center";
			}
			else if (randomLocation < 10.5/options){
				location = " to First";
			}
			else if (randomLocation < 11/options){
				location = " to Second";
			}
			else if (randomLocation < 11.5/options){
				location = " to Third";
			}
			else if (randomLocation < 12.5/options){
				location = " to Shortstop";
			}
			else location = " to Pitcher";
			
			break;
			
		case 2:
			options = 10;
			if (randomLocation < 1/options){
				location = " to Shallow Left";
			}
			else if (randomLocation < 1/options){
				location = " to Shallow Right";
			}
			else if (randomLocation < 2/options){
				location = " to Left";
			}
			else if (randomLocation < 3/options){
				location = " to Right";
			}
			else if (randomLocation < 4/options){
				location = " to Left Center";
			}
			else if (randomLocation < 5/options){
				location = " to Right Center";
			}
			else if (randomLocation < 6/options){
				location = " to Deep Left";
			}
			else if (randomLocation < 7/options){
				location = " to Deep Right";
			}
			else if (randomLocation < 8/options){
				location = " to Deep Left Center";
			}
			else if (randomLocation < 9/options){
				location = " to Deep Right Center";
			}
			else location = " to Deep Center";
			
			break;
			
		case 3:
			options = 5;
			if (randomLocation < 1/options){
				location = " to Deep Left";
			}
			else if (randomLocation < 2/options){
				location = " to Deep Right";
			}
			else if (randomLocation < 3/options){
				location = " to Deep Left Center";
			}
			else if (randomLocation < 4/options){
				location = " to Deep Right Center";
			}
			else location = " to Deep Center";
			
			break;
			
		case 4:
			options = 5;
			if (randomLocation < 1/options){
				location = " to Deep Left";
			}
			else if (randomLocation < 2/options){
				location = " to Deep Right";
			}
			else if (randomLocation < 3/options){
				location = " to Deep Left Center";
			}
			else if (randomLocation < 4/options){
				location = " to Deep Right Center";
			}
			else location = " to Deep Center";
			
			break;
			
		case 9:
			options = 4.5;
			if (randomLocation < 1/options){
				location = " to First";
			}
			else if (randomLocation < 2/options){
				location = " to Second";
			}
			else if (randomLocation < 3/options){
				location = " to Third";
			}
			else if (randomLocation < 4/options){
				location = " to Shortstop";
			}
			else location = " to Pitcher";
			
			break;
		}
		return location;
	}
	
	
	
	
	
	
	
	
	public static int[] NewInning(Team t1, Team t2, int BatterUp, int pitcher, boolean homeChance, int homeDef){
		String[] results = {"Singled", "Doubled", "Tripled", "Homered", "Walked", "Hit By Pitch", "Struck Out", "Out", "Grounded Out", "Flied Out"};
		int outs = 0; 
		String location = "";
		int[] runsBatter = {0, BatterUp};
		Player run1b = null;
		Player run2b = null;
		Player run3b = null;
		
		
		System.out.println("AT BAT: " + t1.name);
		while (outs < 3){
			String runResult = null;
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
					runResult = run1b.name + " Stole Second Base!";
					run1b.gameSB++;
					run2b = run1b;
					run1b = null;
				}
				else if (outcome == 2){
					runResult= run1b.name + " Caught Stealing Second Base!";
					run1b.gameCS++;
					run1b = null;
					outs++;
				}
			}
			
			else if (run2b!=null && run3b==null && outs < 2){
				int outcome = RunningRolls.Run(run2b, 2);
				if (outcome == 1){
					runResult = run2b.name + " Stole Third Base!";
					run2b.gameSB++;
					run3b = run2b;
					run2b = null;
				}
				else if (outcome == 2){
					runResult = run2b.name + " Caught Stealing Third Base!";
					run2b.gameCS++;
					run2b = null;
					outs++;
				}
			}
			
			Player p1 = t1.battingOrder[BatterUp];
			Player p2 = t2.pitchingRotation[pitcher];
			int resultCode = AtBat.NewAtBat(p1, p2);
			location = getLocation(resultCode);
			//RESULT
			String result = (p1.name + " " + results[resultCode-1] + location);
			//System.out.println();
			
			if (resultCode > 6){
				if (resultCode == 7){
					p1.gameSO++;
					p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
					t2.pitchingRotation[pitcher].gamepK++;
				}
				else if (resultCode == 10 && run3b!=null && outs < 2){
					location = getLocation(11);
					double randomSacFly = Math.random();
					if (randomSacFly < run3b.StealSuccP){
						runsBatter[0]++;
						result = (p1.name + " Hit Sacrifice Fly" + location + ", " + run3b.name + " Scored");
						run3b.gameR++;
						p1.gameRBI++;
						t2.pitchingRotation[pitcher].gamepER++;
					}
					else {
						outs++;
						result = (result + ", " + run3b.name + " Thrown Out At Home");
						p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
					}
					run3b = null;
				}
				else if (resultCode == 9 && outs < 2){
					if (run1b!=null && run2b!=null && run3b!=null){
						double randomBeatOutDP = Math.random();
						if (randomBeatOutDP < p1.StealSuccP){
							result = (p1.name + " Grounded Into Fielder's Choice, " + run3b.name + " Out at Home, " + run2b.name + " to Third, " + run1b.name + " to Second");
							run3b = null;					
							run3b = run2b;
							run2b = run1b;
							run1b = p1;
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
						}
						else {
							result = (p1.name + " Grounded Into Double Play, " + run3b.name + " Out at Home, " + run2b.name + " to Third, " + run1b.name + " to Second");
							run3b = null;					
							run3b = run2b;
							run2b = run1b;
							run1b = null;
							outs++;
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
						}
					}				
					else if (run1b!=null && run2b!=null) {
							double randomBeatOutDP = Math.random();
							if (randomBeatOutDP < p1.StealSuccP){
								result = (p1.name + " Grounded Into Fielder's Choice, " + run2b.name + " Out at Third, " + run1b.name + " to Second");					
								run2b = run1b;
								run1b = p1;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
							}
							else{
								result = (p1.name + " Grounded Into Double Play, " + run2b.name + " Out at Third, " + run1b.name + " to Second");
								run2b = run1b;					
								run1b = null;
								outs++;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
							}
					}
					else if (run1b!=null && run3b!=null) {
						if (outs == 0){
							double randomBeatOutDP = Math.random();
							if (randomBeatOutDP < p1.StealSuccP){
								result = (p1.name + " Grounded Into Fielder's Choice, " + run1b.name + " Out at Second, " + run3b.name + " Scored");
								run3b.gameR++;
								p1.gameRBI++;
								run3b = null;
								run1b = p1;
								runsBatter[0]++;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
								t2.pitchingRotation[pitcher].gamepER++;
							}
							else{
								result = (p1.name + " Grounded Into Double Play, " + run1b.name + " Out at Second, " + run3b.name + " Scored");
								run3b.gameR++;
								p1.gameRBI++;
								run3b = null;					
								run1b = null;
								outs++;
								runsBatter[0]++;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
								t2.pitchingRotation[pitcher].gamepER++;
							}
						}
					
						else{
							double randomBeatOutDP = Math.random();
							if (randomBeatOutDP < p1.StealSuccP){
								result = (p1.name + " Grounded Into Fielder's Choice, " + run1b.name + " Out at Second, " + run3b.name + " Scored");	
								run3b.gameR++;
								p1.gameRBI++;
								run3b = null;
								run1b = p1;
								runsBatter[0]++;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
								t2.pitchingRotation[pitcher].gamepER++;
							}
							else{
								result = (p1.name + " Grounded Into Double Play, " + run1b.name + " Out at Second");
								run3b = null;					
								run1b = null;
								outs++;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
							}
						}
					}
					else if (run2b!=null && run3b!=null){
						int outcome = RunningRolls.RunFrom2nd(run3b);
						if (outcome == 1){
							result = (result + ", " + run3b.name + " Scored, " + run2b.name + " to Third");
							p1.gameRBI++;
							run3b.gameR++;
							runsBatter[0]++;
							t2.pitchingRotation[pitcher].gamepER++;
							run3b = run2b;
							run2b = null;
						}
						else if (outcome == 2){
							result = (p1.name + " Grounded Into Fielder's Choice, " + run3b.name + " Out at Home" + run2b.name + " to Third");
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
							run3b = run2b;
							run2b = null;
							run1b = p1;
						}
						else if (outcome == 3){
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
						}
					}
					else if (run3b!=null){
						int outcome = RunningRolls.RunFrom2nd(run3b);
						if (outcome == 1){
							result = (result + ", " + run3b.name + " Scored");
							p1.gameRBI++;
							run3b.gameR++;
							runsBatter[0]++;
							t2.pitchingRotation[pitcher].gamepER++;
							run3b = null;
						}
						else if (outcome == 2){
							result = (p1.name + " Grounded Into Fielder's Choice, " + run3b.name + " Out at Home");
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
							run3b = null;
							run1b = p1;
						}
						else if (outcome == 3){
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
						}
					}
					else if (run2b!=null){
						int outcome = RunningRolls.RunFrom2nd(run2b);
						if (outcome == 1){
							result = (result + ", " + run2b.name + " to Third");
							run3b = run2b;
							run2b = null;
						}
						else if (outcome == 2){
							result = (p1.name + " Grounded Into Fielder's Choice, " + run2b.name + " Out at Third");
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
							run2b = null;
							run1b = p1;
						}
						else if (outcome == 3){
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
						}
					}
					else if (run1b!=null){
						double randomBeatOutDP = Math.random();
						if (randomBeatOutDP < p1.StealSuccP){
							result = (p1.name + " Grounded Into Fielder's Choice, " + run1b.name + " Out at Second");	
							run1b = p1;
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
						}
						else{
							result = (p1.name + " Grounded Into Double Play, " + run1b.name + " Out at Second");
							run1b = null;
							outs++;
							p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
						}
					}
					else p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
				}
				else if (resultCode == 9 || resultCode == 10){
					p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
				}
				outs++;
			}
			else if (resultCode == 1){		
				if (run3b!=null){
					result = (result + ", " + run3b.name + " Scored");
					run3b.gameR++;
					p1.gameRBI++;
					run3b = null;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}
				if (run2b!=null){
					int outcome = RunningRolls.RunFrom2nd(run2b);
					if (outcome == 1){
						result = (result + ", " + run2b.name + " Scored");
						run2b.gameR++;
						p1.gameRBI++;
						runsBatter[0]++;
						t2.pitchingRotation[pitcher].gamepER++;
					}
					else if (outcome == 2){
						result = (result + ", " + run2b.name + " Thrown Out At Home");
						outs++;
					}
					else {
						result = (result + ", " + run2b.name + " To Third");
						run3b = run2b;
						
					}
					run2b = null;
				}
				if (run1b!=null){
					result = (result + ", " + run1b.name + " To Second");
					run2b = run1b;
					run1b = null;
				}
				run1b = p1;
				p1.gamesingles++;
				p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
				t2.pitchingRotation[pitcher].gamepH++;
			}
			
			else if (resultCode == 2){		
				if (run3b!=null){
					result = (result + ", " + run3b.name + " Scored");
					run3b.gameR++;
					p1.gameRBI++;
					run3b = null;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}
				if (run2b!=null){
					result = (result + ", " + run2b.name + " Scored");
					run2b.gameR++;
					p1.gameRBI++;
					run2b = null;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}
				if (run1b!=null){
					int outcome = RunningRolls.RunFrom2nd(run1b);
					if (outcome == 1){
						result = (result + ", " + run1b.name + " Scored");
						run1b.gameR++;
						p1.gameRBI++;
						runsBatter[0]++;
						t2.pitchingRotation[pitcher].gamepER++;
					}
					else if (outcome == 2){
						result = (result + ", " + run1b.name + " Thrown Out At Home");
						outs++;
					}
					else {
						result = (result + ", " + run1b.name + " To Third");
						run3b = run1b;		
					}
					run1b = null;
				}
				run2b = p1;
				p1.gamedoubles++;
				p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
				t2.pitchingRotation[pitcher].gamepH++;
			}
			
			
			else if (resultCode == 3){		
				if (run3b!=null){
					result = (result + ", " + run3b.name + " Scored");
					run3b.gameR++;
					p1.gameRBI++;
					run3b = null;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}
				if (run2b!=null){
					result = (result + ", " + run2b.name + " Scored");
					run2b.gameR++;
					p1.gameRBI++;
					run2b = null;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}
				if (run1b!=null){
					result = (result + ", " + run1b.name + " Scored");
					run1b.gameR++;
					p1.gameRBI++;
					run1b = null;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}
				run3b = p1;
				p1.gametriples++;
				p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
				t2.pitchingRotation[pitcher].gamepH++;
			}
			
			
			else if (resultCode == 4){		
				if (run3b!=null){
					result = (result + ", " + run3b.name + " Scored");
					run3b.gameR++;
					p1.gameRBI++;
					run3b = null;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}
				if (run2b!=null){
					result = (result + ", " + run2b.name + " Scored");
					run2b.gameR++;
					p1.gameRBI++;
					run2b = null;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}
				if (run1b!=null){
					result = (result + ", " + run1b.name + " Scored");
					run1b.gameR++;
					p1.gameRBI++;
					run1b = null;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}
				p1.gameR++;
				p1.gameRBI++;
				runsBatter[0]++;
				p1.gameHR++;
				p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
				t2.pitchingRotation[pitcher].gamepER++;
				t2.pitchingRotation[pitcher].gamepH++;
				t2.pitchingRotation[pitcher].gamepHR++;
			}
			
			
			else if (resultCode == 5 || resultCode == 6){
				if (resultCode ==5){
					p1.gameBB++;
					t2.pitchingRotation[pitcher].gamepBB++;
				}
				else {
					p1.gameHBP++;
					t2.pitchingRotation[pitcher].gamepHBP++;
				}
						
				if (run1b!=null && run2b!=null && run3b!=null){
					result = (result + ", " + run3b.name + " Scored");
					result = (result + ", " + run2b.name + " To Third");
					result = (result + ", " + run1b.name + " To Second");
					run3b.gameR++;
					p1.gameRBI++;
					run3b = run2b;
					run2b = run1b;
					run1b = p1;
					runsBatter[0]++;
					t2.pitchingRotation[pitcher].gamepER++;
				}				
				else if (run1b!=null && run2b!=null) {
					result = (result + ", " + run2b.name + " To Third");
					result = (result + ", " + run1b.name + " To Second");
					run3b = run2b;
					run2b = run1b;
					run1b = p1;
				}
				else if (run2b!=null && run3b!=null){
					run1b = p1;
				}
				else if (run1b!=null && run3b!=null) {
					result = (result + ", " + run1b.name + " To Second");
					run2b = run1b;
					run1b = p1;
				}
				else if (run1b!=null){
					result = (result + ", " + run1b.name + " To Second");
					run2b = run1b;
					run1b = p1;
				}
				else run1b = p1;
			}
			
			
			BatterUp++;
			if (BatterUp == 9){
				BatterUp = 0;
			}
			if (runResult != null){
				System.out.println(runResult);
			}		
			System.out.println(result);
			
			p1.gamePA++;
			t2.pitchingRotation[pitcher].gamepPA++;
			t2.pitchingRotation[pitcher].gamepP+=3.8;
			if (t2.pitchingRotation[pitcher].gamepP > 100){
				pitcher++;
				System.out.println("NEW PITCHER");
			}
			
			if (homeChance && (runsBatter[0]>homeDef)){
				outs=3;
			}
		}
		System.out.println();
		//System.out.println("3 Outs, inning over");
		runsBatter[1] = BatterUp;
		return runsBatter;
	}
	

}
