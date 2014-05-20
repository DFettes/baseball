package baseball;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class testDesign {
	static Team t1;
	static Team t2;
	static int BatterUp;
	static int pitcher;
	static boolean homeChance;
	static int homeDef;
	String[] results = {"Singled", "Doubled", "Tripled", "Homered", "Walked", "Hit By Pitch", "Struck Out", "Out", "Grounded Out", "Flied Out"};
	int outs; 
	int i;
	String location;
	
	Player run1b;
	Player run2b;
	Player run3b;
	//int[] runsBatter = new int [3];
	double inning;
	int team1Score;
	int team2Score;
	int batterUp1;
	int batterUp2;
	int inningpitcher1;
	int inningpitcher2;
	Team team1;
	Team team2;
	int pitcher1;
	int pitcher2;

	
	
	
	private JFrame frame;
	private JTextArea textAreaOuts;
	private JTextArea textAreaRuns1;
	private JTextArea textAreaRuns2;
	private JTextArea textAreaPBP;
	private JTextArea firstBase;
	private JTextArea secondBase;
	private JTextArea thirdBase;
	private JTextArea homeBase;
	private JTextArea inningText;
	private JLabel JLabelRuns1;
	private JLabel JLabelRuns2;
	private JLabel JLabelOuts;
	private JLabel JLabelInning;
	JScrollPane jScrollPane=new JScrollPane();
	private JButton nextInning;
	
	
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
	{
		textAreaOuts = new JTextArea();
		textAreaOuts.setEditable(false);
		textAreaOuts.setBounds(57, 128, 28, 22);
		frame.getContentPane().add(textAreaOuts);
	}
	{
		textAreaRuns1 = new JTextArea();
		textAreaRuns1.setEditable(false);
		textAreaRuns1.setBounds(94, 11, 28, 22);
		frame.getContentPane().add(textAreaRuns1);
	}
	{
		textAreaRuns2 = new JTextArea();
		textAreaRuns2.setEditable(false);
		textAreaRuns2.setBounds(94, 44, 28, 22);
		frame.getContentPane().add(textAreaRuns2);
		}
	{
		textAreaPBP = new JTextArea();
		textAreaPBP.setAutoscrolls(false);
		textAreaPBP.setEditable(false);
		textAreaPBP.setBounds(10, 157, 414, 105);
	}
	{
		firstBase = new JTextArea();
		firstBase.setAutoscrolls(false);
		firstBase.setEditable(false);
		firstBase.setBounds(391, 63, 20, 20);
		frame.getContentPane().add(firstBase);
	}
	{
		secondBase = new JTextArea();
		secondBase.setAutoscrolls(false);
		secondBase.setEditable(false);
		secondBase.setBounds(334, 11, 20, 20);
		frame.getContentPane().add(secondBase);
	}
	{
		thirdBase = new JTextArea();
		thirdBase.setAutoscrolls(false);
		thirdBase.setEditable(false);
		thirdBase.setBounds(276, 63, 20, 20);
		frame.getContentPane().add(thirdBase);
	}
	{
		homeBase = new JTextArea();
		homeBase.setAutoscrolls(false);
		homeBase.setEditable(false);
		homeBase.setBounds(334, 117, 20, 20);
		frame.getContentPane().add(homeBase);
	}
	{
		inningText = new JTextArea();
		inningText.setEditable(false);
		inningText.setBounds(57, 95, 28, 22);
		frame.getContentPane().add(inningText);
	}
	{
	}
	{
		JScrollPane scrollPane = new JScrollPane(textAreaPBP);
		scrollPane.setLocation(0, 159);
		scrollPane.setSize(434, 100);
		frame.getContentPane().add(scrollPane);
	}
	{
		JLabelRuns1 = new JLabel();
		JLabelRuns1.setForeground(Color.WHITE);
		JLabelRuns1.setText(t1.name);
		JLabelRuns1.setBounds(10, 12, 74, 22);
		frame.getContentPane().add(JLabelRuns1);
	}
	{
		JLabelRuns2 = new JLabel();
		JLabelRuns2.setForeground(Color.WHITE);
		JLabelRuns2.setText(t2.name);
		JLabelRuns2.setBounds(10, 44, 74, 22);
		frame.getContentPane().add(JLabelRuns2);
	}
	{
		JLabelOuts = new JLabel();
		JLabelOuts.setForeground(Color.WHITE);
		JLabelOuts.setText("Outs");
		JLabelOuts.setBounds(10, 129, 51, 22);
		frame.getContentPane().add(JLabelOuts);
	}
	{
		JLabelInning = new JLabel();
		JLabelInning.setForeground(Color.WHITE);
		JLabelInning.setText("Inning");
		JLabelInning.setBounds(10, 96, 51, 22);
		frame.getContentPane().add(JLabelInning);
		}
	{
		nextInning = new JButton();
		nextInning.setForeground(Color.BLACK);
		nextInning.setText("Next Inning");
		nextInning.setBounds(105, 96, 104, 22);
		frame.getContentPane().add(nextInning);
	}
	
	/**
	 * Launch the application.
	 */
	
	public static void main(Team team1, Team team2, int BUp, int p, boolean homeC, int homeD) {
		t1 = team1;
		t2 = team2;
		BatterUp = BUp;
		pitcher = p;
		homeChance = homeC;
		homeDef = homeD;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testDesign window = new testDesign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public testDesign() {
		//NewInning(t1,t2,0,0,false,0);
		NewGame(t1,t2,0,0);
	}
			
	
	
	public void NewGame(Team t1, Team t2, int p1, int p2){
		
		inning = 0;
		team1Score=0;
		team2Score=0;
		team1 = t1;
		team2 = t2;
		inningpitcher1 = p1;
		inningpitcher2 = p2;
		batterUp1 = 0;
		batterUp2 = 0;
		
		System.out.println("Pitching for the " + team1.name + ": " + team1.pitchingRotation[p1].name);
		System.out.println("Pitching for the " + team2.name + ": " + team2.pitchingRotation[p2].name);
		System.out.println();
		
		
		nextInning.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				inning+=0.5;
				if (inning < 10 || team1Score == team2Score){
					if ((2*inning) % 2 != 0){
						System.out.println("TOP OF INNING " + inning);
						int[] inningArray1 = NewInning(team1, team2, false, 0);
						int score1Inc = inningArray1[0];
						inningpitcher2 = inningArray1[2];
						team1Score += team1.runsBatter[0];
						batterUp1 = inningArray1[1];
						team2.pitchingRotation[inningpitcher2].gamepIP++;
					}
					else {
						System.out.println("TOP OF INNING " + inning);
						int[] inningArray2 = NewInning(team2, team1, false, 0);
						int score2Inc = inningArray2[0];
						inningpitcher1 = inningArray2[2];
						team2Score += team2.runsBatter[0];
						batterUp2 = inningArray2[1];
						team1.pitchingRotation[inningpitcher1].gamepIP++;
					}
					
					/*if (inning > 8 && team1Score >= team2Score){
						System.out.println(team1.name + ": " + team1Score);
						System.out.println(team2.name + ": " + team2Score);
						System.out.println();
						
						int homeDef = team1Score-team2Score;
						System.out.println("BOTTOM OF INNING " + inning);
						int[] inningArray2 = NewInning(team2, team1, batterUp2, inningpitcher1, true, homeDef);			
						int score2Inc = inningArray2[0];
						inningpitcher1 = inningArray2[2];
						team2Score += score2Inc;			
						batterUp2 = inningArray2[1];
						team1.pitchingRotation[inningpitcher1].gamepIP++;
					}
					else if (inning > 8 && team1Score < team2Score){
						//home team doesn't need at bats, game over
					}
					else{
						System.out.println(team1.name + ": " + team1Score);
						System.out.println(team2.name + ": " + team2Score);
						System.out.println();
						
						System.out.println("BOTTOM OF INNING " + inning);
						int[] inningArray2 = NewInning(team2, team1, batterUp2, inningpitcher1, false, 0);			
						int score2Inc = inningArray2[0];
						inningpitcher1 = inningArray2[2];
						team2Score += score2Inc;			
						batterUp2 = inningArray2[1];
						team1.pitchingRotation[inningpitcher1].gamepIP++;
					}*/
					System.out.println("END OF INNING " + inning);
					System.out.println(team1.name + ": " + team1Score);
					System.out.println(team2.name + ": " + team2Score);
					System.out.println();
				}
				
			}
		});
		
		

		
		
		if (team1Score > team2Score){
			System.out.println(team1.name + " Win!");
			team1.W++;
			team2.L++;
			team1.pitchingRotation[pitcher1].seasonGS++;
			team1.pitchingRotation[pitcher1].seasonW++;
			team2.pitchingRotation[pitcher2].seasonGS++;
			team2.pitchingRotation[pitcher2].seasonL++;
		}
		else {
			System.out.println(team2.name + " Win!");
			team2.W++;
			team1.L++;
			team2.pitchingRotation[pitcher2].seasonGS++;
			team2.pitchingRotation[pitcher2].seasonW++;
			team1.pitchingRotation[pitcher1].seasonGS++;
			team1.pitchingRotation[pitcher1].seasonL++;
		}
		team1.G++;
		team2.G++;
		team1.RunsF+=team1Score;
		team1.RunsA+=team2Score;
		team2.RunsF+=team2Score;
		team2.RunsA+=team1Score;
		
		System.out.println();
	}
	
	
	
	public int[] NewInning(final Team tea1, Team tea2, boolean homeC, int homeD){
		textAreaRuns1.setText("   "+ team1.runsBatter[0]);
		textAreaRuns2.setText("   "+ team2.runsBatter[0]);
    	textAreaOuts.setText("   "+ 0);
    	textAreaPBP.setText("");
    	inningText.setText("   "+ inning);
    	outs = 0;
    	t1 = tea1;
		t2 = tea2;

		run1b = null;
		run2b = null;
		run3b = null;
		
		
		
			Timer t = new Timer(1500, new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					if (outs<3){
						if (t1.runsBatter[2] != pitcher){
							t1.runsBatter[2] = pitcher;
							System.out.println("NEW PITCHER: " + t2.pitchingRotation[pitcher].name);
						}
			
						String runResult = null;
			
						if (run1b!=null && run2b==null){
							int outcome = RunningRolls.Run(run1b, 1);
							if (outcome == 1){
								runResult = run1b.name + " Stole Second Base!";
								run1b.gameSB++;
								run2b = run1b;
								run1b = null;
							}
							else if (outcome == 2){
								runResult= run1b.name + " Caught Stealing Second Base!";
								run1b.gameCS++;
								run1b = null;
								outs++;
							}
						}
						
						else if (run2b!=null && run3b==null && outs < 2){
							int outcome = RunningRolls.Run(run2b, 2);
							if (outcome == 1){
								runResult = run2b.name + " Stole Third Base!";
								run2b.gameSB++;
								run3b = run2b;
								run2b = null;
							}
							else if (outcome == 2){
								runResult = run2b.name + " Caught Stealing Third Base!";
								run2b.gameCS++;
								run2b = null;
								outs++;
							}
						}
						String result;
						if (runResult!= null){
							result = runResult;
						}
						else {
							Player p1 = t1.battingOrder[t1.runsBatter[1]];
							Player p2 = t2.pitchingRotation[t1.runsBatter[2]];
							int resultCode = AtBat.NewAtBat(p1, p2);
							location = Inning.getLocation(resultCode);
							//RESULT
							result = (p1.name + " " + results[resultCode-1] + location);
							//System.out.println();
							
							if (resultCode > 6){
								if (resultCode == 7){
									p1.gameSO++;
									p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
									t2.pitchingRotation[pitcher].gamepK++;
								}
								else if (resultCode == 10 && run3b!=null && outs < 2){
									location = Inning.getLocation(11);
									double randomSacFly = Math.random();
									if (randomSacFly < run3b.StealSuccP){
										t1.runsBatter[0]++;
										result = (p1.name + " Hit Sacrifice Fly" + location + ", " + run3b.name + " Scored");
										run3b.gameR++;
										p1.gameRBI++;
										t2.pitchingRotation[pitcher].gamepER++;
									}
									else {
										outs++;
										result = (result + ", " + run3b.name + " Thrown Out At Home");
										p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
									}
									run3b = null;
								}
								else if (resultCode == 9 && outs < 2){
									if (run1b!=null && run2b!=null && run3b!=null){
										double randomBeatOutDP = Math.random();
										if (randomBeatOutDP < p1.StealSuccP){
											result = (p1.name + " Grounded Into Fielder's Choice, " + run3b.name + " Out at Home, " + run2b.name + " to Third, " + run1b.name + " to Second");
											run3b = null;					
											run3b = run2b;
											run2b = run1b;
											run1b = p1;
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
										}
										else {
											result = (p1.name + " Grounded Into Double Play, " + run3b.name + " Out at Home, " + run2b.name + " to Third, " + run1b.name + " to Second");
											run3b = null;					
											run3b = run2b;
											run2b = run1b;
											run1b = null;
											outs++;
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
										}
									}				
									else if (run1b!=null && run2b!=null) {
											double randomBeatOutDP = Math.random();
											if (randomBeatOutDP < p1.StealSuccP){
												result = (p1.name + " Grounded Into Fielder's Choice, " + run2b.name + " Out at Third, " + run1b.name + " to Second");					
												run2b = run1b;
												run1b = p1;
												p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
											}
											else{
												result = (p1.name + " Grounded Into Double Play, " + run2b.name + " Out at Third, " + run1b.name + " to Second");
												run2b = run1b;					
												run1b = null;
												outs++;
												p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
											}
									}
									else if (run1b!=null && run3b!=null) {
										if (outs == 0){
											double randomBeatOutDP = Math.random();
											if (randomBeatOutDP < p1.StealSuccP){
												result = (p1.name + " Grounded Into Fielder's Choice, " + run1b.name + " Out at Second, " + run3b.name + " Scored");
												run3b.gameR++;
												p1.gameRBI++;
												run3b = null;
												run1b = p1;
												t1.runsBatter[0]++;
												p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
												t2.pitchingRotation[pitcher].gamepER++;
											}
											else{
												result = (p1.name + " Grounded Into Double Play, " + run1b.name + " Out at Second, " + run3b.name + " Scored");
												run3b.gameR++;
												p1.gameRBI++;
												run3b = null;					
												run1b = null;
												outs++;
												t1.runsBatter[0]++;
												p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
												t2.pitchingRotation[pitcher].gamepER++;
											}
										}
									
										else{
											double randomBeatOutDP = Math.random();
											if (randomBeatOutDP < p1.StealSuccP){
												result = (p1.name + " Grounded Into Fielder's Choice, " + run1b.name + " Out at Second, " + run3b.name + " Scored");	
												run3b.gameR++;
												p1.gameRBI++;
												run3b = null;
												run1b = p1;
												t1.runsBatter[0]++;
												p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
												t2.pitchingRotation[pitcher].gamepER++;
											}
											else{
												result = (p1.name + " Grounded Into Double Play, " + run1b.name + " Out at Second");
												run3b = null;					
												run1b = null;
												outs++;
												p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
											}
										}
									}
									else if (run2b!=null && run3b!=null){
										int outcome = RunningRolls.RunFrom2nd(run3b);
										if (outcome == 1){
											result = (result + ", " + run3b.name + " Scored, " + run2b.name + " to Third");
											p1.gameRBI++;
											run3b.gameR++;
											t1.runsBatter[0]++;
											t2.pitchingRotation[pitcher].gamepER++;
											run3b = run2b;
											run2b = null;
										}
										else if (outcome == 2){
											result = (p1.name + " Grounded Into Fielder's Choice, " + run3b.name + " Out at Home" + run2b.name + " to Third");
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
											run3b = run2b;
											run2b = null;
											run1b = p1;
										}
										else if (outcome == 3){
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
										}
									}
									else if (run3b!=null){
										int outcome = RunningRolls.RunFrom2nd(run3b);
										if (outcome == 1){
											result = (result + ", " + run3b.name + " Scored");
											p1.gameRBI++;
											run3b.gameR++;
											t1.runsBatter[0]++;
											t2.pitchingRotation[pitcher].gamepER++;
											run3b = null;
										}
										else if (outcome == 2){
											result = (p1.name + " Grounded Into Fielder's Choice, " + run3b.name + " Out at Home");
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
											run3b = null;
											run1b = p1;
										}
										else if (outcome == 3){
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
										}
									}
									else if (run2b!=null){
										int outcome = RunningRolls.RunFrom2nd(run2b);
										if (outcome == 1){
											result = (result + ", " + run2b.name + " to Third");
											run3b = run2b;
											run2b = null;
										}
										else if (outcome == 2){
											result = (p1.name + " Grounded Into Fielder's Choice, " + run2b.name + " Out at Third");
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
											run2b = null;
											run1b = p1;
										}
										else if (outcome == 3){
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
										}
									}
									else if (run1b!=null){
										double randomBeatOutDP = Math.random();
										if (randomBeatOutDP < p1.StealSuccP){
											result = (p1.name + " Grounded Into Fielder's Choice, " + run1b.name + " Out at Second");	
											run1b = p1;
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
										}
										else{
											result = (p1.name + " Grounded Into Double Play, " + run1b.name + " Out at Second");
											run1b = null;
											outs++;
											p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
										}
									}
									else p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
								}
								else if (resultCode == 9 || resultCode == 10){
									p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
								}
								outs++;
							}
							else if (resultCode == 1){		
								if (run3b!=null){
									result = (result + ", " + run3b.name + " Scored");
									run3b.gameR++;
									p1.gameRBI++;
									run3b = null;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}
								if (run2b!=null){
									int outcome = RunningRolls.RunFrom2nd(run2b);
									if (outcome == 1){
										result = (result + ", " + run2b.name + " Scored");
										run2b.gameR++;
										p1.gameRBI++;
										t1.runsBatter[0]++;
										t2.pitchingRotation[pitcher].gamepER++;
									}
									else if (outcome == 2){
										result = (result + ", " + run2b.name + " Thrown Out At Home");
										outs++;
									}
									else {
										result = (result + ", " + run2b.name + " To Third");
										run3b = run2b;
										
									}
									run2b = null;
								}
								if (run1b!=null){
									result = (result + ", " + run1b.name + " To Second");
									run2b = run1b;
									run1b = null;
								}
								run1b = p1;
								p1.gamesingles++;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
								t2.pitchingRotation[pitcher].gamepH++;
							}
							
							else if (resultCode == 2){		
								if (run3b!=null){
									result = (result + ", " + run3b.name + " Scored");
									run3b.gameR++;
									p1.gameRBI++;
									run3b = null;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}
								if (run2b!=null){
									result = (result + ", " + run2b.name + " Scored");
									run2b.gameR++;
									p1.gameRBI++;
									run2b = null;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}
								if (run1b!=null){
									int outcome = RunningRolls.RunFrom2nd(run1b);
									if (outcome == 1){
										result = (result + ", " + run1b.name + " Scored");
										run1b.gameR++;
										p1.gameRBI++;
										t1.runsBatter[0]++;
										t2.pitchingRotation[pitcher].gamepER++;
									}
									else if (outcome == 2){
										result = (result + ", " + run1b.name + " Thrown Out At Home");
										outs++;
									}
									else {
										result = (result + ", " + run1b.name + " To Third");
										run3b = run1b;		
									}
									run1b = null;
								}
								run2b = p1;
								p1.gamedoubles++;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
								t2.pitchingRotation[pitcher].gamepH++;
							}
							
							
							else if (resultCode == 3){		
								if (run3b!=null){
									result = (result + ", " + run3b.name + " Scored");
									run3b.gameR++;
									p1.gameRBI++;
									run3b = null;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}
								if (run2b!=null){
									result = (result + ", " + run2b.name + " Scored");
									run2b.gameR++;
									p1.gameRBI++;
									run2b = null;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}
								if (run1b!=null){
									result = (result + ", " + run1b.name + " Scored");
									run1b.gameR++;
									p1.gameRBI++;
									run1b = null;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}
								run3b = p1;
								p1.gametriples++;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
								t2.pitchingRotation[pitcher].gamepH++;
							}
							
							
							else if (resultCode == 4){		
								if (run3b!=null){
									result = (result + ", " + run3b.name + " Scored");
									run3b.gameR++;
									p1.gameRBI++;
									run3b = null;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}
								if (run2b!=null){
									result = (result + ", " + run2b.name + " Scored");
									run2b.gameR++;
									p1.gameRBI++;
									run2b = null;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}
								if (run1b!=null){
									result = (result + ", " + run1b.name + " Scored");
									run1b.gameR++;
									p1.gameRBI++;
									run1b = null;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}
								p1.gameR++;
								p1.gameRBI++;
								t1.runsBatter[0]++;
								p1.gameHR++;
								p1.gameAB++; t2.pitchingRotation[pitcher].gamepAB++;
								t2.pitchingRotation[pitcher].gamepER++;
								t2.pitchingRotation[pitcher].gamepH++;
								t2.pitchingRotation[pitcher].gamepHR++;
							}
							
							
							else if (resultCode == 5 || resultCode == 6){
								if (resultCode ==5){
									p1.gameBB++;
									t2.pitchingRotation[pitcher].gamepBB++;
								}
								else {
									p1.gameHBP++;
									t2.pitchingRotation[pitcher].gamepHBP++;
								}
										
								if (run1b!=null && run2b!=null && run3b!=null){
									result = (result + ", " + run3b.name + " Scored");
									result = (result + ", " + run2b.name + " To Third");
									result = (result + ", " + run1b.name + " To Second");
									run3b.gameR++;
									p1.gameRBI++;
									run3b = run2b;
									run2b = run1b;
									run1b = p1;
									t1.runsBatter[0]++;
									t2.pitchingRotation[pitcher].gamepER++;
								}				
								else if (run1b!=null && run2b!=null) {
									result = (result + ", " + run2b.name + " To Third");
									result = (result + ", " + run1b.name + " To Second");
									run3b = run2b;
									run2b = run1b;
									run1b = p1;
								}
								else if (run2b!=null && run3b!=null){
									run1b = p1;
								}
								else if (run1b!=null && run3b!=null) {
									result = (result + ", " + run1b.name + " To Second");
									run2b = run1b;
									run1b = p1;
								}
								else if (run1b!=null){
									result = (result + ", " + run1b.name + " To Second");
									run2b = run1b;
									run1b = p1;
								}
								else run1b = p1;
							}
							
							
							t1.runsBatter[1]++;
							if (t1.runsBatter[1] == 9){
								t1.runsBatter[1] = 0;
							}	
							
							p1.gamePA++;
							t2.pitchingRotation[pitcher].gamepPA++;
							
							Random x = new Random();
							double pitchesAB = x.nextGaussian()*2+3.5;
							if (pitchesAB < 1){
								pitchesAB = 1;
							}
							t2.pitchingRotation[pitcher].gamepP+=pitchesAB;
							
							if ((t2.pitchingRotation[pitcher].gamepP > 115 || t2.pitchingRotation[pitcher].gamepER > 6) && t2.pitchingRotation[pitcher].gamepER != 0){
								pitcher = 5;
							}
							
							if (homeChance && (t1.runsBatter[0]>homeDef)){
								outs=3;
							}
						}
						
						System.out.println(result);
						textAreaPBP.append(result + "\n");
						textAreaRuns1.setText("   "+ t1.runsBatter[0]);
				    	textAreaOuts.setText("   "+ outs);
						
				    	if (run1b != null){
				    		firstBase.setBackground(new Color(0, 0, 0));
				    	}
				    	else firstBase.setBackground(new Color(255, 255, 255));
				    	if (run2b != null){
				    		secondBase.setBackground(new Color(0, 0, 0));
				    	}
				    	else secondBase.setBackground(new Color(255, 255, 255));
				    	if (run3b != null){
				    		thirdBase.setBackground(new Color(0, 0, 0));
				    	}
				    	else thirdBase.setBackground(new Color(255, 255, 255));
						
						
					}
					
				}
			});
			t.start();
		
		
		
		System.out.println();
		//System.out.println("3 Outs, inning over");
		//t1.runsBatter[1] = BatterUp;
		return t1.runsBatter;
	
			
	}
	
	
	
	
	
	public void NewInning2(Team t1, Team t2, int BatterUp, int pitcher, boolean homeChance, int homeDef){
		//NewInning(t1, t2, 0, 0, false, 0, "away");
		textAreaRuns1.setText("   "+ 0);
    	textAreaOuts.setText("   "+ 0);
		
		Timer t = new Timer(2000, new ActionListener() {
			int i = 0;
			String results, runResults;
			int runs = 0;
			int outs = 0;
			int[] bases = new int[3];
			

		    public void actionPerformed(ActionEvent e) {   	
		    	results=Inning.getResult(i);
		    	runResults=Inning.getRunResult(i);
		    	bases = Inning.getBases(i);
		    	
		    	
		    	runs = Inning.getScore(i);
		    	outs = Inning.getOuts(i);
		    	
		    	if (runResults != null){
		    		textAreaPBP.append(runResults + "\n");
		    	}
		    	if (results != null){
		    		textAreaPBP.append(results + "\n");
		    	}
		    	
		    	textAreaRuns1.setText("   "+ runs);
		    	textAreaOuts.setText("   "+ outs);
		    	
		    	if (bases[0] == 1){
		    		firstBase.setBackground(new Color(0, 0, 0));
		    	}
		    	else firstBase.setBackground(new Color(255, 255, 255));
		    	if (bases[1] == 1){
		    		secondBase.setBackground(new Color(0, 0, 0));
		    	}
		    	else secondBase.setBackground(new Color(255, 255, 255));
		    	if (bases[2] == 1){
		    		thirdBase.setBackground(new Color(0, 0, 0));
		    	}
		    	else thirdBase.setBackground(new Color(255, 255, 255));
		    	i++;
		    }
		});
		t.start();
	}
	

}
