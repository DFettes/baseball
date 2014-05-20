package baseball;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class display {
	
	int i=0;
	int inning=1;
	
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
	Player p29 = playerArray[28];
	
	
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
	Player p30 = playerArray[29];
	
	Player[] t1PRot = {p19,p24,p28,p22,p27,p30};
	Player[] t2PRot = {p25,p23,p20,p26,p21,p29};
	
	Team t1 = CreateTeam.NewTeam("Blue Jays", t1PRot, p10,p12,p11,p13,p16,p18,p14,p15,p17);
	Team t2 = CreateTeam.NewTeam("Legends", t2PRot, p4,p3,p5,p2,p8,p1,p9,p6,p7);
	
	
	//t1.printTeam();
	//t2.printTeam();
	

	
	//Game.NewGame(t1, t2, 0, 0);
	//simSeason(t1, t2);

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//InningDisplay.newInning();
				try {
					display window = new display();
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
	public display() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final int b = 0;
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 98, 414, 153);
		textArea.setEditable(false);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("New Inning");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override	
			public void mouseClicked(MouseEvent arg0) {
				Inning.NewInning(t1, t2, 0, 0, false, 0);
				textArea.setText("Inning " + inning);
				i = 0;
				inning++;
			}
		});
		btnNewButton.setBounds(10, 30, 103, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNextBatter = new JButton("Next Batter");
		btnNextBatter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//String[] x = new String[Inning.getResult().length];
				
				//x[i] = Inning.getResult()[i];
				//textArea.append("\n"+x[i]);
				i++;
			}
		});
		btnNextBatter.setBounds(10, 64, 103, 23);
		frame.getContentPane().add(btnNextBatter);
		
		
	}
}
