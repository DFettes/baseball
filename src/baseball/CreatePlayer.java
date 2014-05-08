package baseball;

public class CreatePlayer {

	public static void main(String[] args) {
		Player p1 = new Player("Chase Utley");
		
		p1.ppos("2B");
		p1.pG(1351);
		p1.pPA(5796);
		p1.pAB(5023);
		p1.pR(869);
		p1.pH(1447);
		p1.pdoubles(309);
		p1.ptriples(42);
		p1.pHR(220);
		p1.pRBI(823);
		p1.pSB(129);
		p1.pCS(17);
		p1.pBB(560);
		p1.pSO(852);
		p1.pHBP(157);
		p1.setStats();
		//p1.printPlayer();
		
		/*int hits = 0;
		
		for (int i=0; i<100; i++){
			double random = Math.random();
			if (random <= p1.battingAVG){
				hits++;
			}
		}
		System.out.println("hits in 1000 at bats: " + hits);
		*/
		double samplehits = 0;
		double sampleAB = 0;
		double sample1b = 0;
		double sample2b = 0;
		double sample3b = 0;
		double sampleHR = 0;
		double sampleBB = 0;
		double sampleSO = 0;
		double sampleHBP = 0;
		
		for (int i=0; i<1000; i++){
			String result = "Out";
			double random = Math.random();
			double baseline = 0;
			//System.out.println("random: " + random);
			
			double[] probabilities = {p1.singleAVG, p1.doubleAVG, p1.tripleAVG, p1.HRAVG, p1.BBAVG, p1.HBPAVG, p1.SOAVG};
			String[] results = {"Single", "Double", "Triple", "HOME RUN!", "Walk", "Hit By Pitch", "Strikeout"};
			
			boolean set = false;
			int index = 0;
			while (!set && (index < probabilities.length)){
				baseline += probabilities[index];
				if (random <= baseline){
					result = results[index];
					set = true;
				}
				index++;
			}
			
			
			//System.out.println(result);
			
			if (result == "Single"){
				sample1b++;	
				samplehits++;
				sampleAB++;
			}
			if (result == "Double"){
				sample2b++;	
				samplehits++;
				sampleAB++;
			}
			if (result == "Triple"){
				sample3b++;	
				samplehits++;
				sampleAB++;
			}
			if (result == "HOME RUN!"){
				sampleHR++;
				samplehits++;
				sampleAB++;
			}
			if (result == "Walk"){
				sampleBB++;				
			}
			if (result == "Hit By Pitch"){
				sampleHBP++;				
			}
			if (result == "Strikeout"){
				sampleSO++;
				sampleAB++;
			}
			if (result == "Out"){
				sampleAB++;
			}
		}
		
		System.out.println("Singles Hit: " + sample1b);
		System.out.println("Doubles Hit: " + sample2b);
		System.out.println("Triples Hit: " + sample3b);
		System.out.println("Home Runs Hit: " + sampleHR);
		System.out.println("Times Walked: " + sampleBB);
		System.out.println("Times Struk Out: " + sampleSO);
		System.out.println("Time Hit By Pitch: " + sampleHBP);
		
		double sampleAVG = samplehits/sampleAB; 
		System.out.println("Batting Average: " + sampleAVG);
		
	}
}

