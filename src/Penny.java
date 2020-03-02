/**
 * Returns an object of type 'Penny' representing a penny.
 * Contains value of penny (1) and side of coin facing up ("Heads" or "Tails")
 * @author David McConnell & David Huson
 * @since 03/02/2020
 */
public class Penny {
	private int value = 1;						// Value of the coin 
	private String sideUp = Flipper.getFlip();	// Track which side is up
	
	
	/* Returns the value of the coin.
	 * @return value;
	 */
	public int getValue() {				// Returns value of the coin
		return value;
	} // end getValue
	
	
	/*
	 * Returns String "Heads" or "Tails" denoting which side of the coin is currently facing up.
	 * @return sideUp
	 */
	public String getSideUp() {			// Return 'Heads' or 'Tails'
		return sideUp;		
	} // end getSideUp
	
	
	/*
	 * Modifies sideUp. Flips the coin, utilizing Flipper class to set randomly to "Heads" or "Tails"
	 */
	public void flip() {				// Flips the coin using static method from Flipper class
		sideUp = Flipper.getFlip();		// Returns "Heads" or "Tails"
	} // end flip
	
	
} // end Penny
