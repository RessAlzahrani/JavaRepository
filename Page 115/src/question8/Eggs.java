/**
 * 
 */
package question8;
import javax.swing.JOptionPane;
/**
 * @author RA316282
 *
 */
public class Eggs 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Number of eggs to buy and the amount left over
		String Answers;
		double dozenEggsCost = 3.25;
		double remainderEggCost = .45;
		int dozenEggs = 12;
		int remainderEgg;
		int numberOfDozenEggs;
		int totalOfEggsOrdered;
		double totalCost;
		
		Answers = JOptionPane.showInputDialog(null, "How many eggs would you like Sir/Madam? ", JOptionPane.QUESTION_MESSAGE);
		totalOfEggsOrdered = Integer.parseInt(Answers);
		
		numberOfDozenEggs = totalOfEggsOrdered / dozenEggs;
		remainderEgg = totalOfEggsOrdered % dozenEggs;
		
		totalCost = numberOfDozenEggs * dozenEggsCost + remainderEgg * remainderEggCost;
		
		JOptionPane.showMessageDialog(null,"You ordered " + totalOfEggsOrdered + " eggs. That's " + numberOfDozenEggs + " dozen at $" + dozenEggsCost + " per dozen and " + remainderEgg + " loose eggs at $" + remainderEggCost + " each for a total of $" + totalCost + " . ");
		
	}

}
