
/**
 * Used to create object of class 'Penny'
 * 
 *
 */
public class Penny {
	private int value = 1;						// Value of the coin 
	private String sideUp = Flipper.getFlip();	// Track which side is up
	
	public int getValue() {				// Returns value of the coin
		return value;
	} // end getValue
	
	public String getSideUp() {			// Return 'Heads' or 'Tails'
		return sideUp;		
	} // end getSideUp
	
	public void flip() {				// Flips the coin using static method from Flipper class
		sideUp = Flipper.getFlip();		// Returns "Heads" or "Tails"
	} // end flipCoin
	
} // end Penny