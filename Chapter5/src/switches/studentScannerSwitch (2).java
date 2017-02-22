/**
 * 
 */
package switches;
import javax.swing.JOptionPane;
/**
 * @author RA316282
 *
 */
public class studentScannerSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int studentNumber;
		String studentString;
		
		// Scanner input = new Scanner(System.in);
		
		//System.out.print("Please scan the student ID >>> ");
		//user = in
		
		studentString = (String)JOptionPane.showInputDialog(null, "Please scan the students ID >>>>> ", "Enter User ID #", JOptionPane.QUESTION_MESSAGE, null, null,"");
		studentNumber = Integer.parseInt(studentString);
		
		if (studentNumber >= 100000 || studentNumber <= 4000000)
		{
			switch(studentNumber)
			{
			case 274896:
				JOptionPane.showMessageDialog(null, "The student is Andrew McKenzie.");
				break;
			case 274885:
				JOptionPane.showMessageDialog(null, "The student is Charles Carlstrom.");
				break;
			case 316282:
				JOptionPane.showMessageDialog(null, "The student is Ress Alzahrani.");
				break;
			case 274884:
				JOptionPane.showMessageDialog(null, "The student is Tatyana Vaughn.");
				break;
			case 133778:
				JOptionPane.showMessageDialog(null, "The student is Nick Hasson.");
				break;
			case 131457:
				JOptionPane.showMessageDialog(null, "The student is Kassie Remley");
				break;
			case 137412:
				JOptionPane.showMessageDialog(null, "The student is Sebastian Frick.");
				break;
			case 131147:
				JOptionPane.showMessageDialog(null, "The student is Zach Dorris.");
				break;
			case 274887:
				JOptionPane.showMessageDialog(null, "The student is Chase Kress.");
				break;
			case 133225:
				JOptionPane.showMessageDialog(null, "The student is Isaiah Ponciano");
				break;
			case 137428:
				JOptionPane.showMessageDialog(null, "The student is Mason Hancock.");
			default:
				JOptionPane.showMessageDialog(null, "The number is not available.");
			
			}
		}
	}

}
