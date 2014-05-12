package baseball;

public class MainSetup {
	
	
	public static void simSeason(Team t1, Team t2, Player p){
		double seasonG, seasonPA, seasonAB, seasonR, seasonH, seasonsingles, seasondoubles, seasontriples, seasonHR, seasonRBI, seasonSB, seasonCS, seasonBB, seasonSO, seasonHBP;
		double battingAVG, OBP, TB, SLG, OPS;
		seasonG=seasonPA=seasonAB=seasonR=seasonH=seasonsingles=seasondoubles=seasontriples=seasonHR=seasonRBI=seasonSB=seasonCS=seasonBB=seasonSO=seasonHBP=0;
		for (int games = 0; games <162; games++){
			p.gamePA=p.gameAB=p.gameR=p.gameH=p.gamesingles=p.gamedoubles=p.gametriples=p.gameHR=p.gameRBI=p.gameSB=p.gameCS=p.gameBB=p.gameSO=p.gameHBP=0;
			Game.NewGame(t1, t2);
			p.printGameStats();
			seasonG++;
			seasonPA+=p.gamePA;
			seasonAB+=p.gameAB;
			seasonR+=p.gameR;
			seasonH+=p.gameH;
			seasonsingles+=p.gamesingles;
			seasondoubles+=p.gamedoubles;
			seasontriples+=p.gametriples;
			seasonHR+=p.gameHR;
			seasonRBI+=p.gameRBI;
			seasonSB+=p.gameSB;
			seasonCS+=p.gameCS;
			seasonBB+=p.gameBB;
			seasonSO+=p.gameSO;
			seasonHBP+=p.gameHBP;
		}
		battingAVG = seasonH/seasonAB;
		OBP = (seasonH + seasonBB + seasonHBP)/seasonPA;
		TB = seasonsingles + 2*seasondoubles + 3*seasontriples + 4*seasonHR;
		SLG = TB/seasonAB;
		OPS = OBP + SLG;
		
		System.out.println();
		
		System.out.println("Name: "+ p.name );
	      System.out.println("Position: " + p.pos );
	      System.out.println("G: " + seasonG);
	      System.out.println("PA: " + seasonPA);
	      System.out.println("AB: " + seasonAB);
	      System.out.println("R: " + seasonR);
	      System.out.println("H: " + seasonH);
	      System.out.println("1B: " + seasonsingles);
	      System.out.println("2B: " + seasondoubles);
	      System.out.println("3B: " + seasontriples);
	      System.out.println("HR: " + seasonHR);
	      System.out.println("RBI: " + seasonRBI);
	      System.out.println("SB: " + seasonSB);
	      System.out.println("CS: " + seasonCS);
	      System.out.println("BB: " + seasonBB);
	      System.out.println("SO: " + seasonSO);
	      System.out.println("HBP: " + seasonHBP);
	      System.out.println();
	      System.out.println("AVG: " + battingAVG);
	      System.out.println("OBP: " + OBP);
	      System.out.println("SLG: " + SLG);
	      System.out.println("OPS: " + OPS);
	      System.out.println("TB: " + TB);
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
		Team t2 = CreateTeam.NewTeam("Legends", p1,p2,p3,p4,p5,p6,p7,p8,p9);
		Game.NewGame(t1, t2);
		
		//p10.printGameStats();
		
		
		//simSeason(t1, t2, p16);
	      
	      
	}

}
