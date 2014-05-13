package baseball;

import java.text.DecimalFormat;

public class MainSetup {
	
	public static void simSeason(Team t1, Team t2){
		
		int pitcher1, pitcher2;
		pitcher1 = pitcher2 = 0;
		
		DecimalFormat twoDForm = new DecimalFormat();
		twoDForm.setMaximumIntegerDigits(2);
		twoDForm.setMinimumIntegerDigits(0);
		twoDForm.setMaximumFractionDigits(3);
		twoDForm.setMinimumFractionDigits(3);

		
		for (int games = 0; games <162; games++){
			for (int i=0; i<9; i++){
				t1.battingOrder[i].gamePA=t1.battingOrder[i].gameAB=t1.battingOrder[i].gameR=t1.battingOrder[i].gameH=t1.battingOrder[i].gamesingles=t1.battingOrder[i].gamedoubles=t1.battingOrder[i].gametriples=t1.battingOrder[i].gameHR=t1.battingOrder[i].gameRBI=t1.battingOrder[i].gameSB=t1.battingOrder[i].gameCS=t1.battingOrder[i].gameBB=t1.battingOrder[i].gameSO=t1.battingOrder[i].gameHBP=0;
				t2.battingOrder[i].gamePA=t2.battingOrder[i].gameAB=t2.battingOrder[i].gameR=t2.battingOrder[i].gameH=t2.battingOrder[i].gamesingles=t2.battingOrder[i].gamedoubles=t2.battingOrder[i].gametriples=t2.battingOrder[i].gameHR=t2.battingOrder[i].gameRBI=t2.battingOrder[i].gameSB=t2.battingOrder[i].gameCS=t2.battingOrder[i].gameBB=t2.battingOrder[i].gameSO=t2.battingOrder[i].gameHBP=0;
			}
			t1.pitchingRotation[pitcher1].gamepIP=t1.pitchingRotation[pitcher1].gamepER=t1.pitchingRotation[pitcher1].gamepK=t1.pitchingRotation[pitcher1].gamepH=t1.pitchingRotation[pitcher1].gamepBB=t1.pitchingRotation[pitcher1].gamepHBP=t1.pitchingRotation[pitcher1].gamepHR=t1.pitchingRotation[pitcher1].gamepERA=t1.pitchingRotation[pitcher1].gamepWHIP=t1.pitchingRotation[pitcher1].gamepK9=t1.pitchingRotation[pitcher1].gamepH9=t1.pitchingRotation[pitcher1].gamepBB9=t1.pitchingRotation[pitcher1].gamepHR9 = 0;
			t2.pitchingRotation[pitcher2].gamepIP=t2.pitchingRotation[pitcher2].gamepER=t2.pitchingRotation[pitcher2].gamepK=t2.pitchingRotation[pitcher2].gamepH=t2.pitchingRotation[pitcher2].gamepBB=t2.pitchingRotation[pitcher2].gamepHBP=t2.pitchingRotation[pitcher2].gamepHR=t2.pitchingRotation[pitcher2].gamepERA=t2.pitchingRotation[pitcher2].gamepWHIP=t2.pitchingRotation[pitcher2].gamepK9=t2.pitchingRotation[pitcher2].gamepH9=t2.pitchingRotation[pitcher2].gamepBB9=t2.pitchingRotation[pitcher2].gamepHR9 = 0;

			
			Game.NewGame(t1, t2, pitcher1, pitcher2);
			for (int i=0; i<9; i++){
				t1.battingOrder[i].seasonPA+=t1.battingOrder[i].gamePA;
				t1.battingOrder[i].seasonAB+=t1.battingOrder[i].gameAB;
				t1.battingOrder[i].seasonR+=t1.battingOrder[i].gameR;
				t1.battingOrder[i].seasonH+=t1.battingOrder[i].gameH;
				t1.battingOrder[i].seasonsingles+=t1.battingOrder[i].gamesingles;
				t1.battingOrder[i].seasondoubles+=t1.battingOrder[i].gamedoubles;
				t1.battingOrder[i].seasontriples+=t1.battingOrder[i].gametriples;
				t1.battingOrder[i].seasonHR+=t1.battingOrder[i].gameHR;
				t1.battingOrder[i].seasonRBI+=t1.battingOrder[i].gameRBI;
				t1.battingOrder[i].seasonSB+=t1.battingOrder[i].gameSB;
				t1.battingOrder[i].seasonCS+=t1.battingOrder[i].gameCS;
				t1.battingOrder[i].seasonBB+=t1.battingOrder[i].gameBB;
				t1.battingOrder[i].seasonSO+=t1.battingOrder[i].gameSO;
				t1.battingOrder[i].seasonHBP+=t1.battingOrder[i].gameHBP;
				
				t2.battingOrder[i].seasonPA+=t2.battingOrder[i].gamePA;
				t2.battingOrder[i].seasonAB+=t2.battingOrder[i].gameAB;
				t2.battingOrder[i].seasonR+=t2.battingOrder[i].gameR;
				t2.battingOrder[i].seasonH+=t2.battingOrder[i].gameH;
				t2.battingOrder[i].seasonsingles+=t2.battingOrder[i].gamesingles;
				t2.battingOrder[i].seasondoubles+=t2.battingOrder[i].gamedoubles;
				t2.battingOrder[i].seasontriples+=t2.battingOrder[i].gametriples;
				t2.battingOrder[i].seasonHR+=t2.battingOrder[i].gameHR;
				t2.battingOrder[i].seasonRBI+=t2.battingOrder[i].gameRBI;
				t2.battingOrder[i].seasonSB+=t2.battingOrder[i].gameSB;
				t2.battingOrder[i].seasonCS+=t2.battingOrder[i].gameCS;
				t2.battingOrder[i].seasonBB+=t2.battingOrder[i].gameBB;
				t2.battingOrder[i].seasonSO+=t2.battingOrder[i].gameSO;
				t2.battingOrder[i].seasonHBP+=t2.battingOrder[i].gameHBP;
			}
			t1.pitchingRotation[pitcher1].seasonpIP += t1.pitchingRotation[pitcher1].gamepIP;
			t1.pitchingRotation[pitcher1].seasonpER += t1.pitchingRotation[pitcher1].gamepER;
			t1.pitchingRotation[pitcher1].seasonpK += t1.pitchingRotation[pitcher1].gamepK;
			t1.pitchingRotation[pitcher1].seasonpH += t1.pitchingRotation[pitcher1].gamepH;
			t1.pitchingRotation[pitcher1].seasonpBB += t1.pitchingRotation[pitcher1].gamepBB;
			t1.pitchingRotation[pitcher1].seasonpHBP += t1.pitchingRotation[pitcher1].gamepHBP;
			t1.pitchingRotation[pitcher1].seasonpHR += t1.pitchingRotation[pitcher1].gamepHR;
			
			t2.pitchingRotation[pitcher2].seasonpIP += t2.pitchingRotation[pitcher2].gamepIP;
			t2.pitchingRotation[pitcher2].seasonpER += t2.pitchingRotation[pitcher2].gamepER;
			t2.pitchingRotation[pitcher2].seasonpK += t2.pitchingRotation[pitcher2].gamepK;
			t2.pitchingRotation[pitcher2].seasonpH += t2.pitchingRotation[pitcher2].gamepH;
			t2.pitchingRotation[pitcher2].seasonpBB += t2.pitchingRotation[pitcher2].gamepBB;
			t2.pitchingRotation[pitcher2].seasonpHBP += t2.pitchingRotation[pitcher2].gamepHBP;
			t2.pitchingRotation[pitcher2].seasonpHR += t2.pitchingRotation[pitcher2].gamepHR;
		
			pitcher1++;
			pitcher2++;
			if (pitcher1 == 5){
				pitcher1 = 0;
			}
			if (pitcher2 == 5){
				pitcher2 = 0;
			}
		}
		System.out.println();
		System.out.println(t1.name);
		System.out.println("Player-------------PA---AB---R---H---RBI---1B---2B---3B---HR---SB---CS---BB---SO---HBP----AVG----OBP---TB----SLG----OPS");
		for (int i=0; i<9; i++){
			t1.battingOrder[i].seasonH = t1.battingOrder[i].seasonsingles + t1.battingOrder[i].seasondoubles + t1.battingOrder[i].seasontriples + t1.battingOrder[i].seasonHR;
			t1.battingOrder[i].seasonBattingAVG = t1.battingOrder[i].seasonH/t1.battingOrder[i].seasonAB;
			t1.battingOrder[i].seasonOBP = (t1.battingOrder[i].seasonH + t1.battingOrder[i].seasonBB + t1.battingOrder[i].seasonHBP)/t1.battingOrder[i].seasonPA;
			t1.battingOrder[i].seasonTB = t1.battingOrder[i].seasonsingles + 2*t1.battingOrder[i].seasondoubles + 3*t1.battingOrder[i].seasontriples + 4*t1.battingOrder[i].seasonHR;
			t1.battingOrder[i].seasonSLG = t1.battingOrder[i].seasonTB/t1.battingOrder[i].seasonAB;
			t1.battingOrder[i].seasonOPS = t1.battingOrder[i].seasonOBP + t1.battingOrder[i].seasonSLG;
			System.out.format("%-18s%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-6d%-5d%-7s%-7s%-5d%-7s%-7s", t1.battingOrder[i].name, (int)t1.battingOrder[i].seasonPA, (int)t1.battingOrder[i].seasonAB, (int)t1.battingOrder[i].seasonR, (int)t1.battingOrder[i].seasonH, (int)t1.battingOrder[i].seasonRBI, (int)t1.battingOrder[i].seasonsingles, (int)t1.battingOrder[i].seasondoubles, (int)t1.battingOrder[i].seasontriples, (int)t1.battingOrder[i].seasonHR, (int)t1.battingOrder[i].seasonSB, (int)t1.battingOrder[i].seasonCS, (int)t1.battingOrder[i].seasonBB, (int)t1.battingOrder[i].seasonSO, (int)t1.battingOrder[i].seasonHBP, twoDForm.format(t1.battingOrder[i].seasonBattingAVG), twoDForm.format(t1.battingOrder[i].seasonOBP), (int)t1.battingOrder[i].seasonTB, twoDForm.format(t1.battingOrder[i].seasonSLG), twoDForm.format(t1.battingOrder[i].seasonOPS));
			System.out.println();
		}
		for (int i=0; i<5; i++){
			t1.pitchingRotation[i].setSeasonPitchingStats();
			System.out.println();
			System.out.println("Pitcher-------------GS---W---L---IP---H---ER---BB---HBP---K---HR----ERA----WHIP----K9----BB9");
			System.out.format("%-20s%-5d%-4d%-4d%-4d%-5d%-5d%-5d%-5d%-5d%-5d%-7s%-7s%-7s%-7s", t1.pitchingRotation[i].name, (int)t1.pitchingRotation[i].seasonGS, (int)t1.pitchingRotation[i].seasonW, (int)t1.pitchingRotation[i].seasonL, (int)t1.pitchingRotation[i].seasonpIP, (int)t1.pitchingRotation[i].seasonpH, (int)t1.pitchingRotation[i].seasonpER, (int)t1.pitchingRotation[i].seasonpBB, (int)t1.pitchingRotation[i].seasonpHBP, (int)t1.pitchingRotation[i].seasonpK, (int)t1.pitchingRotation[i].seasonpHR, twoDForm.format(t1.pitchingRotation[i].seasonpERA), twoDForm.format(t1.pitchingRotation[i].seasonpWHIP), twoDForm.format(t1.pitchingRotation[i].seasonpK9), twoDForm.format(t1.pitchingRotation[i].seasonpBB9));	
			System.out.println();
		}
		
		System.out.println();
		System.out.println(t2.name);
		System.out.println("Player-------------PA---AB---R---H---RBI---1B---2B---3B---HR---SB---CS---BB---SO---HBP----AVG----OBP---TB----SLG----OPS");
		for (int i=0; i<9; i++){
			t2.battingOrder[i].seasonH = t2.battingOrder[i].seasonsingles + t2.battingOrder[i].seasondoubles + t2.battingOrder[i].seasontriples + t2.battingOrder[i].seasonHR;
			t2.battingOrder[i].seasonBattingAVG = t2.battingOrder[i].seasonH/t2.battingOrder[i].seasonAB;
			t2.battingOrder[i].seasonOBP = (t2.battingOrder[i].seasonH + t2.battingOrder[i].seasonBB + t2.battingOrder[i].seasonHBP)/t2.battingOrder[i].seasonPA;
			t2.battingOrder[i].seasonTB = t2.battingOrder[i].seasonsingles + 2*t2.battingOrder[i].seasondoubles + 3*t2.battingOrder[i].seasontriples + 4*t2.battingOrder[i].seasonHR;
			t2.battingOrder[i].seasonSLG = t2.battingOrder[i].seasonTB/t2.battingOrder[i].seasonAB;
			t2.battingOrder[i].seasonOPS = t2.battingOrder[i].seasonOBP + t2.battingOrder[i].seasonSLG;
			System.out.format("%-18s%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-5d%-6d%-5d%-7s%-7s%-5d%-7s%-7s", t2.battingOrder[i].name, (int)t2.battingOrder[i].seasonPA, (int)t2.battingOrder[i].seasonAB, (int)t2.battingOrder[i].seasonR, (int)t2.battingOrder[i].seasonH, (int)t2.battingOrder[i].seasonRBI, (int)t2.battingOrder[i].seasonsingles, (int)t2.battingOrder[i].seasondoubles, (int)t2.battingOrder[i].seasontriples, (int)t2.battingOrder[i].seasonHR, (int)t2.battingOrder[i].seasonSB, (int)t2.battingOrder[i].seasonCS, (int)t2.battingOrder[i].seasonBB, (int)t2.battingOrder[i].seasonSO, (int)t2.battingOrder[i].seasonHBP, twoDForm.format(t2.battingOrder[i].seasonBattingAVG), twoDForm.format(t2.battingOrder[i].seasonOBP), (int)t2.battingOrder[i].seasonTB, twoDForm.format(t2.battingOrder[i].seasonSLG), twoDForm.format(t2.battingOrder[i].seasonOPS));
			System.out.println();
		}
		
		for (int i=0; i<5; i++){
			t2.pitchingRotation[i].setSeasonPitchingStats();
			System.out.println();
			System.out.println("Pitcher-------------GS---W---L---IP---H---ER---BB---HBP---K---HR----ERA----WHIP----K9----BB9");
			System.out.format("%-20s%-5d%-4d%-4d%-4d%-5d%-5d%-5d%-5d%-5d%-5d%-7s%-7s%-7s%-7s", t2.pitchingRotation[i].name, (int)t2.pitchingRotation[i].seasonGS, (int)t2.pitchingRotation[i].seasonW, (int)t2.pitchingRotation[i].seasonL, (int)t2.pitchingRotation[i].seasonpIP, (int)t2.pitchingRotation[i].seasonpH, (int)t2.pitchingRotation[i].seasonpER, (int)t2.pitchingRotation[i].seasonpBB, (int)t2.pitchingRotation[i].seasonpHBP, (int)t2.pitchingRotation[i].seasonpK, (int)t2.pitchingRotation[i].seasonpHR, twoDForm.format(t2.pitchingRotation[i].seasonpERA), twoDForm.format(t2.pitchingRotation[i].seasonpWHIP), twoDForm.format(t2.pitchingRotation[i].seasonpK9), twoDForm.format(t2.pitchingRotation[i].seasonpBB9));	
			System.out.println();
		}

		System.out.println();
	    t1.printTeam();
	    //System.out.println();
	    //t2.printTeam();
	    //System.out.println(t2.name + " Wins: " + t2.W);
	}
	
	
	
	
	public static void main(String[] args) {
		Player[] playerArray = CreatePlayer.CreatePlayers();
		Player p1 = playerArray[0];
		Player p2 = playerArray[1];
		Player p3 = playerArray[2];
		Player p4 = playerArray[3];
		Player p5 = playerArray[4];
		Player p6 = playerArray[5];
		Player p7 = playerArray[6];
		Player p8 = playerArray[7];
		Player p9 = playerArray[8];
		
		Player p19 = playerArray[18];
		Player p20 = playerArray[19];
		Player p21 = playerArray[20];
		Player p22 = playerArray[21];
		Player p23 = playerArray[22];
		
		
		Player p10 = playerArray[9];
		Player p11 = playerArray[10];
		Player p12 = playerArray[11];
		Player p13 = playerArray[12];
		Player p14 = playerArray[13];
		Player p15 = playerArray[14];
		Player p16 = playerArray[15];
		Player p17 = playerArray[16];
		Player p18 = playerArray[17];
		
		Player p24 = playerArray[23];
		Player p25 = playerArray[24];
		Player p26 = playerArray[25];
		Player p27 = playerArray[26];
		Player p28 = playerArray[27];
		
		Player[] t1PRot = {p19,p22,p20,p24,p27};
		Player[] t2PRot = {p25,p23,p28,p26,p21};
		
		Team t1 = CreateTeam.NewTeam("Blue Jays", t1PRot, p10,p12,p11,p13,p16,p18,p14,p15,p17);
		Team t2 = CreateTeam.NewTeam("Legends", t2PRot, p4,p3,p5,p2,p8,p1,p9,p6,p7);
		
		//p10.printPlayer();
		//.setAdjStats();
		
		//t1.printTeam();
		//t2.printTeam();
		//p10.printGameStats();
		
		//Game.NewGame(t1, t2, 0, 0);
		simSeason(t1, t2);
	      
	      
	}

}
