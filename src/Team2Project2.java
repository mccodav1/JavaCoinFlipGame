/* TODO : Convert cents to dollars to display
 * TODO : Add docstrings
 * TODO : Workspace gives warning when compiling but program runs; find error
 * TODO : Add JOptionPane variant
*/

import java.util.Scanner;
public class Team2Project2 {

	public static void main(String[] args) {
		Penny	penny = new Penny();		// Coin that has value 1 and side-up of "Heads" or "Tails" 
		Nickel	nickel = new Nickel();		// Coin that has value 5 and side-up of "Heads" or "Tails"
		Dime	dime = new Dime();			// Coin that has value 10 and side-up of "Heads" or "Tails"
		Quarter	quarter = new Quarter();	// Coin that has value 25 and side-up of "Heads" or "Tails"
		Scanner	keyboard = new Scanner(System.in);	// Scanner object for input
		boolean	playAgain = true;			// Flag to test for end of game
		int		cents = 0;					// Accumulator to track money earned in game; game ends when >= 100
		
		System.out.println("Welcome to Team 3's coin flipper game!");

		while(playAgain) {			// Play game until finished; set to false when player inputs N after a round
			cents = 0;				// New round sets counter to 0
			
			while(cents < 100){		// Each round, coins are flipped and if heads, added to counter. Play til 100. 
				System.out.println("\nYour total is " + String.valueOf(cents) + ". Press ENTER to flip your coins!");
				keyboard.nextLine();	// Waiting for user to hit enter
				
				// Randomly assign side to "Heads" or "Tails" for each coin.
				penny.flip();
				nickel.flip();
				dime.flip();
				quarter.flip();
				
				// Display coinflip results.				
				System.out.println("Flipping penny... " + penny.getSideUp() + "!");		
				System.out.println("Flipping nickel... " + nickel.getSideUp() + "!");
				System.out.println("Flipping dime... " + dime.getSideUp() + "!");
				System.out.println("Flipping quarter... " + quarter.getSideUp() + "!");

				// If coin landed heads up, add value to accumulator.
				cents += penny.getSideUp() == "Heads" ? penny.getValue() : 0;
				cents += nickel.getSideUp() == "Heads" ? nickel.getValue() : 0;
				cents += dime.getSideUp() == "Heads" ? dime.getValue() : 0;
				cents += quarter.getSideUp() == "Heads" ? quarter.getValue() : 0;
			} // count is over 100, round is over			
			
			// Check result
			if(cents == 100) {	// Game won
				System.out.println("You hit exactly $1.00! You win!");
			}	// End if
			
			else {				// Game lost
				System.out.println("BUST! Your total is " + String.valueOf(cents));
			}	// End else
			
			System.out.println("Play again? Press ENTER to continue, or input 'N' to exit:");
			
			if(keyboard.nextLine().equalsIgnoreCase("N")){
				playAgain = false;	// Program won't run again; continue below
			}	// End if

		}		// End while loop checking if user wants to play again.

		System.out.println("Thanks for playing! Cya!");
		
		keyboard.close();
		
	}	// End main

}	// End class 
