/**
 * 
 */
package switches;
import java.util.Scanner;
/**
 * @author RA316282
 *
 */
public class switchStatementAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int user;
		Scanner input = new Scanner(System.in);	
		
		System.out.print("How old are you? >>>>> ");
		user = input.nextInt();
		switch(user)
		{
		case 18:
			System.out.println("You're 18");
			break;
		case 19:
			System.out.println("You're between 18 and 20.");
			break;
		case 20:
			System.out.println("You're between 19 and 21.");
			break;
		case 21:
			System.out.println("You're between 20 and 22.");
			break;
		case 22:
			System.out.println("You're between 21 and 23.");
			break;
		case 23:
			System.out.println("You're between 22 and 24.");
			break;
		case 24:
			System.out.println("You're between 23 and 25.");
			break;
		case 25:
			System.out.println("You're between 24 and 26.");
			break;
		case 26:
			System.out.println("You're between 25 and 27.");
			break;
		case 27:
			System.out.println("You're between 26 and 28.");
			break;
		case 28:
			System.out.println("You're between 27 and 29.");
			break;
		case 29:
			System.out.println("You're between 28 and 30.");
			break;
		case 30:
			System.out.println("You're between 29 and 31.");
			break;
		case 31:
			System.out.println("You're between 30 and 32.");
			break;
		case 32:
			System.out.println("You're between 31 and 33.");
			break;
		case 33:
			System.out.println("You're between 32 and 34.");
			break;
		case 34:
			System.out.println("You're between 33 and 35.");
			break;
		}
	}
}
