package test;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Test;

/**
 *Steven Gorn
 *
 *Last Modified Date 01/23/2015
 *CST8284 020 Object-Oriented Programming
 *Prof. Rex Woollard
 *Assignment 2
 *
 *Part of the code for Assignment 2 has been created by:
 *@author REX WOOLLARD
 *@version Lab Assignment 2: <i>The Hobbit Battlefield Simulator</i> 
 *@see Actor
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitActorTesting {
	
	/** Tests the behavior of <i>Hobbit</i> and <i>Wizard</i> objects extending <i>Actor</i> objects. */
	@Test
	public void AtestIndependentActors() {
		
		
		
		
		
		
		
		
//		System.out.println("Test Independent Actors");
//		
//		// Generates the new actor object with predetermined values.
//		Actor hobbit = new Hobbit("Steven", 200,100,100,100);
//		Actor wizard = new Wizard("Jose", 200, 100, 100, true, true);
//		System.out.println();
//		
//		// Assert method to test if object is null.
//		assertNotNull("Assert object is not null", hobbit);
//		assertNotNull("Assert object is not null", wizard);
//		
//		// Tests if the wizard object has a staff and a horse. If true, regular execution.
//		assertTrue("Assert that wizard has a horse", ((Wizard)wizard).gethorse() == true);
//		assertTrue("Assert that wizard has a staff", ((Wizard)wizard).getStaff() == true);
//		
//		// Displays the random actor object to compare values.
//		// Implicit call toString().
//		System.out.println(hobbit);
//		// Direct call toString().
//		System.out.println(wizard.toString());
//		System.out.println();
//		
//		// Allows override of object values by input to create a specific Actor/hobbit object.
//		hobbit.inputAllFields();
//		System.out.println(hobbit);
//		System.out.println();
//		
//		// Test that the values of hobbit are within the specified range.
//		assertNotNull("Assert object is not null", hobbit);
//		assertTrue("Test that value of health within range", hobbit.getHealth() >= 10 || hobbit.getHealth() <= 200 );
//		assertTrue("Test that value of strength within range", hobbit.getStrength() >= 10 || hobbit.getStrength() <= 100);
//		assertTrue("Test that value of speed within range", hobbit.getSpeed() <= 10 || hobbit.getSpeed() <= 100);
//		assertTrue("Test that value of stealth within range", ((Hobbit)hobbit).getStealth() <= 10 || ((Hobbit)hobbit).getStealth() <= 100);
//		
//		// Allows override of object values by input to create a specific Actor/wizard object.
//		wizard.inputAllFields();
//		System.out.println(wizard);
//		System.out.println();
//		assertNotNull("Assert object is not null", wizard);
//		assertTrue("Test that value of health within range", wizard.getHealth() >= 10 || wizard.getHealth() <= 200 );
//		assertTrue("Test that value of strength within range", wizard.getStrength() >= 10 || wizard.getStrength() <= 100);
//		assertTrue("Test that value of speed within range", wizard.getSpeed() <= 10 || wizard.getSpeed() <= 100);
//		assertTrue("Test that value of staff is true", ((Wizard)wizard).getStaff() == true);
//		assertTrue("Test that value of horse is true", ((Wizard)wizard).gethorse() == true);
//
//		// Test the behavior when setting an out-of-bounds value.
//		hobbit.setHealth(1001.05);
//		assertTrue("Out of bounds variable, sets to 200", hobbit.getHealth() == 200);
//		hobbit.setStrength(0.1);
//		assertTrue("Out of bounds variable, sets to 10", hobbit.getStrength() == 10);
//		hobbit.setSpeed(-200.05);
//		assertTrue("Out of bounds variable, sets to 10", hobbit.getSpeed() == 10);
//		
//		wizard.setHealth(1001.05);
//		assertTrue("Out of bounds variable, sets to 200", wizard.getHealth() == 200);
//		wizard.setStrength(0.1);
//		assertTrue("Out of bounds variable, sets to 10", wizard.getStrength() == 10);
//		wizard.setSpeed(-200.05);
//		assertTrue("Out of bounds variable, sets to 10", wizard.getSpeed() == 10);
//		
//
//		// Display Actor Object to see what was captured after setting an out of bounds value.
//		System.out.println(hobbit);
//		System.out.println();
	}
