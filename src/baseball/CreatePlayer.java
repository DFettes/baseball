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
		p1.printPlayer();
		
		int hits = 0;
		
		for (int i=0; i<1000; i++){
			double random = Math.random();
			if (random <= p1.battingAVG){
				hits++;
			}
		}
		System.out.println("hits in 1000 at bats: " + hits);
		
			
	}

}

