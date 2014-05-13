package baseball;

import java.text.DecimalFormat;

public class MainSetup {
	
	public static void simSeason(Team t1, Team t2){
		
		DecimalFormat twoDForm = new DecimalFormat();
		twoDForm.setMaximumIntegerDigits(1);
		twoDForm.setMinimumIntegerDigits(0);
		twoDForm.setMaximumFractionDigits(3);
		twoDForm.setMinimumFractionDigits(3);

		
		for (int games = 0; games <162; games++){
			for (int i=0; i<9; i++){
				t1.battingOrder[i].gamePA=t1.battingOrder[i].gameAB=t1.battingOrder[i].gameR=t1.battingOrder[i].gameH=t1.battingOrder[i].gamesingles=t1.battingOrder[i].gamedoubles=t1.battingOrder[i].gametriples=t1.battingOrder[i].gameHR=t1.battingOrder[i].gameRBI=t1.battingOrder[i].gameSB=t1.battingOrder[i].gameCS=t1.battingOrder[i].gameBB=t1.battingOrder[i].gameSO=t1.battingOrder[i].gameHBP=0;
				t2.battingOrder[i].gamePA=t2.battingOrder[i].gameAB=t2.battingOrder[i].gameR=t2.battingOrder[i].gameH=t2.battingOrder[i].gamesingles=t2.battingOrder[i].gamedoubles=t2.battingOrder[i].gametriples=t2.battingOrder[i].gameHR=t2.battingOrder[i].gameRBI=t2.battingOrder[i].gameSB=t2.battingOrder[i].gameCS=t2.battingOrder[i].gameBB=t2.battingOrder[i].gameSO=t2.battingOrder[i].gameHBP=0;
			}
			Game.NewGame(t1, t2);
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
		}
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

		System.out.println();
	    t1.printTeam();
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
		
		Player p10 = playerArray[9];
		Player p11 = playerArray[10];
		Player p12 = playerArray[11];
		Player p13 = playerArray[12];
		Player p14 = playerArray[13];
		Player p15 = playerArray[14];
		Player p16 = playerArray[15];
		Player p17 = playerArray[16];
		Player p18 = playerArray[17];
		
		Team t1 = CreateTeam.NewTeam("Blue Jays", p10,p12,p11,p13,p16,p18,p14,p15,p17);
		Team t2 = CreateTeam.NewTeam("Legends", p4,p3,p5,p2,p8,p1,p9,p6,p7);
		
		p18.printPlayer();
		p18.setAdjStats();
		
		
		//p10.printGameStats();
		
		//Game.NewGame(t1, t2);
		//simSeason(t1, t2);
	      
	      
	}

}
