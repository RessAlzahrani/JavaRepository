/**
 * 
 */
package Excercises;
import java.util.Scanner;
/**
 * @author RA316282
 *
 */
public class CondoSales {

	/**
	 * @param args
	 */
	
	public static final double PARKVIEW_PRICE = 150000.00;
	public static final double GOLFVIEW_PRICE = 170000.00;
	public static final double LAKEVIEW_PRICE = 210000.00;
	public static final double GARAGE = 5000.00;
	public static final String P = "You selected the Park View Condo with a sales price of ";
	public static final String G = "You selected the Golf View Condo with a sales price of ";
	public static final String L = "You selected the Lake View Condo with a sales price of ";
	public static final String I = "You selected an INVALID response, sales price is set to ";
	static int condoSelection;
	static double salesPrice;
	static int parking;
	static double condoAndParking;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
				Scanner enter = new Scanner(System.in);
				System.out.println("Please enter your condominium selection:\n1 - Park View\n2 - Golf " +
				                   "Course View\n3 - Lake View");
				condoSelection = enter.nextInt();
				boolean invalidResponse = (condoSelection > 3 || condoSelection < 0);
				if (condoSelection == 1)
					{
						salesPrice = PARKVIEW_PRICE;
						System.out.println(P + salesPrice);
					}
				else if (condoSelection == 2)
					{
						salesPrice = GOLFVIEW_PRICE;
						System.out.println(G + salesPrice);
					}
				else if (condoSelection == 3)
					{
						salesPrice = LAKEVIEW_PRICE;
						System.out.println(L + salesPrice);
					}
				else if (invalidResponse)
					{
						salesPrice = 0;
						System.out.println(I + salesPrice);
					}
				if (invalidResponse != true)
					{
						System.out.println("Please select a parking space: \n1 - Garage\n2 - Parking Space: ");
					}
				parking = enter.nextInt();
				boolean invalidParking = (parking > 2 || parking < 0);
				if (parking == 1)
					{
						salesPrice = salesPrice + GARAGE;
						System.out.println("The price of condo with garage is " + salesPrice);
					}
				else if (parking == 2)
					{
						salesPrice = salesPrice;
						System.out.println("The price of condo with parking space is " + salesPrice);
					}
				else if (invalidParking == true)
					{
						System.out.println("You have selected an INVALID response.");
						System.out.println("The price of condo with no garage is " + salesPrice);
					}


	}

}
