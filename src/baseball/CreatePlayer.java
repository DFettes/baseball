package baseball;

public class CreatePlayer {

	public static void main(String[] args) {
		Player p1 = new Player("Chase Utley");
		
		p1.ppos("SB");
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
		
Player p2 = new Player("Babe Ruth");
		
		p2.ppos("LF");
		p2.pG(2503);
		p2.pPA(10622);
		p2.pAB(8399);
		p2.pR(2174);
		p2.pH(2873);
		p2.pdoubles(506);
		p2.ptriples(136);
		p2.pHR(714);
		p2.pRBI(2214);
		p2.pSB(123);
		p2.pCS(117);
		p2.pBB(2062);
		p2.pSO(1330);
		p2.pHBP(43);
		p2.setStats();
		//p2.printPlayer();
		
		//String result = AtBat.AtBat(p2);
		//System.out.println(result);
		
		
		Team t1 = CreateTeam.NewTeam(p1,p1,p2,p2,p1,p1,p2,p2,p1)[0];
		Team t2 = CreateTeam.NewTeam(p2,p2,p2,p2,p2,p2,p2,p2,p2)[1];
		Game.NewGame(t1, t2);
		
		
		

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

