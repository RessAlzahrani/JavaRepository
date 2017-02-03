/**
 * 
 */
package HelloName;

import javax.swing.JOptionPane;

/**
 * @author RA316282
 *
 */
public class HelloNameDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String result;
		
		result = JOptionPane.showInputDialog(null, "What is your name?");
	    JOptionPane.showMessageDialog(null, "Hello, " + result + "!");		

	}

}