//	
//	/** Tests the behavior of <i>Hobbit</i> and <i>Wizard</i> objects extending <i>Actor</i> objects in an <i>ArrayList</i>. */
//	@Test
//	public void BtestArrayActor() {
//		Scanner input = new Scanner (System.in);
//		System.out.println("Test array of Actor objects");
//		System.out.println();
//		
//		// Creates an array of Actor class, setting the maximum size to 10.
//		final int numberOfactors = 10;
//		Actor[ ] actorArray = new Actor[numberOfactors];
//		
//		// Instantiates actorArray with wizards and hobbit's, 50 percent of each.
//		for (int i = 0; i < numberOfactors; ++i){
//			if (Math.random() < 0.5) { // Wizard 50% probability
//				actorArray[i] = new Wizard();
//			}else{
//				actorArray[i] = new Hobbit();
//			}
//		}
//		
//		// Asserts that the array has been populated.
//		assertNotNull("Assert that actor array isn't null", actorArray);
//		
//		// Iterates through actorArray and displays the content by overriding a toString method.
//		for (int i = 0; i < actorArray.length; i++) {
//			System.out.println(actorArray[i]);
//		}
//		System.out.println();
//		
//		// Displays to user what index to modify.
//		System.out.print("Select an index to modify: ");
//		int index = input.nextInt();
//		
//		// If user enters an invalid index, loops until the right input is captured.
//		while (index < 0 || index >actorArray.length) {
//			System.out.print("Invalid index, cannot be less than 0. Please enter an index that is greater than 0: ");
//			index = input.nextInt();
//		}
//		assertTrue("Is index greater than 0", index >= 0);
//		actorArray[index].inputAllFields();
//		System.out.println();
//				
//		// Re-iterates through actorArray and displays the content by overriding a toString method.
//		for (int i = 0; i < actorArray.length; i++) {
//			System.out.println(actorArray[i]);
//		}
//		System.out.println();
//		input.close();
//	}
//	
//	/**  Tests the behavior of <i>Actor</i> objects in <i>combatRound()</i>. */
//	@Test
//	public void CtestSkirmishActors() {
//		System.out.println("Test Combat Round");
//		System.out.println();
//		
//		// Generates a new actor object with random values.
//		Actor hobbit = new Hobbit();
//		Actor wizard = new Wizard();
//		
//		// Assert method to test if object is null.
//		assertNotNull("Assert object is not null", hobbit);
//		assertNotNull("Assert object is not null", wizard);
//
//		// This method passes the argument, which is the defending object, and the object being the attacker.
//		// Skirmish between randomized actors.
//		System.out.println("Combat begins");
//		System.out.println();
//		System.out.println("Current Actor Stats:");
//
//		// Displays the content of the actor objects.
//		System.out.println(hobbit);
//		System.out.println(wizard);
//		System.out.println();
//		
//		// Modifies wizard attributes if equipped with a staff or a horse.
//		wizard.checkStaff(wizard);
//		wizard.checkhorse(wizard);
//					
//		// Combat simulator executes within a while loop, where the condition compares the health of each actor to the threshold of adequate health. 
//		while (hobbit.getHealth() > hobbit.getTHRESHOLD_OF_ADEQUATE_HEALTH() && wizard.getHealth() > wizard.getTHRESHOLD_OF_ADEQUATE_HEALTH()){
//			// Test that the while condition is continuing on based on the health being greater than 0.
//			assertTrue("Assert if health is greater than 0", hobbit.getHealth() > 0);
//			assertTrue("Assert if health is greater than 0", wizard.getHealth() > 0);
//
//			// Test for stealth variable.
//			// If stealth is greater than 50 then hobbit is able to flee battle before it commences.
//			if (((Hobbit)hobbit).getStealth() > 65) {
//				System.out.println("Hobbit's stealth capability is great, hobbit was able to escape.");
//				break;
//			}
//			
//			// Hobbit is attacking the wizard by taking the wizard object as an argument.
//			hobbit.combatRound(wizard);
//			System.out.println();
//
//			// Compares the health of both actors to determine if the combat declares a loser.
//			// If the condition holds true, prompts the winner and "breaks" out of loop to end the combat simulation.
//			if(hobbit.getHealth() < hobbit.getTHRESHOLD_OF_ADEQUATE_HEALTH()){
//				System.out.printf("%s is the Winner%n", wizard.getName());
//				break;
//			}else if(wizard.getHealth() < wizard.getTHRESHOLD_OF_ADEQUATE_HEALTH()){
//				System.out.printf("%s is the Winner%n", hobbit.getName());
//				break;
//			}
//
//			// If the condition holds false, continues battle. Actors switch positions of attacker/defender.
//			// Wizard is attacking the Hobbit by taking the Hobbit object as an argument.
//			wizard.combatRound(hobbit);
//			System.out.println();
//			if(hobbit.getHealth() < hobbit.getTHRESHOLD_OF_ADEQUATE_HEALTH()){
//				System.out.printf("%s is the Winner%n", wizard.getName());
//				break;
//			}else if(wizard.getHealth() < wizard.getTHRESHOLD_OF_ADEQUATE_HEALTH()){
//				System.out.printf("%s is the Winner%n", hobbit.getName());
//				break;
//			}
//		}
//		System.out.println("Combat Ends");
//	}
}// End of JUnitActorTesting
