/**
 * 
 */
package question4;
import javax.swing.JOptionPane;


/**
 * @author RA316282
 *
 */
public class question4b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Quarts_To_Gallon = 4;
		String quartsTold;
		int quartsNumber;
		int quartsRemainder;
		int gallonShow;
		
		quartsTold = JOptionPane.showInputDialog(null, "How many quarts would you like sir/Madam", "Dialog 1", JOptionPane.INFORMATION_MESSAGE);
		quartsNumber = Integer.parseInt(quartsTold);
		gallonShow = quartsNumber/Quarts_To_Gallon;
		quartsRemainder = quartsNumber % gallonShow;
		JOptionPane.showInputDialog("A job that needs " + quartsNumber + " quarts requires " + gallonShow + " plus 2 quarts.");
		

	}

}
