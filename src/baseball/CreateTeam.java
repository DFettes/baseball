package baseball;

public class CreateTeam {
	
	public static Team NewTeam(String name, Player[] P, Player DH, Player C, Player FB, Player SB, Player TB, Player SS, Player LF, Player CF, Player RF){
		
		Team t1 = new Team(name);
				
		//t1.tP(P);
		t1.tDH(DH);
		t1.tC(C);
		t1.tFB(FB);
		t1.tSB(SB);
		t1.tTB(TB);
		t1.tSS(SS);
		t1.tLF(LF);
		t1.tCF(CF);
		t1.tRF(RF);//
		Player[] t1battingOrder = {DH,C,FB,SB,TB,SS,LF,CF,RF};
		t1.tbattingOrder(t1battingOrder);
		Player[] t1pitchingRotation = {P[0],P[1],P[2],P[3],P[4]};
		t1.tpitchingRotation(t1pitchingRotation);
				
		t1.tG(0);
		t1.tW(0);
		t1.tL(0);
		
		//t1.printTeam();
		System.out.println();
		

		
		return t1;

	}

}
