/**
 * 
 */
package RockPaperScissors;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 * @author RA316282
 *
 */
public class RockPaperScissors {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int user;
		int computer;
		String msg = null;
		String userPick;
		String computerPick;
		final int LOW = 0;
		final int HIGH = 2;
		Random r = new Random();
		computer = r.nextInt(2);
		
		user = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the following numbers \n0 for Rock \n1 for Paper \n2 for scissors"));
		
		
		if((user == 0 && computer == 0) || (user == 1 && computer == 1) || (user == 2 && computer == 2))
		{ 
			msg = "Tie";
		}
		
		if(user == 2 && computer == 0)
		{
			msg = "Rock beats scissors, computer is the master";
		}
		
		if(user == 0 && computer == 2)
		{
			msg = "Rock beats scissors, user is the master";
		}
		
		if(user == 1 && computer == 2)
		{
			msg = "Scissors beats paper, computer is the master";
		}
		
		if(user == 2 && computer == 1)
		{
			msg = "Scissors beats paper, user is the master";
		}
		
		if(user == 0 && computer == 1)
		{
			msg = "Paper beats rock, computer is the master";
		}
		
		if(user == 1 && computer == 0)
		{
			msg = "Paper beats rock, user is the master";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	

}
