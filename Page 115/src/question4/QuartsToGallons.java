package question4;
import java.util.Scanner;
public class QuartsToGallons {

	private static Scanner input;

	public static void main(String[] args) 
	{
		int Quarts_To_Gallon = 4;
		int quartsNeeded;
		int quartsShow;
		int gallonShow;
		input = new Scanner(System.in);
		System.out.print("Enter number of quarts");
		quartsNeeded = input.nextInt();
		gallonShow = quartsNeeded / Quarts_To_Gallon;
		
		quartsShow = quartsNeeded % Quarts_To_Gallon;
		
System.out.println("Number of gallons needed = " + gallonShow + " Quarts left over " + quartsShow);

	}

}