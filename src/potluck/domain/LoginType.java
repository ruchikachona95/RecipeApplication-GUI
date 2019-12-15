package potluck.domain;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Program Description:
 * 
 * Program will allow users to add, remove, and search for recipes using a graphical user interface.
 * 
 * @authors   Colin Kerr
 * 			  Derek Kilbride
 * 			  Laurence Jackson
 * 			  Ruchika Chona
 *            Steven Gorn
 * 			  
 * @version   1.0.0 Date 2015/11/16
 * 
 * Course: CST8288_010 OOP with Design Patterns
 * Professors: Stanley Pieda, Alem Lagresse
 * Assignment: Project 1 - Recipe Program 
 * 
 * References: CST 8284 Course material
 * 			   Tutorial Point
 * 			   Stack Overflow
 * 			   Oracle Java Directory
 * 			   
 * 
 *	<i>LoginType</i> class presents the user with the option to select what type of user they are login in as (admin or guest).
 *	
 *
 */
@SuppressWarnings("serial")
public class LoginType extends JFrame {

	UserLogin userLogin;
	Font buttons = new Font("SansSerif", Font.BOLD, 15);
	private boolean guestUser;
	private boolean adminUser;
	private JPanel titlePanel  = new JPanel();
	private JPanel memberPanel = new JPanel();
	private JLabel title = new JLabel("Please select your login type.");

	public LoginType(){
		super("Login Type");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Buttons for user interaction
		JButton memberButton = new JButton("Guest");
		memberButton.setFont(buttons);
		memberButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				userLogin = new UserLogin();
				userLogin.setSize(350, 250);
				userLogin.setVisible(true);
				userLogin.setLocationRelativeTo(null);
				guestUser = true;
			}
		});

		JButton adminButton = new JButton("Admin");
		adminButton.setFont(buttons);
		adminButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				userLogin = new UserLogin();
				userLogin.setSize(350, 250);
				userLogin.setVisible(true);
				userLogin.setLocationRelativeTo(null);
				adminUser = true;
			}
		});

		memberPanel.setLayout(new GridLayout(1, 2));
		memberPanel.add(memberButton);
		memberPanel.add(adminButton);

		titlePanel.add(title);
		title.setFont(new Font("SansSerif", Font.PLAIN, 20));

		this.getContentPane().add(titlePanel, BorderLayout.CENTER);
		this.getContentPane().add(memberPanel, BorderLayout.SOUTH);
		this.setResizable(true);
		this.pack();
	}

	// MUTATOR METHODS
	public void setGuest(boolean guestUser){ this.guestUser = guestUser; }
	public void setAdmin(boolean adminUser){ this.adminUser = adminUser; }

	// ACCESSOR METHODS
	public boolean getGuestUser(){ return guestUser; }
	public boolean getAdminUser(){ return adminUser; }
}