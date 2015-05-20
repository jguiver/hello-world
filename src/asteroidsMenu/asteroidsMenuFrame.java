package asteroidsMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class asteroidsMenuFrame extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnTextWillAppear = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					asteroidsMenuFrame frame = new asteroidsMenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public asteroidsMenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GREEN);
		menuBar.setForeground(Color.BLACK);
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnTextWillAppear.setText(Goofing.run());
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.BLACK);
		menuBar.add(btnNewButton);
		
		JButton btnHighScore = new JButton("High Scores");
		btnHighScore.setBorderPainted(false);
		menuBar.add(btnHighScore);
		
		JButton btnRules = new JButton("Rules");
		btnRules.setBorderPainted(false);
		menuBar.add(btnRules);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBorderPainted(false);
		menuBar.add(btnExit);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblAsteroids = new JLabel("Asteroids");
		lblAsteroids.setForeground(new Color(255, 255, 255));
		lblAsteroids.setFont(new Font("Desdemona", Font.BOLD, 26));
		lblAsteroids.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblAsteroids, BorderLayout.NORTH);
		
		txtpnTextWillAppear.setText("Text will appear here");
		contentPane.add(txtpnTextWillAppear, BorderLayout.CENTER);
		
	}
}
