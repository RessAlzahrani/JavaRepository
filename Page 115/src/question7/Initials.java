/**
 * 
 */
package question7;

import javax.swing.JOptionPane;

/**
 * @author ra316282
 *
 */
public class Initials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String initial1;
		String initial2;
		String initial3;
		
		
		initial1 = JOptionPane.showInputDialog("Enter your first initial", JOptionPane.QUESTION_MESSAGE);
		initial2 = JOptionPane.showInputDialog("Enter your middle initial", JOptionPane.QUESTION_MESSAGE);
		initial3 = JOptionPane.showInputDialog("Enter your third initial", JOptionPane.QUESTION_MESSAGE);
        
		JOptionPane.showMessageDialog(null, "Your three initials are: " + initial1 + "." + initial2 + "." + initial3 + ".");
	}

}
