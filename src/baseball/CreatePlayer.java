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
		
		//String result = AtBat.AtBat(p1);
		//System.out.println(result);
		
		Inning.Inning(p1);
		

		/*double samplehits = 0;
		double sampleAB = 0;
		double samplePA = 0;
		double sample1b = 0;
		double sample2b = 0;
		double sample3b = 0;
		double sampleHR = 0;
		double sampleBB = 0;
		double sampleSO = 0;
		double sampleHBP = 0;
		double sampleTB = 0;
		
		//for (int i=0; i<739; i++){
			
			
			
			//System.out.println(result);
			
			
			if (result == "Single"){
				sample1b++;	
				samplehits++;
				sampleAB++;
				sampleTB++;
			}
			if (result == "Double"){
				sample2b++;	
				samplehits++;
				sampleAB++;
				sampleTB+=2;
			}
			if (result == "Triple"){
				sample3b++;	
				samplehits++;
				sampleAB++;
				sampleTB+=3;
			}
			if (result == "HOME RUN!"){
				sampleHR++;
				samplehits++;
				sampleAB++;
				sampleTB+=4;
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
			samplePA++;
			
		}
		
		System.out.println("Hits: " + samplehits);
		System.out.println("Doubles Hit: " + sample2b);
		System.out.println("Triples Hit: " + sample3b);
		System.out.println("Home Runs Hit: " + sampleHR);
		System.out.println("Times Walked: " + sampleBB);
		System.out.println("Times Struk Out: " + sampleSO);
		System.out.println("Time Hit By Pitch: " + sampleHBP);
		
		double sampleAVG = samplehits/sampleAB; 
		double sampleOBP = (samplehits + sampleBB + sampleHBP) / samplePA;
		double sampleSLG = sampleTB/sampleAB; 
		double sampleOPS = sampleOBP + sampleSLG; 
		
		System.out.println("AVG: " + sampleAVG);
		System.out.println("OBP: " + sampleOBP);
		System.out.println("SLG: " + sampleSLG);
		System.out.println("OPS: " + sampleOPS);
		*/
	}
}

