/**
 * 
 */
package Excersises;
import java.util.Scanner;
/**
 * @author RA316282
 *
 */
public class CellPhoneService {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int PlanA;
		int PlanB;
		int PlanC;
		int PlanD;
		int PlanE;
		int PlanF;
		int minUsed;
		int textUsed;
		int dataUsed;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many minutes do you user your cell phone?>>>>");
		minUsed = input.nextInt();
		input.nextLine();
		
		System.out.println("How many texts?>>>>");
		textUsed = input.nextInt();
		input.nextLine();
		
		System.out.println("How much data?>>>>");
		dataUsed = input.nextInt();
		
		if((minUsed < 500 ) && (textUsed == 0 ) && (dataUsed == 0))
		{
			System.out.println("You need plan A");
		}
		
		if((minUsed < 500) && (textUsed > 100000) && (dataUsed == 0))
		{
			System.out.println("You need plan B. It costs $49 a month only!");
		}
		
		if((minUsed > 500) && (textUsed < 100) && (dataUsed == 0))
		{
			System.out.println("You need plan C. It costs $55 a month only!");
		}

		if((minUsed > 500) && (textUsed > 100) && (dataUsed == 0))
		{
			System.out.println("You need plan D. It costs $61 a month only!");
		}
		
		if((minUsed > 500) && (textUsed > 100) && (dataUsed == 0))
		{
			System.out.println("You need plan D. It costs $70 a month only!");
		}
		
		
	}

}
