/**
 * 
 */
package YouDoIt;
import java.util.Scanner;
/**
 * @author RA316282
 *
 */
public class MythicalCountry {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double RateOfPay;
		double hoursWorked;
		double overtimePay;
		double regularPay;
		double afterTax;
		final double FULL_WEEK = 35;
		final double OT_RATE = 2;
		final double GovernmentGetsHalf = .5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many hours did you work? ");
		hoursWorked = input.nextDouble();
		
		System.out.println("What is your rate of pay? ");
		RateOfPay = input.nextDouble();
		
		
		if(hoursWorked > FULL_WEEK)
		{
			regularPay = FULL_WEEK * RateOfPay;
			overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * RateOfPay;
			afterTax = overtimePay * GovernmentGetsHalf;
		}
		else
		{
			regularPay = hoursWorked * RateOfPay;
			overtimePay = 0.0;
			afterTax = regularPay * GovernmentGetsHalf;
			
		}
		System.out.println("Regular pay is " + regularPay + "\nOvertime pay is " + overtimePay + "\nAfter tax is " + afterTax);

	}

}
