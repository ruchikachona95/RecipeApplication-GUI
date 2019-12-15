package util;


import java.util.Scanner;

/**
 *Steven Gorn
 *
 *Last Modified Date 01/23/2015
 *CST8284 020 Object-Oriented Programming
 *Prof. Rex Woollard
 *Assignment 2
 *
 *@author Rex Woollard
 *@version Lab Assignment 2: <i>The Hobbit Battlefield Simulator</i>
 *
 * 
 * <i>Singleton</i> class to assist with basic keyboard input operations. Only a single <i>Input</i> object will ever be created. The <i>Input</i> class clusters related input operations and will build one <i>Scanner</i> object to use with input.
 * <i>Scanner</i> objects are big and complex; thus, this approach reduces the overhead associated with the repeated creation of <i>Scanner</i> objects.
 * 
 * @author Rex Woollard
 * 
 */
public final class Input {
	/** Keyword <i>static</i> makes this a <i>class</i> oriented variable, rather than <i>object</i> oriented variable; only one instance of an <i>Input</i> object will ever exist, and the instance is tracked by this reference variable. */ 
	public final static Input instance = new Input();
	/** Each input method allows for a number failed attempts before throwing an exception. */
	public final static int MAX_ATTEMPTS = 3;
	/** Object-oriented instance variable, but since only one <i>Input</i> can ever be created, only one <i>Scanner</i> object will ever be created. */
	private Scanner inputScanner;

	/** A <i>private</i> constructor guarantees that no <i>Input</i> object can be created from outside the <i>Input</i> class; this is essential for the <i>singleton</i> design pattern. */
	private Input() {	
		inputScanner = new Scanner(System.in);
		}

	/**
	 * Presents a prompt to the user and retrieves an <i>double</i> value. 
	 * @param prompt   reference to a <i>String</i> object whose contents will be displayed to the user as a prompt.
	 * @return <i>double</i> value input from keyboard
	 */
	public double getDouble(String prompt) throws NumberFormatException, RuntimeException {
		System.out.print(prompt);
		int numAttempts = 0;
		do {
			try {
				++numAttempts;
				String stringInput = inputScanner.nextLine();
				return Double.parseDouble(stringInput);
			} catch (NumberFormatException nfe) {
				if (numAttempts >= MAX_ATTEMPTS)
					return 0.0;
				System.out.format("Invalid double: %s", prompt);
			}
		} while(numAttempts < MAX_ATTEMPTS);
		throw new RuntimeException("Too many failed attempts.");
	} // end double getDouble()

	/**
	 * Presents a prompt to the user and retrieves a <i>double</i> value which is within the range of <i>low</i> to <i>high</i> (inclusive). 
	 * @param prompt reference to a <i>String</i> object whose contents will be displayed to the user as a prompt.
	 * @param low lower boundary on the range of legitimate values
	 * @param high upper boundary on the range of legitimate values
	 * @return <i>double</i> value input from keyboard
	 */
	public double getDouble(String prompt, double low, double high) throws NumberFormatException, RuntimeException {
		int numAttempts = 0;
		double returnValue;
		do {
			System.out.printf("Current Value of %s, Enter a value between (%.1f - %.1f): ", prompt, low, high);
			try {
				++numAttempts;
				String stringInput = inputScanner.nextLine();
				returnValue = Double.parseDouble(stringInput);
				if (returnValue >= low && returnValue <= high)
					return returnValue;
			} catch (NumberFormatException nfe) {
				if (numAttempts >= MAX_ATTEMPTS)
					return low; // snap to the lowest legitimate value
			}
			System.out.println("Invalid double.");
		} while (numAttempts < MAX_ATTEMPTS);
		throw new RuntimeException("Too many failed attempts.");
	} // end double getDouble()

	/**
	 * Presents a prompt to the user and retrieves an <i>int</i> value. 
	 * @param prompt   reference to a <i>String</i> object whose contents will be displayed to the user as a prompt.
	 * @return <i>int</i> value input from keyboard
	 */
	public int getInt(String prompt) throws NumberFormatException, RuntimeException {
		System.out.print(prompt);
		int numAttempts = 0;
		do {
			try {
				++numAttempts;
				String stringInput = inputScanner.nextLine();
				return Integer.parseInt(stringInput);
			} catch (NumberFormatException nfe) {
				if (numAttempts >= MAX_ATTEMPTS)
					return 0; // snap to 0
				System.out.format("Invalid integer: %s", prompt);
			}
		} while(numAttempts < MAX_ATTEMPTS);
		throw new RuntimeException("Too many failed attempts.");
	} // end int getInt()

	/**
	 * Presents a prompt to the user and retrieves an <i>int</i> value which is within the range of <i>low</i> to <i>high</i> (inclusive). 
	 * @param prompt reference to a <i>String</i> object whose contents will be displayed to the user as a prompt.
	 * @param low lower boundary on the range of legitimate values
	 * @param high upper boundary on the range of legitimate values
	 * @return <i>int</i> value input from keyboard
	 */
	public int getInt(String prompt, int low, int high) throws NumberFormatException, RuntimeException {
		int numAttempts = 0;
		int returnValue;
		do {
			System.out.printf("Current Value of %s, Enter a value between (%.1f - %.1f): ", prompt, low, high);
			try {
				++numAttempts;
				String stringInput = inputScanner.nextLine();
				returnValue = Integer.parseInt(stringInput);
				if (returnValue >= low && returnValue <= high)
					return returnValue;
			} catch (NumberFormatException nfe) {
				if (numAttempts >= MAX_ATTEMPTS)
					return low; // snap to the lowest legitimate value
			}
			System.out.println("Invalid integer.");
		} while (numAttempts < MAX_ATTEMPTS);
		throw new RuntimeException("Too many failed attempts.");
	} // end int getInt()

	/**
	 * Presents a prompt to the user and retrieves a <i>reference-to-String</i>. 
	 * @param prompt reference to a <i>String</i> object whose contents will be displayed to the user as a prompt.
	 * @return <i>reference-to-String</i> object created by keyboard input
	 */
	public String getString(String prompt) {
		System.out.print(prompt);
		// Setting this delimiter ensures that we capture everything up to the <Enter> key. Without this, input stops at the next whitespace (space, tab, newline etc.).
		String input = inputScanner.nextLine();
		//inputScanner.reset(); // The preceding use of useDelimiter() changed the state of the Scanner object. reset() re-establishes the original state.
		return input;
	} // end String getString()

	/**
	 * Presents a prompt to the user and retrieves a <i>boolean</i> value. 
	 * prompt reference to a <i>String</i> object whose contents will be displayed to the user as a prompt.
	 * @return boolean value input from keyboard.
	 * @param prompt prompt to user of the original value.
	 * @param item manipulates boolean variable.
	 */
	public boolean getBoolean(String prompt, boolean item) {
		System.out.print(prompt);
		int value;
		// Displays to user an option to enter true or false to the item that an actor might have during combat.
		//int choice;
		System.out.print(" Enter 1 for True, 2 for False): ");
		String choice = inputScanner.nextLine();
		value = Integer.parseInt(choice);
		
		// If user enters an invalid input, displays to user to reenter a proper choice. 
		while (value < 1 || value > 2) {
			System.out.print("Invalid choice, please enter either 1 for True or 2 for False: ");
			choice = inputScanner.nextLine();
			value = Integer.parseInt(choice);
		}
		
		// Once a choice is made by user, depending on their input method will return the boolean.
		if(value == 1) {
			item = true;
		}else if (value == 2){
			item = false;
		}
		return item;
	} // end boolean getBoolean()
} // end class Input