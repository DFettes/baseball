package baseball;

import java.io.*;

public class Player {
	String name, pos;
	double G, PA, AB, R, H, doubles, triples, HR, RBI, SB, CS, BB, SO, HBP;
	double singles, battingAVG, singleAVG, doubleAVG, tripleAVG, HRAVG, BBAVG, SOAVG, HBPAVG, OBP, SLG, OPS, TB;
	
	public void setStats() {
		if (PA > 0) {
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
		}
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
	      System.out.println("OBPavg: " + (singleAVG+doubleAVG+tripleAVG+HRAVG+BBAVG+HBPAVG));
	      

	      
	      
	   }

}
