package baseball;


public class Player {
	String name, pos;
	double G, PA, AB, R, H, doubles, triples, HR, RBI, SB, CS, BB, SO, HBP;
	double singles, battingAVG, singleAVG, doubleAVG, tripleAVG, HRAVG, BBAVG, SOAVG, HBPAVG, OBP, SLG, OPS, TB, StealAttP, StealSuccP;
	double gamePA, gameAB, gameR, gameH, gamesingles, gamedoubles, gametriples, gameHR, gameRBI, gameSB, gameCS, gameBB, gameSO, gameHBP;
	double seasonPA, seasonAB, seasonR, seasonH, seasonsingles, seasondoubles, seasontriples, seasonHR, seasonRBI, seasonSB, seasonCS, seasonBB, seasonSO, seasonHBP, seasonBattingAVG, seasonOBP, seasonTB, seasonSLG, seasonOPS;
	double pIP, pER, pK, pH, pBB, pHR, pERA, pWHIP, pK9, pH9, pBB9, pHR9;
	double baseK9, baseH9, baseBB9, baseHR9, K9diff, H9diff, BB9diff, HR9diff;
	
	public void setStats() {
		if (PA > 0) {
			//Hitting Stats
			singles = H - doubles - triples - HR;
			battingAVG = H/AB;
			singleAVG = singles/PA;
			doubleAVG = doubles/PA;
			tripleAVG = triples/PA;
			HRAVG = HR/PA;
			BBAVG = BB/PA;
			SOAVG = SO/PA;
			HBPAVG = HBP/PA;
			OBP = (H + BB + HBP)/PA;
			TB = singles + 2*doubles + 3*triples + 4*HR;
			SLG = TB/AB;
			OPS = OBP + SLG;
			
			gamePA=gameAB=gameR=gameH=gamesingles=gamedoubles=gametriples=gameHR=gameRBI=gameSB=gameCS=gameBB=gameSO=gameHBP=0;
			seasonPA=seasonAB=seasonR=seasonH=seasonsingles=seasondoubles=seasontriples=seasonHR=seasonRBI=seasonSB=seasonCS=seasonBB=seasonSO=seasonHBP=0;
			
			//Speed Stats
			StealAttP = (SB+CS)*3.5/PA;
			StealSuccP = SB/(SB + CS);
			
			
		}
	}
	
	public void setPitchingStats() {
		pERA = 9*pER/pIP;
		pWHIP = (pBB + pH)/pIP;
		pK9 = 9*pK/pIP;
		pH9 = 9*pH/pIP;
		pBB9 = 9*pBB/pIP;
		pHR9 = 9*pHR/pIP;
		
		baseK9 = 7.6;
		baseH9 = 8.7;
		baseBB9 = 3.1;
		baseHR9 = 1.0;
		
		K9diff = pK9/baseK9;
		H9diff = pH9/baseH9;
		BB9diff = pBB9/baseBB9;
		HR9diff = pHR9/baseHR9;
	}
	
	public void setAdjStats() {
		/*K9 diff: 2.4101741208603613
		H9 diff: 0.7424718333902369
		BB9 diff: -1.0504950495049505
		HR9 diff: -0.0013656538067600144*/

		singleAVG = singleAVG*H9diff;
		doubleAVG = doubleAVG*H9diff;
		tripleAVG = tripleAVG*H9diff;
		HRAVG = HRAVG*HR9diff;
		BBAVG = BBAVG*BB9diff;
		SOAVG = SOAVG*K9diff;
		
		System.out.println("adj singleAVG: " + singleAVG);
	    System.out.println("adj doubleAVG: " + doubleAVG);
	    System.out.println("adj tripleAVG: " + tripleAVG);
	    System.out.println("adj HRAVG: " + HRAVG);
	    System.out.println("adj BBAVG: " + BBAVG);
	    System.out.println("adj SOAVG: " + SOAVG);
	    System.out.println("adj HBPAVG: " + HBPAVG);
	    System.out.println("adj BAavg: " + (singleAVG+doubleAVG+tripleAVG+HRAVG));
	    System.out.println("adj OBPavg: " + (singleAVG+doubleAVG+tripleAVG+HRAVG+BBAVG+HBPAVG));
	}
	
	public Player(String name){
	      this.name = name;
	   }
	
	public void ppos(String ppos){
	      pos =  ppos;
	   }
	
	public void pG(double pG){
	      G =  pG;
	   }
	
	public void pPA(double pPA){
	      PA =  pPA;
	   }
	
