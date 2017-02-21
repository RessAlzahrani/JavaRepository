/**
 * 
 */
package switches;
import java.util.Scanner;
/**
 * @author RA316282
 *
 */
public class switchDayofWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String day;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a day during the week for yoour schedule? >>>> ");
		day = input.nextLine();
		switch(day)
		{
		case "Monday":
			System.out.print("Reserve room for Friday meeting");
			break;
		case "Tuesday":
			System.out.print("Meeting with Principal. You're FIRED!");
			break;
		case "Wednesday":
			System.out.print("Throw a party");
			break;
		case "Thursday":
			System.out.print("Go out for dinner");
			break;
		case "Friday":
			System.out.print("Sleep in");
			break;
		case "Saturday":
			System.out.print("Cook breakfast for your mom");
			break;
		case "Sunday":
			System.out.print("Study for your test");
			break;
		default:
			System.out.print("That day does not exist to the known realm");
		}
	}

}
