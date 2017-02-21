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
public class RandomGuessMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = 9;
		String msg;
		int result = r.nextInt(9) + LOW; // result is the random number generator integer used.
		int result2 = r.nextInt(9) + LOW;
		int result3 = r.nextInt(9) + LOW;
		int Money;
		int userGuess;
		int userGuess2;
		int userGuess3;
		
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my first number between " + LOW + " and " + HIGH));
		userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my second number between " + LOW + " and " + HIGH));
		userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my third number between " + LOW + " and " + HIGH));
		
		
		if(userGuess == result)
		{
			msg = "\n Your first guess was  RIGHT!";
		}
			else 
				if(userGuess <result)
					msg = "\n Your first guess was too low";
				else 
					msg = "\n Your first guess was too high";
		JOptionPane.showMessageDialog(null, "The number is " + result + msg);
		            
		
		if(userGuess2 == result2)
		{
			msg = "\n Your second guess was  RIGHT!";
		}
			else 
				if(userGuess2 <result2)
					msg = "\n Your second guess was too low";
				else 
					msg = "\n Your second guess was too high";
		JOptionPane.showMessageDialog(null, "The number is " + result2 + msg);
		
		
		if(userGuess3 == result3)
		{
			msg = "\n Your third guess was  RIGHT!";
		}
			else 
				if(userGuess <result3)
					msg = "\n Your third guess was too low";
				else 
					msg = "\n Your third guess was too high";
		JOptionPane.showMessageDialog(null, "The number is " + result3 + msg);
		
		
		
		if(userGuess == result || userGuess2 == result2 || userGuess3 == result3)
		{
			msg = "\n CONGRATS! You won $10";
		}
		if ((userGuess == result && userGuess2 == result2) || (userGuess == result && userGuess3 == result3) || (userGuess2 == result2 && userGuess == result) || (userGuess2 == result2 && userGuess3 == result3) || (userGuess3 == result3 && userGuess == result) || (userGuess3 == result3 && userGuess2 == result2)) 
		{
			msg = "\n CONGRATS! You won $100";
		}
		
		if((userGuess == result || userGuess == result2 || userGuess == result3) && (userGuess2 == result || userGuess2 == result2 || userGuess2 == result3) && (userGuess3 == result || userGuess3 == result2 || userGuess3 == result3))
		{
			msg = "\n CONGRATS! You won $1000";
		}
		if(userGuess == result && userGuess2 == result2 && userGuess3 == result3)
		{
			msg = "\n CONGRATS! You won $1000000";
		}			
		if(userGuess != result && userGuess2 != result2 && userGuess3 != result3)
		{
			msg = "Unfortunately, you didnt win anything.";
		}			
		
		JOptionPane.showMessageDialog(null, msg);
		}

	}


