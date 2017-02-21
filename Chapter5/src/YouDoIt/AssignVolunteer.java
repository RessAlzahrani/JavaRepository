/**
 * 
 */
package YouDoIt;
import java.util.Scanner;
/**
 * @author RA316282
 *
 */
public class AssignVolunteer {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int donationType;
		String volunteer;
		final int CLOTHING_CODE = 1;
		final int OTHER_CODE = 2;
		final String CLOTHING_PRICER = "1";
		final String OTHER_PRICER = "2";
		
		Scanner input = new Scanner (System.in);
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_PRICER + " for clothing, " + OTHER_PRICER + " for anything else...");
		donationType = input.nextInt();
		
		if(donationType == CLOTHING_CODE)
			volunteer = CLOTHING_PRICER;
		else
			volunteer = OTHER_PRICER;
		
		System.out.println("You entered " + donationType);
		System.out.println("The volunteer who will price this item is " + volunteer);
		
		

	}

}
