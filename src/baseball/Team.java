package baseball;

import java.text.DecimalFormat;

public class Team {
	String name;
	Player P, C, FB, SB, TB, SS, LF, CF, RF;
	Player[] battingOrder;
	double G, W, L, RunsF, RunsA;

		
	public Team(String name){
	      this.name = name;
	   }
	
	public void tP(Player tP){
	      P =  tP;
	   }
	
	public void tC(Player tC){
	      C =  tC;
	   }
	
	public void tFB(Player tFB){
		FB =  tFB;
	   }
	
	public void tSB(Player tSB){
		SB =  tSB;
	   }
	
	public void tTB(Player tTB){
		TB =  tTB;
	   }
	
	public void tSS(Player tSS){
		SS =  tSS;
	   }
	
	public void tLF(Player tLF){
		LF =  tLF;
	   }
	
	public void tCF(Player tCF){
		CF =  tCF;
	   }
	
	public void tRF(Player tRF){
	      RF =  tRF;
	   }
	
	
	public void tbattingOrder(Player[] tbattingOrder){
	      battingOrder =  tbattingOrder;
	   }
	
	
	public void tG(double tG){
	      G =  tG;
	   }
	
	public void tW(double tW){
	      W =  tW;
	   }
	
	public void tL(double tL){
	      L =  tL;
	   }

	
	
	public void printTeam(){
		DecimalFormat twoDForm = new DecimalFormat();
		twoDForm.setMaximumIntegerDigits(1);
		twoDForm.setMinimumIntegerDigits(0);
		twoDForm.setMaximumFractionDigits(3);
		twoDForm.setMinimumFractionDigits(3);
		
	      System.out.println("Team Name: "+ name );
	      /*System.out.println("P: "+ P.name );
	      System.out.println("C: "+ C.name );
	      System.out.println("1B: "+ FB.name );
	      System.out.println("2B: "+ SB.name );
	      System.out.println("3B: "+ TB.name );
	      System.out.println("SS: "+ SS.name );
	      System.out.println("LF: "+ LF.name );
	      System.out.println("CF: "+ CF.name );
	      System.out.println("RF: "+ RF.name );
	      */
	      System.out.println("Wins: " + (int)W );
	      System.out.println("Losses: " + (int)L );
	      System.out.println("Runs For Per Game: " + twoDForm.format(RunsF/G) );
	      System.out.println("Runs Against Per Game: " + twoDForm.format(RunsA/G) );
	   }

}
