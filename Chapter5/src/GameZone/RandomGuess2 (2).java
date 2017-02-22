/**
 * 
 */
package GameZone;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 * @author RA316282
 *
 */
public class RandomGuess2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Random r = new Random();
			final int LOW = 100;
			final int HIGH = 1000;
			String msg;
			int result = r.nextInt(10) + LOW; // result is the random number generator integer used.
			int userGuess;
			
			userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH));
			if(userGuess == result)
			{
				msg = "\n Your Guess was  RIGHT!";
			}
				else 
					if(userGuess <result)
						msg = "\n Your guess was too low";
					else 
						msg = "\n Your guess was too high";
			JOptionPane.showMessageDialog(null, "The numbers is " + result + msg);

		}


	}

