/**
 * 
 */
package question1;
import javax.swing.JOptionPane;
/**
 * @author ra316282
 *
 */
public class RandomGuessMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creating random guess
		String guessString;
		int random;
		int guess;
		final int MIN = 1;
		final int MAX = 5;
		boolean isMatch;
		
		random = MIN + (int)(Math.random() * MAX);
		guessString = JOptionPane.showInputDialog(null, "Guess my number between " + MIN + " and " + MAX + ". Random guess",  JOptionPane.INFORMATION_MESSAGE);
		guess = Integer.parseInt(guessString);
		isMatch = guess == random;
		JOptionPane.showInputDialog("Your guess was " + (random - guess) + " numbers away from the random number.", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showInputDialog("Your guess was " + random + ". The result is " + isMatch + " . ");
		
		JOptionPane.showInputDialog("Guess a number between 1 and 5.", JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "The number is " + (1 + (int) (Math.random() * 5)));
		
		
		
		
	
	
	
	}

}
