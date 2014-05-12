package baseball;

public class RunningRolls {
	public static int Run(Player p, int base){
		int outcome = 3;
		double randomGo = Math.random();
		
		if (base == 1){
			if (randomGo < p.StealAttP){
				double randomSafe = Math.random();
				if (randomSafe < p.StealSuccP){
						outcome = 1;
				}
				else outcome = 2;
			}
			else outcome = 3;
		}
		
		if (base == 2){
			if (randomGo < p.StealAttP/2){
				double randomSafe = Math.random();
				if (randomSafe < p.StealSuccP){
						outcome = 1;
				}
				else outcome = 2;
			}
			else outcome = 3;
		}
		
		return outcome;
	}

	public static int RunFrom2nd(Player p){
		int outcome = 3;
		double randomGo = Math.random();		
		
			if (randomGo < p.StealSuccP){
				double randomSafe = Math.random();
				if (randomSafe < p.StealSuccP){
						outcome = 1;
				}
				else outcome = 2;
			}
			else outcome = 3;
		
		return outcome;
	}
	
	
	
}
