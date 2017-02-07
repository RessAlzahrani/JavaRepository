/**
 * 
 */
package OrderingMenu;
import java.util.Scanner;

/**
 * @author RA316282
 *
 */
public class Taco {
	private static Scanner inputDevice;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		tacoTruck();
		menu();
		
		String burritoString, tacoString;
		double tacoPrice = 0.99;
		double tacoOrdered;
		double burritoPrice = 1.99;
		double burritoOrdered;
		double Quesedilla;
		double totalPrice;
		double totalPriceWithTax;
		
		inputDevice = new Scanner(System.in);
		
		System.out.println("How many tacos do you want? >>>> ");
		tacoOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many burritos do you want? >>>> ");
		tacoOrdered = inputDevice. nextDouble();
		inputDevice.nextLine();
		
		totalPrice = (tacoPrice * tacoOrdered) + (burritoOrdered * burritoPrice);
	}
	public static void menu()
	{
		String burrito;
		String Taco;
		double tacoprice = 0.99;
		double tacoOrdered;
		double burritoPrice = 1.99;
		double totalPriceWithTax;
		
		System.out.println("Taco price 0.99");
		System.out.println("Burrito price 1.99");
	}
	
	public static void salesTax ()
	{
		double salesTax = .075;
	}
	public static void tacoTruck()
	{
		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("***                    (                    )                        ***");
		System.out.println("*********************************************************************************************");
		System.out.println("*********************************************************************************************");
		System.out.println("***     TACO           TACO                                                                  ***");
		System.out.println("***             TACO                                                                          ***");
		System.out.println("***     TACO           TACO                                                                   ***");
		System.out.println("***             TACO                                                                           ***");
		System.out.println("***     TACO           TACO                                                                      ***");
		System.out.println("***             TACO                                                                             ***");
		System.out.println("***     TACO           TACO                                                                    ***");
		System.out.println("***                                                                                          ***");
		System.out.println("***                                                                                         ***");
		System.out.println("***                                                                                        ***");
		System.out.println("***                                                                                       ***");
		System.out.println("*********************************************************************************************");
		System.out.println("*********************************************************************************************");
		System.out.println("*********************************************************************************************");
	}

}
