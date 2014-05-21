package baseball;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBpull {
	
	static Connection con = null;
	static String url = "jdbc:mysql://localhost:3306/mysql";
    static String user = "root";
    static String password = "";
    
    static ResultSet get_players_rs = null;
    static ResultSet get_pitchers_rs = null;
    static PreparedStatement get_players_pst = null;
    static PreparedStatement get_pitchers_pst = null;
	
	public static Player[] getPlayers(){
		Player[] playerArray = new Player[18];
		
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
	       	get_players_pst = con.prepareStatement("SELECT * FROM baseball.players");
	       	get_players_rs = get_players_pst.executeQuery();
		}catch (SQLException ex) {
            Logger lgr = Logger.getLogger(DBpull.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } 
       	 
		int i = 0;
		
		try {
			while (get_players_rs.next()) {  
				playerArray[i] = new Player(get_players_rs.getString(2) + " " + get_players_rs.getString(3));
				playerArray[i].ppos(get_players_rs.getString(4));
				playerArray[i].pG(get_players_rs.getDouble(5));
				playerArray[i].pPA(get_players_rs.getDouble(6));
				playerArray[i].pAB(get_players_rs.getDouble(7));
				playerArray[i].pR(get_players_rs.getDouble(8));
				playerArray[i].pH(get_players_rs.getDouble(9));
				playerArray[i].pdoubles(get_players_rs.getDouble(10));
				playerArray[i].ptriples(get_players_rs.getDouble(11));
				playerArray[i].pHR(get_players_rs.getDouble(12));
				playerArray[i].pRBI(get_players_rs.getDouble(13));
				playerArray[i].pSB(get_players_rs.getDouble(14));
				playerArray[i].pCS(get_players_rs.getDouble(15));
				playerArray[i].pBB(get_players_rs.getDouble(16));
				playerArray[i].pSO(get_players_rs.getDouble(17));
				playerArray[i].pHBP(get_players_rs.getDouble(18));
				playerArray[i].setStats();
				i++;
				//System.out.println(name);;
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
		
		return playerArray;
	}
	
	
	
	
	public static Player[] getPitchers(){
		Player[] pitcherArray = new Player[12];
		
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
	       	get_pitchers_pst = con.prepareStatement("SELECT * FROM baseball.pitchers");
	       	get_pitchers_rs = get_pitchers_pst.executeQuery();
		}catch (SQLException ex) {
            Logger lgr = Logger.getLogger(DBpull.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } 
       	 
		int i = 0;
		
		try {
			while (get_pitchers_rs.next()) {  
				pitcherArray[i] = new Player(get_pitchers_rs.getString(2) + " " + get_pitchers_rs.getString(3));
				pitcherArray[i].ppos(get_pitchers_rs.getString(4));
				pitcherArray[i].ppIP(get_pitchers_rs.getDouble(5));
				pitcherArray[i].ppER(get_pitchers_rs.getDouble(6));
				pitcherArray[i].ppK(get_pitchers_rs.getDouble(7));
				pitcherArray[i].ppH(get_pitchers_rs.getDouble(8));
				pitcherArray[i].ppBB(get_pitchers_rs.getDouble(9));
				pitcherArray[i].ppHR(get_pitchers_rs.getDouble(10));
				pitcherArray[i].ppHBP(get_pitchers_rs.getDouble(11));
				pitcherArray[i].setPitchingStats();
				i++;
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
		
		return pitcherArray;
	}
}