	public void pAB(double pAB){
	      AB =  pAB;
	   }
	
	public void pR(double pR){
	      R =  pR;
	   }
	
	public void pH(double pH){
	      H =  pH;
	   }
	
	public void pdoubles(double pdoubles){
	      doubles =  pdoubles;
	   }
	
	public void ptriples(double ptriples){
		triples =  ptriples;
	   }
	
	public void pHR(double pHR){
	      HR =  pHR;
	   }
	
	public void pRBI(double pRBI){
	      RBI =  pRBI;
	   }
	
	public void pSB(double pSB){
	      SB =  pSB;
	   }
	
	public void pCS(double pCS){
	      CS =  pCS;
	   }
	
	public void pBB(double pBB){
	      BB =  pBB;
	   }
	
	public void pSO(double pSO){
	      SO =  pSO;
	   }
	
	public void pHBP(double pHBP){
		HBP =  pHBP;
	   }

	//pitching
	public void ppIP(double ppIP){
		pIP =  ppIP;
	   }
	
	public void ppER(double ppER){
		pER =  ppER;
	   }
	
	public void ppK(double ppK){
		pK =  ppK;
	   }
	
	public void ppH(double ppH){
		pH =  ppH;
	   }
	
	public void ppBB(double ppBB){
		pBB =  ppBB;
	   }
	
	public void ppHR(double ppHR){
		pHR =  ppHR;
	   }
	
	
	
	public void printPlayer(){
	      System.out.println("Name: "+ name );
	      System.out.println("Position: " + pos );
	      System.out.println("Games: " + G );
	      System.out.println("PA: " + PA);
	      System.out.println("AB: " + AB);
	      System.out.println("R: " + R);
	      System.out.println("H: " + H);
	      System.out.println("2B: " + doubles);
	      System.out.println("3B: " + triples);
	      System.out.println("HR: " + HR);
	      System.out.println("RBI: " + RBI);
	      System.out.println("SB: " + SB);
	      System.out.println("CS: " + CS);
	      System.out.println("BB: " + BB);
	      System.out.println("SO: " + SO);
	      System.out.println("AVG: " + battingAVG);
	      System.out.println("OBP: " + OBP);
	      System.out.println("SLG: " + SLG);
	      System.out.println("OPS: " + OPS);
	      System.out.println("TB: " + TB);
	      System.out.println("HBP: " + HBP);
	      
	      System.out.println("singleAVG: " + singleAVG);
	      System.out.println("doubleAVG: " + doubleAVG);
	      System.out.println("tripleAVG: " + tripleAVG);
	      System.out.println("HRAVG: " + HRAVG);
	      System.out.println("BBAVG: " + BBAVG);
	      System.out.println("SOAVG: " + SOAVG);
	      System.out.println("HBPAVG: " + HBPAVG);
	      System.out.println("BAavg: " + (singleAVG+doubleAVG+tripleAVG+HRAVG));
	      System.out.println("OBPavg: " + (singleAVG+doubleAVG+tripleAVG+HRAVG+BBAVG+HBPAVG));
	      System.out.println("Steal Attempt Rate: " + StealAttP);
	      System.out.println("Steal Success Rate: " + StealSuccP);
	      System.out.println();

	      if (pos == "P"){
	    	  System.out.println();
	    	  System.out.println("ERA: " + pERA);
		      System.out.println("WHIP: " + pWHIP);
		      System.out.println("K9 diff: " + K9diff);
		      System.out.println("H9 diff: " + H9diff);
		      System.out.println("BB9 diff: " + BB9diff);
		      System.out.println("HR9 diff: " + HR9diff);
	      }
	      
	   }

	public void printGameStats(){
		System.out.println();
		  gameH = gamesingles + gamedoubles + gametriples + gameHR;
	      System.out.println("Name: "+ name );
	      System.out.println("Position: " + pos );
	      System.out.println("PA: " + gamePA);
	      System.out.println("AB: " + gameAB);
	      System.out.println("R: " + gameR);
	      System.out.println("H: " + gameH);
	      System.out.println("1B: " + gamesingles);
	      System.out.println("2B: " + gamedoubles);
	      System.out.println("3B: " + gametriples);
	      System.out.println("HR: " + gameHR);
	      System.out.println("RBI: " + gameRBI);
	      System.out.println("SB: " + gameSB);
	      System.out.println("CS: " + gameCS);
	      System.out.println("BB: " + gameBB);
	      System.out.println("SO: " + gameSO);
	      System.out.println("HBP: " + gameHBP);
	}

}
