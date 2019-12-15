package potluck.domain;

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
 *	<i>ApplicationLauncher</i> class is the entry point of the recipe program.
 *
 */
public class ApplicationLauncher {
	public static void main(String[] args) {
		LoginType loginType = new LoginType();
		loginType.setSize(400, 150);//Sets the size of the frame.
		loginType.setVisible(true);//Sets the frame to be visible.
		loginType.setLocationRelativeTo(null);//Sets the location of the frame to be in the center of the screen.
	}
}