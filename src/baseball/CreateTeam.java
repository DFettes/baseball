package baseball;

public class CreateTeam {
	
	public static Team[] NewTeam(Player P, Player C, Player FB, Player SB, Player TB, Player SS, Player LF, Player CF, Player RF){
		Team t1 = new Team("Blue Jays");
				
		t1.tP(P);
		t1.tC(C);
		t1.tFB(FB);
		t1.tSB(SB);
		t1.tTB(TB);
		t1.tSS(SS);
		t1.tLF(LF);
		t1.tCF(CF);
		t1.tRF(RF);//
		Player[] t1battingOrder = {P,C,FB,SB,TB,SS,LF,CF,CF,RF};
		t1.tbattingOrder(t1battingOrder);
				
		t1.tG(0);
		t1.tW(0);
		t1.tL(0);
		
		//t1.printTeam();
		
		
		Team t2 = new Team("Red Sox");
		
		t2.tP(P);
		t2.tC(C);
		t2.tFB(FB);
		t2.tSB(SB);
		t2.tTB(TB);
		t2.tSS(SS);
		t2.tLF(LF);
		t2.tCF(CF);
		t2.tRF(RF);//
		Player[] t2battingOrder = {P,C,FB,SB,TB,SS,LF,CF,CF,RF};
		t2.tbattingOrder(t2battingOrder);
				
		t2.tG(0);
		t2.tW(0);
		t2.tL(0);
		
		//t2.printTeam();
		
		Team[] teams = {t1, t2};
		
		return teams;

	}

}
