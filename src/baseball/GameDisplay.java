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
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Component;

public class GameDisplay {
	int inning = 1;
	int i = 0;
	int team1Score = 0;
	int team2Score = 0;
	int batterUp1 = 0;
	int batterUp2 = 0;
	static int inningpitcher1;
	static int inningpitcher2;
	static Team team1;
	static Team team2;
	
	
	private JFrame frame;
	private JTextField t1score;
	private JTextField t2score;

	/**
	 * Launch the application.
	 */
	public static void main(Team t1, Team t2, int pitcher1, int pitcher2) {
		
		
		inningpitcher1 = pitcher1;
		inningpitcher2 = pitcher2;
		team1 = t1;
		team2 = t2;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//InningDisplay.newInning();
				try {
					GameDisplay window = new GameDisplay();
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
	public GameDisplay() {
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
		
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 98, 414, 153);
		textArea.setEditable(false);
		frame.getContentPane().add(textArea);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textArea_1.setEditable(false);
		textArea_1.setBounds(123, 29, 91, 22);
		frame.getContentPane().add(textArea_1);
		
		
		JButton btnNewButton = new JButton("New Inning");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override	
			public void mouseClicked(MouseEvent arg0) {
				Inning.NewInning(team1, team2, 0, 0, false, 0);
				textArea.setText("Pitching for the " + team1.name + ": " + team1.pitchingRotation[inningpitcher1].name + "\n");
				textArea.append("Pitching for the " + team2.name + ": " + team2.pitchingRotation[inningpitcher2].name + "\n");
				textArea_1.setAlignmentX(0);
				textArea_1.setText(""+inning);
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
				
				//String[] x = new String[Inning.getResult().size()];
				
				//x[i] = Inning.getResult().get(i);
				//textArea.append(x[i] + "\n");
				i++;
				//t1score.setText("" + Inning.getScore());
			}
		});
		btnNextBatter.setBounds(10, 64, 103, 23);
		frame.getContentPane().add(btnNextBatter);
		
		
		
		t1score = new JTextField();
		t1score.setEditable(false);
		t1score.setBounds(281, 65, 45, 20);
		frame.getContentPane().add(t1score);
		t1score.setColumns(10);
		
		t2score = new JTextField();
		t2score.setEditable(false);
		t2score.setColumns(10);
		t2score.setBounds(379, 65, 45, 20);
		frame.getContentPane().add(t2score);
		
		JLabel lblTeam = new JLabel("Team 1");
		lblTeam.setBounds(280, 34, 46, 14);
		frame.getContentPane().add(lblTeam);
		
		JLabel label = new JLabel("Team 1");
		label.setBounds(378, 34, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblInning = new JLabel("Inning");
		lblInning.setBounds(148, 11, 46, 14);
		frame.getContentPane().add(lblInning);
		
		
	}
}
