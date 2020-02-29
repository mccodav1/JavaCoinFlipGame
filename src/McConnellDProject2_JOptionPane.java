import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class McConnellDProject2_JOptionPane {

	public static void main(String[] args) {
		Penny	penny = new Penny();
		Nickel	nickel = new Nickel();
		Dime	dime = new Dime();
		Quarter	quarter = new Quarter();
		String flipResults = "";
		boolean	playAgain = true;
		int		cash = 0;
		
		List<Integer> flipValues = new ArrayList<Integer>();
		for(int n=0; n<4; n++) {		
			flipValues.add(0);
		}
		
		List<String> flipShowing = new ArrayList<String>();
		for(int n=0; n<4; n++) {
				flipShowing.add("");
		}
		
		JOptionPane.showMessageDialog(null, "Welcome to McConnell's coin flipper game!", "Welcome!", JOptionPane.PLAIN_MESSAGE);
		while(playAgain) {
			cash = 0;
			while(cash < 100){
				JOptionPane.showMessageDialog(null, "\nYour total is $" + String.format("%.2f",(cash/100.0)) + ". Press ENTER to flip your coins!", "Total", JOptionPane.PLAIN_MESSAGE);
				flipValues.set(0,  penny.play());
				flipValues.set(1,  nickel.play());
				flipValues.set(2,  dime.play());
				flipValues.set(3,  quarter.play());
				
				for(int n=0; n < 4; n++) {
					if(flipValues.get(n)==0) {
						flipShowing.set(n, "Tails");
					}
						else {
						flipShowing.set(n, "Heads");
					}
					cash += flipValues.get(n);
				}
				flipResults = "Flipping penny... " + flipShowing.get(0) + "!\n"
						+ "Flipping nickel... " + flipShowing.get(1) + "!\n"
						+ "Flipping dime... " + flipShowing.get(2) + "!\n"
						+ "Flipping quarter... " + flipShowing.get(3) + "!\n";
				JOptionPane.showMessageDialog(null, flipResults);
			} // count is over 100, round is over
			if(cash == 100) {
				JOptionPane.showMessageDialog(null, "WINNER! You hit $1.00 exactly!");
			}
			else {
				flipResults = "BUST! Your total was $" + String.format("%.2f",(cash/100.0)) + "! You must hit $1.00 to win!";
				JOptionPane.showMessageDialog(null, flipResults);
			}
			String[] options = {"Yes!", "No."};
			int playTest = JOptionPane.showOptionDialog(null, "Play again?", "Select an option", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			playAgain = playTest == 1 ? false : true;
				
		} // end playAgain 
		JOptionPane.showMessageDialog(null, "Thanks for playing! Cya!");		
	}

}
