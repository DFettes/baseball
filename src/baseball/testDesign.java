package baseball;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Color;

public class testDesign {
	static Team t1;
	static Team t2;
	static int BatterUp;
	static int pitcher;
	static boolean homeChance;
	static int homeDef;
	
	
	
	private JFrame frame;
	private JTextArea textAreaOuts;
	private JTextArea textAreaRuns;
	private JTextArea textAreaPBP;
	private JTextArea firstBase;
	private JTextArea secondBase;
	private JTextArea thirdBase;
	private JTextArea homeBase;
	private JLabel JLabelRuns;
	private JLabel JLabelOuts;
	JScrollPane jScrollPane=new JScrollPane();
	
	
	{
	frame = new JFrame();
	frame.getContentPane().setBackground(Color.RED);
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);}
	{
	textAreaOuts = new JTextArea();
	textAreaOuts.setEditable(false);
	textAreaOuts.setBounds(76, 41, 28, 22);
	frame.getContentPane().add(textAreaOuts);
	}
	{
	textAreaRuns = new JTextArea();
	textAreaRuns.setEditable(false);
	textAreaRuns.setBounds(76, 74, 28, 22);
	frame.getContentPane().add(textAreaRuns);
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
		firstBase.setBounds(356, 74, 20, 20);
		frame.getContentPane().add(firstBase);
	}
	{
		secondBase = new JTextArea();
		secondBase.setAutoscrolls(false);
		secondBase.setEditable(false);
		secondBase.setBounds(299, 22, 20, 20);
		frame.getContentPane().add(secondBase);
	}
	{
		thirdBase = new JTextArea();
		thirdBase.setAutoscrolls(false);
		thirdBase.setEditable(false);
		thirdBase.setBounds(241, 74, 20, 20);
		frame.getContentPane().add(thirdBase);
	}
	{
		homeBase = new JTextArea();
		homeBase.setAutoscrolls(false);
		homeBase.setEditable(false);
		homeBase.setBounds(299, 128, 20, 20);
		frame.getContentPane().add(homeBase);
	}
	{
	JScrollPane scrollPane = new JScrollPane(textAreaPBP);
	scrollPane.setLocation(0, 159);
	scrollPane.setSize(434, 100);
	frame.getContentPane().add(scrollPane);}
	{
	JLabelRuns = new JLabel();
	JLabelRuns.setForeground(Color.WHITE);
	JLabelRuns.setText("Runs");
	JLabelRuns.setBounds(15, 74, 51, 22);
	frame.getContentPane().add(JLabelRuns);
	}
	{
	JLabelOuts = new JLabel();
	JLabelOuts.setForeground(Color.WHITE);
	JLabelOuts.setText("Outs");
	JLabelOuts.setBounds(15, 41, 51, 22);
	frame.getContentPane().add(JLabelOuts);
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

	/**
	 * Create the application.
	 */

	public testDesign() {
		NewInning(t1,t2,0,0,false,0);
			
	}
	
	public void NewInning(Team t1, Team t2, int BatterUp, int pitcher, boolean homeChance, int homeDef){
		Inning.NewInning(t1, t2, 0, 0, false, 0);
		textAreaRuns.setText("   "+ 0);
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
		    	
		    	textAreaRuns.setText("   "+ runs);
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
