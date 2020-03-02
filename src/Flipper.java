/**
 * Class representing a coin flip
 * Returns String "Heads" or "Tails" randomly
 * @author David McConnell & David Huson
 * @since 03/02/2020
 */
public class Flipper {
	/*
	 * @return String "Heads" or "Tails", randomly. 
	 */
	public static String getFlip(){
		return Math.random() < .5 ? "Heads" : "Tails";
	}
}
