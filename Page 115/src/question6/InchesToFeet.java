/**
 * 
 */
package question6;

import javax.swing.JOptionPane;

/**
 * @author RA316282
 *
 */
public class InchesToFeet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Answers;
		double inches;
		double feet;
		double feetPerAnInch = 0.833;
		
		Answers = JOptionPane.showInputDialog(null, "Enter the number of Inches you would like to convert ", JOptionPane.QUESTION_MESSAGE);
		inches = Double.parseDouble(Answers);
		
		feet = feetPerAnInch * inches;
		
		JOptionPane.showMessageDialog(null, inches + " inches equals " + feet + " feet.");
		
		

	}

}
