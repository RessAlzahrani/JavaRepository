/**
 * 
 */
package question5;
import javax.swing.JOptionPane;
/**
 * @author RA316282
 *
 */
public class NauticalMilesInteractive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Answers;
		double numberOfKilometers;
		int numberOfMiles; 
		double numberOfNauticalMiles;
		double KmPerNauticalMiles = 1.852;
		double MilesPerNauticalMiles = 1.150779;
		
		
		
		Answers = JOptionPane.showInputDialog(null, "Enter the number of Nautical Miles you would like to convert ", JOptionPane.QUESTION_MESSAGE);
		numberOfNauticalMiles = Double.parseDouble(Answers);
		
		numberOfKilometers = numberOfNauticalMiles * KmPerNauticalMiles; 
		numberOfMiles = (int) (numberOfNauticalMiles * MilesPerNauticalMiles);
		JOptionPane.showMessageDialog(null, numberOfNauticalMiles + " Nautical Miles equals " + numberOfKilometers + " Km and " + numberOfMiles + " miles. ");
		
	}

}
