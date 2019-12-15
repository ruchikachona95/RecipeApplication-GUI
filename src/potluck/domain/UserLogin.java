package potluck.domain;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Program Description:
 * 
 *  Program will allow users to add, remove, and search for recipes using a graphical user interface.
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
 *	<i>UserLogin</i> class will display a GUI login for the user to enter the proper user name and login.
 *
 */
@SuppressWarnings("serial")
public class UserLogin extends JFrame{
	
	Member member = new Member();

	LoginType loginType = new LoginType();

	private String userName;
	private String userPassword;

	private JTextField userNameTextField = new JTextField();
	private JTextField passwordField = new JTextField();
	private JTextField errorFeedbackField = new JTextField();

	private JLabel userNameLabel = new JLabel();
	private JLabel passwordLabel = new JLabel();
	private JLabel errorFeedBackLabel = new JLabel();

	private JPanel mainViewPanel  = new JPanel();
	private JPanel buttonPanel = new JPanel();

	public UserLogin(){
		super("Login");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		userNameLabel.setText("User Name");
		userNameTextField.setEditable(true);

		passwordLabel.setText("Password");
		passwordField.setEditable(true);

		errorFeedBackLabel.setText("Error Feedback");
		errorFeedbackField.setEditable(false);

		mainViewPanel.setLayout(new GridLayout(7, 1));
		mainViewPanel.add(userNameLabel);
		mainViewPanel.add(userNameTextField);
		mainViewPanel.add(passwordLabel);
		mainViewPanel.add(passwordField);
		mainViewPanel.add(errorFeedBackLabel);
		mainViewPanel.add(errorFeedbackField);

		// Buttons for user interaction
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				checkLogin();
			}
		});

		mainViewPanel.add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(1, 2));
		buttonPanel.add(loginButton);

		this.getContentPane().add(mainViewPanel, BorderLayout.CENTER);
		this.setResizable(true);
		this.pack();
	}

	private void checkLogin(){
		userName = userNameTextField.getText();
		userPassword = passwordField.getText();

		member.verifyGuestLogin(userName, userPassword, this);
		member.verifyAdminLogin(userName, userPassword, this);

		//If the user enters the wrong user name or password.
		//This will update the feedback to display to the user the error they made.
		if (member.getContains() == false) {
			errorFeedbackField.setText("Wrong user name and password");
		}
	}
}