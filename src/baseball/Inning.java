package baseball;

public class Inning {
	
	public static int NewInning(Player p){
		int outs = 0; 
		int runs = 0;
		boolean run1b = false;
		boolean run2b = false;
		boolean run3b = false;
		Player inningPlayer = p;
		
		
		
		while (outs < 3){
			/*System.out.println("Outs: " + outs);
			System.out.println("Runs: " + runs);
			System.out.println("First Base: " + run1b);
			System.out.println("Second Base: " + run2b);
			System.out.println("Third Base: " + run3b);
			*/
			String result = AtBat.NewAtBat(inningPlayer);
			//System.out.println("RESULT: " + result);
			//System.out.println();
			
			if (result == "Out" || result == "Strikeout"){
				outs++;
			}
			else if (result == "Single"){		
				if (run3b){
					run3b = false;
					runs++;
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
					runs++;
				}
				if (run2b){
					run2b = false;
					runs++;
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
					runs++;
				}
				if (run2b){
					run2b = false;
					runs++;
				}
				if (run1b){
					run1b = false;
					runs++;
				}
				run3b = true;
			}
			
			else if (result == "HOME RUN!"){		
				if (run3b){
					run3b = false;
					runs++;
				}
				if (run2b){
					run2b = false;
					runs++;
				}
				if (run1b){
					run1b = false;
					runs++;
				}
				runs++;
			}
			
			else if (result == "Walk" || result == "Hit By Pitch"){		
				if (run1b && run2b && run3b){
					runs++;
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
		}
		
		//System.out.println("3 Outs, inning over");
		return runs;
	}
	

}
