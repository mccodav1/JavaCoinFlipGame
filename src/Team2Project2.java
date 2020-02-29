/* TODO : Convert cents to dollars to display
 * TODO : Add docstrings
 * TODO : Workspace gives warning when compiling but program runs; find error
 * TODO : Add JOptionPane variant
*/

import java.util.Scanner;
public class Team2Project2 {

	public static void main(String[] args) {
		Penny	penny = new Penny();
		Nickel	nickel = new Nickel();
		Dime	dime = new Dime();
		Quarter	quarter = new Quarter();
		Scanner	keyboard = new Scanner(System.in);
		boolean	playAgain = true;
		int		cents = 0;		
		
		System.out.println("Welcome to Team 3's coin flipper game!");

		while(playAgain) {			// Set to false when player inputs N after a round
			cents = 0;
			while(cents < 100){		// Each round, coins are flipped and if heads, added to counter. Play til 100. 
				System.out.println("\nYour total is " + String.valueOf(cents) + ". Press ENTER to flip your coins!");
				keyboard.nextLine();	// Waiting for user to hit enter
				penny.flip();			// Randomly assigns side to heads or tails
				nickel.flip();
				dime.flip();
				quarter.flip();
				
				System.out.println("Flipping penny... " + penny.getSideUp() + "!");
				System.out.println("Flipping nickel... " + nickel.getSideUp() + "!");
				System.out.println("Flipping dime... " + dime.getSideUp() + "!");
				System.out.println("Flipping quarter... " + quarter.getSideUp() + "!");

				cents += penny.getSideUp() == "Heads" ? penny.getValue() : 0;		// If heads, add the coin's value. If tails, add zero.
				cents += nickel.getSideUp() == "Heads" ? nickel.getValue() : 0;
				cents += dime.getSideUp() == "Heads" ? dime.getValue() : 0;
				cents += quarter.getSideUp() == "Heads" ? quarter.getValue() : 0;				
				
			} // count is over 100, round is over
			
			
			// Check if game is won
			
			if(cents == 100) {
				System.out.println("You hit exactly $1.00! You win!");
			}	// End if
			
			else {
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
